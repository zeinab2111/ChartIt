/**
 */
package chartIt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Filtering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chartIt.DataFiltering#getColumn_filter <em>Column filter</em>}</li>
 *   <li>{@link chartIt.DataFiltering#getRowfilter_condition <em>Rowfilter condition</em>}</li>
 * </ul>
 *
 * @see chartIt.ChartItPackage#getDataFiltering()
 * @model
 * @generated
 */
public interface DataFiltering extends Function {
	/**
	 * Returns the value of the '<em><b>Column filter</b></em>' containment reference list.
	 * The list contents are of type {@link chartIt.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column filter</em>' containment reference list.
	 * @see chartIt.ChartItPackage#getDataFiltering_Column_filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getColumn_filter();

	/**
	 * Returns the value of the '<em><b>Rowfilter condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowfilter condition</em>' containment reference.
	 * @see #setRowfilter_condition(RowFilter)
	 * @see chartIt.ChartItPackage#getDataFiltering_Rowfilter_condition()
	 * @model containment="true"
	 * @generated
	 */
	RowFilter getRowfilter_condition();

	/**
	 * Sets the value of the '{@link chartIt.DataFiltering#getRowfilter_condition <em>Rowfilter condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowfilter condition</em>' containment reference.
	 * @see #getRowfilter_condition()
	 * @generated
	 */
	void setRowfilter_condition(RowFilter value);

} // DataFiltering
