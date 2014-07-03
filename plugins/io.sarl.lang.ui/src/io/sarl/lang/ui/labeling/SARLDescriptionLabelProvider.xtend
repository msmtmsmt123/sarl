/*
* generated by Xtext
*/
package io.sarl.lang.ui.labeling

import com.google.inject.Inject
import io.sarl.lang.ui.images.SARLImages
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.xbase.ui.labeling.XbaseDescriptionLabelProvider
import org.eclipse.xtext.xtype.XtypePackage

import static io.sarl.lang.sarl.SarlPackage.Literals.*
import io.sarl.lang.sarl.Attribute

//import org.eclipse.xtext.resource.IEObjectDescription

/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class SARLDescriptionLabelProvider extends XbaseDescriptionLabelProvider {

	@Inject
	private var SARLImages images

	override Object image(IEObjectDescription element) {
		var EClass eClass = element.getEClass()
		switch(eClass) {
			case SARL_SCRIPT: {
				return images.forFile
			}
			case XtypePackage::XIMPORT_DECLARATION: {
				images.forImport
			}
			case AGENT: {
				images.forAgent
			}
			case BEHAVIOR: {
				images.forBehavior
			}
			case CAPACITY: {
				images.forCapacity
			}
			case SKILL: {
				images.forSkill
			}
			case EVENT: {
				images.forEvent
			}
			case ATTRIBUTE: {
				var obj = element.EObjectOrProxy
				images.forAttribute(
						(obj===null) ||
						(!(obj instanceof Attribute)) ||
						((obj as Attribute).writeable))
			}
			case CONSTRUCTOR: {
				images.forConstructor(JvmVisibility::PUBLIC, 0)
			}
			case ACTION: {
				images.forAction
			}
			case ACTION_SIGNATURE: {
				images.forActionSignature
			}
			case CAPACITY_USES: {
				images.forCapacityUses
			}
			case REQUIRED_CAPACITY: {
				images.forCapacityRequirements
			}
			case BEHAVIOR_UNIT: {
				images.forBehaviorUnit
			}
			default: {
				super.image(element)
			}
		}
	}

}