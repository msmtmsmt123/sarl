/*
 * $Id$
 *
 * File is automatically generated by the Xtext language generator.
 * Do not change it.
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
package io.sarl.lang.codebuilder.builders;

import io.sarl.lang.sarl.SarlEvent;
import io.sarl.lang.sarl.SarlField;
import io.sarl.lang.sarl.SarlScript;
import java.util.function.Predicate;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.util.EmfFormatter;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.compiler.DocumentationAdapter;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

/** Builder of a Sarl XExpression.
 */
@SuppressWarnings("all")
public class ExpressionBuilderImpl extends AbstractBuilder implements IExpressionBuilder {

	private EObject context;

	private Procedure1<XExpression> setter;

	private XExpression expr;

	/** Initialize the expression.
	 * @param context - the context of the expressions.
	 * @param setter - the object that permits to assign the expression to the context.
	 */
	public void eInit(EObject context, Procedure1<XExpression> setter, IJvmTypeProvider typeContext) {
		setTypeResolutionContext(typeContext);
		this.context = context;
		this.setter = setter;
		this.expr = null;
	}

	/** Replies the last created expression.
	 *
	 * @return the last created expression.
	 */
	@Pure
	public XExpression getXExpression() {
		return this.expr;
	}

	/** Replies the resource to which the XExpression is attached.
	 */
	@Pure
	public Resource eResource() {
		return getXExpression().eResource();
	}

	/** Change the expression in the container.
	 *
	 * @param expression - the textual representation of the expression.
	 */
	public void setExpression(String expression) {
		this.expr = fromString(expression);
		this.setter.apply(this.expr);
	}

	/** Change the expression in the container.
	 *
	 * @param expression - the expression.
	 */
	public void setXExpression(XExpression expression) {
		this.expr = expression;
		this.setter.apply(this.expr);
	}

	/** Generate a piece of Sarl code that permits to compile an XExpression.
	 *
	 * @param expression the expression to compile.
	 * @return the Sarl code.
	 */
	static String generateExpressionCode(String expression) {
		return "event ____synthesis { var ____fakefield = " + expression + " }";
	}

	static String generateTypenameCode(String typeName) {
		return "event ____synthesis { var ____fakefield : " + typeName + " }";
	}

	static JvmParameterizedTypeReference parseType(EObject context, String typeName, AbstractBuilder caller) {
		ResourceSet resourceSet = context.eResource().getResourceSet();
		URI uri = caller.computeUnusedUri(resourceSet);
		Resource resource = caller.getResourceFactory().createResource(uri);
		resourceSet.getResources().add(resource);
		try (StringInputStream is = new StringInputStream(generateTypenameCode(typeName))) {
			resource.load(is, null);
			SarlScript script = resource.getContents().isEmpty() ? null : (SarlScript) resource.getContents().get(0);
			SarlEvent topElement = (SarlEvent) script.getXtendTypes().get(0);
			SarlField member = (SarlField) topElement.getMembers().get(0);
			JvmTypeReference reference = member.getType();
			if (reference instanceof JvmParameterizedTypeReference) {
				final JvmParameterizedTypeReference pref = (JvmParameterizedTypeReference) reference;
				if (!pref.getArguments().isEmpty()) {
					EcoreUtil2.resolveAll(resource);
					return pref;
				}
			}
			throw new TypeNotPresentException(typeName, null);
		} catch (Exception exception) {
			throw new TypeNotPresentException(typeName, exception);
		} finally {
			resourceSet.getResources().remove(resource);
		}
	}

	/** Create an expression but does not change the container.
	 *
	 * @param expression - the textual representation of the expression.
	 * @return the expression.
	 */
	@Pure
	protected XExpression fromString(String expression) {
		if (!Strings.isEmpty(expression)) {
			ResourceSet resourceSet = this.context.eResource().getResourceSet();
			URI uri = computeUnusedUri(resourceSet);
			Resource resource = getResourceFactory().createResource(uri);
			resourceSet.getResources().add(resource);
			try (StringInputStream is = new StringInputStream(generateExpressionCode(expression))) {
				resource.load(is, null);
				SarlScript script = resource.getContents().isEmpty() ? null : (SarlScript) resource.getContents().get(0);
				SarlEvent topElement = (SarlEvent) script.getXtendTypes().get(0);
				SarlField member = (SarlField) topElement.getMembers().get(0);
				return member.getInitialValue();
			} catch (Throwable exception) {
				throw new RuntimeException(exception);
			} finally {
				resourceSet.getResources().remove(resource);
			}
		}
		throw new IllegalArgumentException("not a valid expression");
	}

	/** Replies the XExpression for the default value associated to the given type.
	 * @param type - the type for which the default value should be determined.
	 * @return the default value.
	 */
	@Pure
	public XExpression getDefaultXExpressionForType(String type) {
		//TODO: Check if a similar function exists in the Xbase library.
		XExpression expr = null;
		if (type != null && !"void".equals(type) && !Void.class.getName().equals(type)) {
			switch (type) {
			case "boolean":
			case "java.lang.Boolean":
				XBooleanLiteral booleanLiteral = XbaseFactory.eINSTANCE.createXBooleanLiteral();
				booleanLiteral.setIsTrue(false);
				expr = booleanLiteral;
				break;
			case "float":
			case "java.lang.Float":
				XNumberLiteral numberLiteral = XbaseFactory.eINSTANCE.createXNumberLiteral();
				numberLiteral.setValue("0.0f");
				expr = numberLiteral;
				break;
			case "double":
			case "java.lang.Double":
			case "java.lang.BigDecimal":
				numberLiteral = XbaseFactory.eINSTANCE.createXNumberLiteral();
				numberLiteral.setValue("0.0");
				expr = numberLiteral;
				break;
			case "int":
			case "long":
			case "java.lang.Integer":
			case "java.lang.Long":
			case "java.lang.BigInteger":
				numberLiteral = XbaseFactory.eINSTANCE.createXNumberLiteral();
				numberLiteral.setValue("0");
				expr = numberLiteral;
				break;
			case "byte":
			case "short":
			case "char":
			case "java.lang.Byte":
			case "java.lang.Short":
			case "java.lang.Character":
				numberLiteral = XbaseFactory.eINSTANCE.createXNumberLiteral();
				numberLiteral.setValue("0");
				XCastedExpression castExpression = XbaseFactory.eINSTANCE.createXCastedExpression();
				castExpression.setTarget(numberLiteral);
				castExpression.setType(newTypeRef(this.context, type));
				expr = numberLiteral;
				break;
			default:
				expr = XbaseFactory.eINSTANCE.createXNullLiteral();
				break;
			}
		}
		return expr;
	}

	/** Replies the default value for the given type.
	 * @param type - the type for which the default value should be determined.
	 * @return the default value.
	 */
	@Pure
	public String getDefaultValueForType(String type) {
		//TODO: Check if a similar function exists in the Xbase library.
		String defaultValue = "";
		if (!Strings.isEmpty(type) && !"void".equals(type)) {
			switch (type) {
			case "boolean":
				defaultValue = "true";
				break;
			case "double":
				defaultValue = "0.0";
				break;
			case "float":
				defaultValue = "0.0f";
				break;
			case "int":
				defaultValue = "0";
				break;
			case "long":
				defaultValue = "0";
				break;
			case "byte":
				defaultValue = "(0 as byte)";
				break;
			case "short":
				defaultValue = "(0 as short)";
				break;
			case "char":
				defaultValue = "(0 as char)";
				break;
			default:
				defaultValue = "null";
				break;
			}
		}
		return defaultValue;
	}

	/** Change the documentation of the element.
	 *
	 * <p>The documentation will be displayed just before the element.
	 *
	 * @param doc the documentation.
	 */
	public void setDocumentation(String doc) {
		if (Strings.isEmpty(doc)) {
			getXExpression().eAdapters().removeIf(new Predicate<Adapter>() {
				public boolean test(Adapter adapter) {
					return adapter.isAdapterForType(DocumentationAdapter.class);
				}
			});
		} else {
			DocumentationAdapter adapter = (DocumentationAdapter) EcoreUtil.getExistingAdapter(
					getXExpression(), DocumentationAdapter.class);
			if (adapter == null) {
				adapter = new DocumentationAdapter();
				getXExpression().eAdapters().add(adapter);
			}
			adapter.setDocumentation(doc);
		}
	}

	@Override
	@Pure
	public String toString() {
		return EmfFormatter.objToStr(getXExpression());
	}

	/** Create a reference to "this" object or to the current type.
	 *
	 * @return the reference.
	 */
	public XFeatureCall createReferenceToThis() {
		final XExpression expr = getXExpression();
		XtendTypeDeclaration type = EcoreUtil2.getContainerOfType(expr, XtendTypeDeclaration.class);
		JvmType jvmObject = getAssociatedElement(JvmType.class, type, expr.eResource());
		final XFeatureCall thisFeature = XbaseFactory.eINSTANCE.createXFeatureCall();
		thisFeature.setFeature(jvmObject);
		return thisFeature;
	}

	/** Create a reference to "super" object or to the super type.
	 *
	 * @return the reference.
	 */
	public XFeatureCall createReferenceToSuper() {
		final XExpression expr = getXExpression();
		XtendTypeDeclaration type = EcoreUtil2.getContainerOfType(expr, XtendTypeDeclaration.class);
		JvmType jvmObject = getAssociatedElement(JvmType.class, type, expr.eResource());
		final XFeatureCall superFeature = XbaseFactory.eINSTANCE.createXFeatureCall();
		JvmIdentifiableElement feature;
		if (jvmObject instanceof JvmDeclaredType) {
			feature = ((JvmDeclaredType) jvmObject).getExtendedClass().getType();
		} else {
			feature = findType(expr, getQualifiedName(type)).getType();
			if (feature instanceof JvmDeclaredType) {
				feature = ((JvmDeclaredType) feature).getExtendedClass().getType();
			} else {
				feature = null;
			}
		}
		if (feature == null) {
			return null;
		}
		superFeature.setFeature(feature);
		return superFeature;

	}

}

