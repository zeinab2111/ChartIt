/**
 */
package chartIt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chartIt.Column#getIndex <em>Index</em>}</li>
 *   <li>{@link chartIt.Column#getNew_name_column <em>New name column</em>}</li>
 * </ul>
 *
 * @see chartIt.ChartItPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see chartIt.ChartItPackage#getColumn_Index()
	 * @model required="true"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link chartIt.Column#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>New name column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New name column</em>' attribute.
	 * @see #setNew_name_column(String)
	 * @see chartIt.ChartItPackage#getColumn_New_name_column()
	 * @model required="true"
	 * @generated
	 */
	String getNew_name_column();

	/**
	 * Sets the value of the '{@link chartIt.Column#getNew_name_column <em>New name column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New name column</em>' attribute.
	 * @see #getNew_name_column()
	 * @generated
	 */
	void setNew_name_column(String value);

} // Column
