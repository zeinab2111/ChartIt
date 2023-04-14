/**
 */
package chartIt;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Index</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute list.
	 * @see chartIt.ChartItPackage#getColumn_Index()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getIndex();

	/**
	 * Returns the value of the '<em><b>New name column</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New name column</em>' attribute list.
	 * @see chartIt.ChartItPackage#getColumn_New_name_column()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getNew_name_column();

} // Column
