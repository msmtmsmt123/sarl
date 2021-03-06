/*
 * $Id$
 *
 * SARL is an general-purpose agent programming language.
 * More details on http://www.sarl.io
 *
 * Copyright (C) 2014-2017 the original authors or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.sarl.lang.jvmmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.util.JavaVersion;
import org.eclipse.xtext.xbase.compiler.GeneratorConfig;
import org.eclipse.xtext.xbase.compiler.IGeneratorConfigProvider;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

import io.sarl.lang.SARLVersion;
import io.sarl.lang.compiler.GeneratorConfig2;
import io.sarl.lang.compiler.IGeneratorConfigProvider2;
import io.sarl.lang.sarl.SarlBehaviorUnit;
import io.sarl.lang.sarl.actionprototype.ActionParameterTypes;
import io.sarl.lang.sarl.actionprototype.ActionPrototype;

/** Describe generation context.
 *
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 */
abstract class GenerationContext {

	private final String identifier;

	/** Compute serial number for serializable objects.
	 */
	private long serial = 1L;

	/** Index of the late generated action.
	 */
	private int actionIndex;

	/** Index of the late generated behavior unit.
	 */
	private int behaviorUnitIndex;

	/** Index of the late generated localType.
	 */
	private int localTypeIndex;

	/** Set of capacities for which a capacuty-use field was generated.
	 */
	private final Set<String> generatedCapacityUseFields = CollectionLiterals.<String>newHashSet();

	/** collection of the generated constructors.
	 */
	private final Map<ActionParameterTypes, JvmConstructor> generatedConstructors = CollectionLiterals.newTreeMap(null);

	/** Collection of the inherited final operations.
	 */
	private final Map<ActionPrototype, JvmOperation> finalOperations = CollectionLiterals.newTreeMap(null);

	/** Collection of the inherited overridable operations.
	 */
	private final Map<ActionPrototype, JvmOperation>  overridableOperations = CollectionLiterals.newTreeMap(null);

	/** Collection of the inherited operations that have not been implemented.
	 */
	private final Map<ActionPrototype, JvmOperation>  operationsToImplement = CollectionLiterals.newTreeMap(null);

	/** List of elements that must be generated at the end of the generation process.
	 */
	private final List<Runnable> preFinalization = CollectionLiterals.newLinkedList();

	/** List of elements that must be generated after the generation process.
	 */
	private final List<Runnable> postFinalization = CollectionLiterals.newLinkedList();

	/** Guard evaluators to generate. The keys are the event identifiers. The values are the code snipsets for
	 * evaluating guards and returning the event handler runnables.
	 */
	private final Map<String, Pair<SarlBehaviorUnit, Collection<Procedure1<? super ITreeAppendable>>>> guardEvaluators
			= CollectionLiterals.newHashMap();

	/** The context object.
	 */
	private final EObject contextObject;

	/** The provider of generation configuration.
	 */
	@Inject
	private IGeneratorConfigProvider generatorConfigProvider;

	/** The provider of generation configuration v2.
	 */
	@Inject
	private IGeneratorConfigProvider2 generatorConfigProvider2;

	/** Buffering the current generator configuration.
	 */
	private GeneratorConfig generatorConfig;

	/** Buffering the current generator configuration v2.
	 */
	private GeneratorConfig2 generatorConfig2;

	/** Parent context.
	 */
	private GenerationContext parent;

	/** Construct a information about the generation.
	 *
	 * @param owner the object for which the context is created.
	 * @param identifier the identifier of the type for which the context is opened.
	 */
	GenerationContext(EObject owner, String identifier) {
		this.identifier = identifier;
		this.contextObject = owner;
	}

	@Override
	public String toString() {
		return "Generation context for: " + getTypeIdentifier(); //$NON-NLS-1$
	}

	/** Replies the parent context if any.
	 *
	 * @return the parent context or {@code null}.
	 * @since 0.5
	 */
	public GenerationContext getParentContext() {
		return this.parent;
	}

	/** Change the parent context if any.
	 *
	 * @param parent the parent context or {@code null}.
	 * @since 0.5
	 */
	public void setParentContext(GenerationContext parent) {
		this.parent = parent;
	}

	/** Replies the identifier of the associated type.
	 *
	 * @return the identifier of the context's type.
	 */
	public String getTypeIdentifier() {
		return this.identifier;
	}

	/** Replies the generator configuration.
	 *
	 * @return the configuration.
	 */
	public GeneratorConfig getGeneratorConfig() {
		if (this.generatorConfig == null) {
			this.generatorConfig = this.generatorConfigProvider.get(
					EcoreUtil.getRootContainer(this.contextObject));
		}
		return this.generatorConfig;
	}

	/** Replies the generator configuration v2.
	 *
	 * @return the configuration.
	 */
	public GeneratorConfig2 getGeneratorConfig2() {
		if (this.generatorConfig2 == null) {
			this.generatorConfig2 = this.generatorConfigProvider2.get(
					EcoreUtil.getRootContainer(this.contextObject));
		}
		return this.generatorConfig2;
	}

	/** Replies the guard evaluation code for the given event.
	 *
	 * @return the guard evaluators.
	 */
	public Collection<Pair<SarlBehaviorUnit, Collection<Procedure1<? super ITreeAppendable>>>>
			getGuardEvaluationCodes() {
		return this.guardEvaluators.values();
	}

	/** Replies the guard evaluation code for the given event.
	 *
	 * @param source the source of the guard evaluation.
	 * @return the guard evaluators.
	 */
	public Collection<Procedure1<? super ITreeAppendable>> getGuardEvalationCodeFor(SarlBehaviorUnit source) {
		assert source != null;
		final String id = source.getName().getIdentifier();
		final Collection<Procedure1<? super ITreeAppendable>> evaluators;
		final Pair<SarlBehaviorUnit, Collection<Procedure1<? super ITreeAppendable>>> pair = this.guardEvaluators.get(id);
		if (pair == null) {
			evaluators = new ArrayList<>();
			this.guardEvaluators.put(id, new Pair<>(source, evaluators));
		} else {
			evaluators = pair.getValue();
			assert evaluators != null;
		}
		return evaluators;
	}

	/** Replies the computed serial number.
	 *
	 * @return the serial number.
	 */
	public long getSerial() {
		return this.serial;
	}

	/** Increment the serial number by the given ammount.
	 *
	 * @param value the value to add to the serial number.
	 */
	public void incrementSerial(long value) {
		this.serial += value;
	}

	/** Replies if a constructor is generated.
	 *
	 * @return <code>true</code> if the constructor is generated; <code>false</code> if created.
	 */
	public boolean hasConstructor() {
		return !this.generatedConstructors.isEmpty();
	}

	/** Add a generated constructor into the context.
	 *
	 * @param parameters the specification of the parameters of the constructor.
	 * @param jvmElement the generated element.
	 */
	public void addGeneratedConstructor(ActionParameterTypes parameters, JvmConstructor jvmElement) {
		this.generatedConstructors.put(parameters, jvmElement);
	}

	/** Replies the collection of the generated constructor.
	 *
	 * @return the original collection of constructors.
	 */
	public Map<ActionParameterTypes, JvmConstructor> getGeneratedConstructors() {
		return this.generatedConstructors;
	}

	/** Add a capacity for which a capacity-use field is generated.
	 *
	 * @param capacity the identifier of the capacity.
	 */
	public void addGeneratedCapacityUseField(String capacity) {
		this.generatedCapacityUseFields.add(capacity);
	}

	/** Replies the capacities for which capacity-use fields are generated.
	 *
	 * @return the capacity identifiers.
	 */
	public Set<String> getGeneratedCapacityUseFields() {
		return this.generatedCapacityUseFields;
	}

	/** Replies the collection of the inherited final operations.
	 *
	 * @return the original collection of operations.
	 */
	public Map<ActionPrototype, JvmOperation> getInheritedFinalOperations() {
		return this.finalOperations;
	}

	/** Replies the collection of the inherited overridable operations.
	 *
	 * @return the original collection of operations.
	 */
	public Map<ActionPrototype, JvmOperation> getInheritedOverridableOperations() {
		return this.overridableOperations;
	}

	/** Replies the collection of the inherited operations that are not yet implemented.
	 *
	 * @return the original collection of operations.
	 */
	public Map<ActionPrototype, JvmOperation> getInheritedOperationsToImplement() {
		return this.operationsToImplement;
	}

	/** Replies the collection of the elements that must be generated at the end of
	 * the generation process.
	 *
	 * <p>The differed generation element are the element's components that should be
	 * created after all the elements from the SARL input. The runnable codes
	 * are run at the end of the JVM element generation.
	 *
	 * @return the original collection of elements.
	 * @since 0.5
	 */
	public List<Runnable> getPreFinalizationElements() {
		return this.preFinalization;
	}

	/** Replies the collection of the elements that must be generated after
	 * the generation process of the current SARL element.
	 *
	 * <p>The differed generation element are the element's components that could be
	 * generated after the complete JVM type is generated. They are extended the
	 * JVM type definition with additionnal elements (annotations...)
	 *
	 * @return the original collection of elements.
	 * @since 0.5
	 */
	public List<Runnable> getPostFinalizationElements() {
		final GenerationContext prt = getParentContext();
		if (prt != null) {
			return prt.getPostFinalizationElements();
		}
		return this.postFinalization;
	}

	/** Replies the index of the late created action.
	 *
	 * @return the index.
	 */
	public int getActionIndex() {
		return this.actionIndex;
	}

	/** Set the index of the late created action.
	 *
	 * @param index the index.
	 */
	public void setActionIndex(int index) {
		this.actionIndex = index;
	}

	/** Replies the index of the last created behavior unit.
	 *
	 * @return the index
	 */
	public int getBehaviorUnitIndex() {
		return this.behaviorUnitIndex;
	}

	/** Replies the index of the last created behavior unit.
	 *
	 * @param index the index.
	 */
	public void setBehaviorUnitIndex(int index) {
		this.behaviorUnitIndex = index;
	}

	/** Replies the index of the late created local type.
	 *
	 * @return the index.
	 */
	public int getLocalTypeIndex() {
		return this.localTypeIndex;
	}

	/** Set the index of the late created local type.
	 *
	 * @param index the index.
	 */
	public void setLocalTypeIndex(int index) {
		this.localTypeIndex = index;
	}


	/** Replies if the given member is supported in the current context.
	 *
	 * @param member the member to test.
	 * @return <code>true</code> if the member is supported, <code>false</code> for ignoring it.
	 */
	public abstract boolean isSupportedMember(XtendMember member);

	/** Replies if the compiler is using Java8 or higher.
	 *
	 * @return <code>true</code> if the compiler uses Java8 or higher. Otherwise <code>false</code>.
	 */
	public boolean isAtLeastJava8() {
		final JavaVersion javaVersion = JavaVersion.fromQualifier(SARLVersion.MINIMAL_JDK_VERSION);
		return javaVersion != null && getGeneratorConfig().getJavaSourceVersion().isAtLeast(javaVersion);
	}

}
