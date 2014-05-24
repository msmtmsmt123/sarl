/*
 * Copyright 2014 Sebastian RODRIGUEZ, Nicolas GAUD, Stéphane GALLAND.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.sarl.lang.validation;

/**
 * List of issues codes related to SARL.
 * 
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 */
public class IssueCodes {

	/**
	 */
	protected static final String ISSUE_CODE_PREFIX = "io.sarl.lang.validation.IssueCodes."; //$NON-NLS-1$

	/**
	 * A variadic function cannot have a default value for its variadic parameter.
	 * <p>
	 * The following code is avoid:<pre><code>
	 * def myaction(a : int = 45...) {}
	 * </code></pre>
	 */
	public static final String DEFAULT_VALUE_FOR_VARIADIC_PARAMETER = ISSUE_CODE_PREFIX+"default_value_for_variadic_parameter"; //$NON-NLS-1$
	
	/**
	 * The definitions of two actions are conflicting.
	 * <p>
	 * The following code is avoid:<pre><code>
	 * {
	 *    def myaction(a : int, b : int, c : int)
	 *    def myaction(a : int, b : int, c : int)
	 * }
	 * </code></pre>
	 */
	public static final String ACTION_ALREADY_DEFINED = ISSUE_CODE_PREFIX + "action_already_defined"; //$NON-NLS-1$

	/**
	 * The definitions of two fields are conflicting.
	 * <p>
	 * The following code is avoid:<pre><code>
	 * {
	 *    val myfield
	 *    val myfield
	 * }
	 * </code></pre>
	 */
	public static final String FIELD_ALREADY_DEFINED = ISSUE_CODE_PREFIX + "field_already_defined"; //$NON-NLS-1$

	/**
	 * In a skill, the functions inherited from the capacities must not have
	 * default values.
	 * <p>
	 * The following code is avoid:<pre><code>
	 * capacity C1 {
	 *    def myaction(a : int, b : int=4, c : int)
	 * }
	 * skill S1 extends C1 {
	 *     def myaction(a : int, b : int=4, c : int) {}
	 * }
	 * </code></pre>
	 * The skill must be written as:<pre><code>
	 * skill S1 extends C1 {
	 *     def myaction(a : int, b : int, c : int) {}
	 * }
	 * </code></pre>
	 */
	public static final String INVALID_CAPACITY_ACTION_IMPLENTATION = ISSUE_CODE_PREFIX+"invalid_capacity_action_implementation"; //$NON-NLS-1$

	/**
	 * Some names for actions are prohibited, eg. the action names starting with
	 * "_handle_" are restricted to the event handlers that are generated.
	 * <p>
	 * The following code is avoid:<pre><code>
	 * behavior B1 {
	 *    def _handle_myaction(a : int, b : int=4, c : int)
	 * }
	 * </code></pre>
	 * </code></pre>
	 */
	public static final String INVALID_ACTION_NAME = ISSUE_CODE_PREFIX+"invalid_action_name"; //$NON-NLS-1$

	/**
	 * Some names for attributes are prohibited, eg. the attribute names starting with
	 * "___FORMAL_PARAMETER_DEFAULT_VALUE_" are restricted to the default values for
	 * the formal parameters of the actions.
	 * <p>
	 * The following code is avoid:<pre><code>
	 * behavior B1 {
	 *    var ___FORMAL_PARAMETER_DEFAULT_VALUE_MYFIELD = 3
	 * }
	 * </code></pre>
	 * </code></pre>
	 */
	public static final String INVALID_ATTRIBUTE_NAME = ISSUE_CODE_PREFIX+"invalid_attribute_name"; //$NON-NLS-1$

	/**
	 * A field is hiding an inherited field.
	 * <p>
	 * The following code causes a warning:<pre><code>
	 * behavior B1 {
	 *    var myfield
	 * }
	 * behavior B2 extends B1 {
	 *    var myfield
	 * }
	 * </code></pre>
	 * </code></pre>
	 */
	public static final String FIELD_NAME_SHADOWING = ISSUE_CODE_PREFIX+"field_name_shadowing"; //$NON-NLS-1$

	/**
	 * An interface is implemented, but it is already implemented by the super type,
	 * or inherited by another interface.
	 */
	public static final String REDUNDANT_INTERFACE_IMPLEMENTATION = ISSUE_CODE_PREFIX+"redundant_interface_implementation"; //$NON-NLS-1$

	/**
	/**
	 * It is not allowed to override a final type.
	 */
	public static final String FINAL_TYPE_EXTENSION = ISSUE_CODE_PREFIX+"final_type_extension"; //$NON-NLS-1$

}