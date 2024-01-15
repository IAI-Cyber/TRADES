/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     ELTA Ltd - initial API and implementation
 * 
 */
package dsm.TRADES;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Security Objective ENUM</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dsm.TRADES.TRADESPackage#getSecurityObjectiveENUM()
 * @model
 * @generated
 */
public enum SecurityObjectiveENUM implements Enumerator {
	/**
	 * The '<em><b>Confidentiality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIDENTIALITY(0, "Confidentiality", "Confidentiality"),

	/**
	 * The '<em><b>Availiability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILIABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILIABILITY(1, "Availiability", "Availiability"),

	/**
	 * The '<em><b>Integrity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRITY_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRITY(2, "Integrity", "Integrity"),

	/**
	 * The '<em><b>Authenticity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICITY_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHENTICITY(3, "Authenticity", "Authenticity"),

	/**
	 * The '<em><b>Non Repudiation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_REPUDIATION_VALUE
	 * @generated
	 * @ordered
	 */
	NON_REPUDIATION(4, "NonRepudiation", "NonRepudiation"),

	/**
	 * The '<em><b>Reliability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELIABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	RELIABILITY(5, "Reliability", "Reliability"),

	/**
	 * The '<em><b>Accountability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNTABILITY(6, "Accountability", "Accountability"),

	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(7, "Undefined", "Undefined");

	/**
	 * The '<em><b>Confidentiality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY
	 * @model name="Confidentiality"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIALITY_VALUE = 0;

	/**
	 * The '<em><b>Availiability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILIABILITY
	 * @model name="Availiability"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILIABILITY_VALUE = 1;

	/**
	 * The '<em><b>Integrity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRITY
	 * @model name="Integrity"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRITY_VALUE = 2;

	/**
	 * The '<em><b>Authenticity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICITY
	 * @model name="Authenticity"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHENTICITY_VALUE = 3;

	/**
	 * The '<em><b>Non Repudiation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_REPUDIATION
	 * @model name="NonRepudiation"
	 * @generated
	 * @ordered
	 */
	public static final int NON_REPUDIATION_VALUE = 4;

	/**
	 * The '<em><b>Reliability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELIABILITY
	 * @model name="Reliability"
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_VALUE = 5;

	/**
	 * The '<em><b>Accountability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTABILITY
	 * @model name="Accountability"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTABILITY_VALUE = 6;

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="Undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 7;

	/**
	 * An array of all the '<em><b>Security Objective ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SecurityObjectiveENUM[] VALUES_ARRAY = new SecurityObjectiveENUM[] { CONFIDENTIALITY,
			AVAILIABILITY, INTEGRITY, AUTHENTICITY, NON_REPUDIATION, RELIABILITY, ACCOUNTABILITY, UNDEFINED, };

	/**
	 * A public read-only list of all the '<em><b>Security Objective ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SecurityObjectiveENUM> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Security Objective ENUM</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityObjectiveENUM get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityObjectiveENUM result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Objective ENUM</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityObjectiveENUM getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityObjectiveENUM result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Objective ENUM</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityObjectiveENUM get(int value) {
		switch (value) {
		case CONFIDENTIALITY_VALUE:
			return CONFIDENTIALITY;
		case AVAILIABILITY_VALUE:
			return AVAILIABILITY;
		case INTEGRITY_VALUE:
			return INTEGRITY;
		case AUTHENTICITY_VALUE:
			return AUTHENTICITY;
		case NON_REPUDIATION_VALUE:
			return NON_REPUDIATION;
		case RELIABILITY_VALUE:
			return RELIABILITY;
		case ACCOUNTABILITY_VALUE:
			return ACCOUNTABILITY;
		case UNDEFINED_VALUE:
			return UNDEFINED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SecurityObjectiveENUM(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //SecurityObjectiveENUM
