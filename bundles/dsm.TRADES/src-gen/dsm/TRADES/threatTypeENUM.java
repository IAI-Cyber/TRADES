/**
 */
package dsm.TRADES;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>threat Type ENUM</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dsm.TRADES.TRADESPackage#getthreatTypeENUM()
 * @model
 * @generated
 */
public enum threatTypeENUM implements Enumerator {
	/**
	 * The '<em><b>Concrete Threat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCRETE_THREAT_VALUE
	 * @generated
	 * @ordered
	 */
	CONCRETE_THREAT(0, "ConcreteThreat", "ConcreteThreat"),

	/**
	 * The '<em><b>Conceptual Threat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPTUAL_THREAT_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPTUAL_THREAT(1, "ConceptualThreat", "ConceptualThreat");

	/**
	 * The '<em><b>Concrete Threat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Concrete Threat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCRETE_THREAT
	 * @model name="ConcreteThreat"
	 * @generated
	 * @ordered
	 */
	public static final int CONCRETE_THREAT_VALUE = 0;

	/**
	 * The '<em><b>Conceptual Threat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conceptual Threat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCEPTUAL_THREAT
	 * @model name="ConceptualThreat"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPTUAL_THREAT_VALUE = 1;

	/**
	 * An array of all the '<em><b>threat Type ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final threatTypeENUM[] VALUES_ARRAY = new threatTypeENUM[] { CONCRETE_THREAT, CONCEPTUAL_THREAT, };

	/**
	 * A public read-only list of all the '<em><b>threat Type ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<threatTypeENUM> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>threat Type ENUM</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static threatTypeENUM get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			threatTypeENUM result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>threat Type ENUM</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static threatTypeENUM getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			threatTypeENUM result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>threat Type ENUM</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static threatTypeENUM get(int value) {
		switch (value) {
		case CONCRETE_THREAT_VALUE:
			return CONCRETE_THREAT;
		case CONCEPTUAL_THREAT_VALUE:
			return CONCEPTUAL_THREAT;
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
	private threatTypeENUM(int value, String name, String literal) {
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

} //threatTypeENUM
