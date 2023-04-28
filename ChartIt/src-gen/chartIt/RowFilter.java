/**
 */
package chartIt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chartIt.RowFilter#getColumn_name <em>Column name</em>}</li>
 *   <li>{@link chartIt.RowFilter#getOperator <em>Operator</em>}</li>
 *   <li>{@link chartIt.RowFilter#getInt_value <em>Int value</em>}</li>
 *   <li>{@link chartIt.RowFilter#getString_value <em>String value</em>}</li>
 * </ul>
 *
 * @see chartIt.ChartItPackage#getRowFilter()
 * @model
 * @generated
 */
public interface RowFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column name</em>' attribute.
	 * @see #setColumn_name(String)
	 * @see chartIt.ChartItPackage#getRowFilter_Column_name()
	 * @model required="true"
	 * @generated
	 */
	String getColumn_name();

	/**
	 * Sets the value of the '{@link chartIt.RowFilter#getColumn_name <em>Column name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column name</em>' attribute.
	 * @see #getColumn_name()
	 * @generated
	 */
	void setColumn_name(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link chartIt.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see chartIt.Operator
	 * @see #setOperator(Operator)
	 * @see chartIt.ChartItPackage#getRowFilter_Operator()
	 * @model required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link chartIt.RowFilter#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see chartIt.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Int value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int value</em>' attribute.
	 * @see #setInt_value(int)
	 * @see chartIt.ChartItPackage#getRowFilter_Int_value()
	 * @model
	 * @generated
	 */
	int getInt_value();

	/**
	 * Sets the value of the '{@link chartIt.RowFilter#getInt_value <em>Int value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int value</em>' attribute.
	 * @see #getInt_value()
	 * @generated
	 */
	void setInt_value(int value);

	/**
	 * Returns the value of the '<em><b>String value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String value</em>' attribute.
	 * @see #setString_value(String)
	 * @see chartIt.ChartItPackage#getRowFilter_String_value()
	 * @model
	 * @generated
	 */
	String getString_value();

	/**
	 * Sets the value of the '{@link chartIt.RowFilter#getString_value <em>String value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String value</em>' attribute.
	 * @see #getString_value()
	 * @generated
	 */
	void setString_value(String value);

} // RowFilter
