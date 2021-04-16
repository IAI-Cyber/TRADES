/**
 * 
 *  Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      ELTA Ltd - initial API and implementation
 *  
 * 
 */
package dsm.oscal.model.OscalCatalogCommon.impl;

import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage;
import dsm.oscal.model.OscalCatalogCommon.ParameterSelection;

import dsm.oscal.model.OscalMetadata.impl.OscalElementCustomImpl;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterSelectionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterSelectionImpl#getHowMany <em>How Many</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterSelectionImpl extends OscalElementCustomImpl implements ParameterSelection {
	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<MarkupLine> choice;

	/**
	 * The default value of the '{@link #getHowMany() <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowMany()
	 * @generated
	 * @ordered
	 */
	protected static final String HOW_MANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHowMany() <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowMany()
	 * @generated
	 * @ordered
	 */
	protected String howMany = HOW_MANY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalCatalogCommonPackage.Literals.PARAMETER_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHowMany() {
		return howMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHowMany(String newHowMany) {
		String oldHowMany = howMany;
		howMany = newHowMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PARAMETER_SELECTION__HOW_MANY, oldHowMany, howMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupLine> getChoice() {
		if (choice == null) {
			choice = new EDataTypeUniqueEList<MarkupLine>(MarkupLine.class, this, OscalCatalogCommonPackage.PARAMETER_SELECTION__CHOICE);
		}
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OscalCatalogCommonPackage.PARAMETER_SELECTION__CHOICE:
				return getChoice();
			case OscalCatalogCommonPackage.PARAMETER_SELECTION__HOW_MANY:
				return getHowMany();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OscalCatalogCommonPackage.PARAMETER_SELECTION__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends MarkupLine>)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER_SELECTION__HOW_MANY:
				setHowMany((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OscalCatalogCommonPackage.PARAMETER_SELECTION__CHOICE:
				getChoice().clear();
				return;
			case OscalCatalogCommonPackage.PARAMETER_SELECTION__HOW_MANY:
				setHowMany(HOW_MANY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OscalCatalogCommonPackage.PARAMETER_SELECTION__CHOICE:
				return choice != null && !choice.isEmpty();
			case OscalCatalogCommonPackage.PARAMETER_SELECTION__HOW_MANY:
				return HOW_MANY_EDEFAULT == null ? howMany != null : !HOW_MANY_EDEFAULT.equals(howMany);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (choice: ");
		result.append(choice);
		result.append(", howMany: ");
		result.append(howMany);
		result.append(')');
		return result.toString();
	}

} //ParameterSelectionImpl
