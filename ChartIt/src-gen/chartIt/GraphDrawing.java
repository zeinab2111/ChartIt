/**
 */
package chartIt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Drawing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chartIt.GraphDrawing#getGraph_type <em>Graph type</em>}</li>
 *   <li>{@link chartIt.GraphDrawing#getAbs_column <em>Abs column</em>}</li>
 *   <li>{@link chartIt.GraphDrawing#getOrd_column <em>Ord column</em>}</li>
 *   <li>{@link chartIt.GraphDrawing#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see chartIt.ChartItPackage#getGraphDrawing()
 * @model
 * @generated
 */
public interface GraphDrawing extends Function {
	/**
	 * Returns the value of the '<em><b>Graph type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph type</em>' attribute.
	 * @see #setGraph_type(String)
	 * @see chartIt.ChartItPackage#getGraphDrawing_Graph_type()
	 * @model required="true"
	 * @generated
	 */
	String getGraph_type();

	/**
	 * Sets the value of the '{@link chartIt.GraphDrawing#getGraph_type <em>Graph type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph type</em>' attribute.
	 * @see #getGraph_type()
	 * @generated
	 */
	void setGraph_type(String value);

	/**
	 * Returns the value of the '<em><b>Abs column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs column</em>' attribute.
	 * @see #setAbs_column(String)
	 * @see chartIt.ChartItPackage#getGraphDrawing_Abs_column()
	 * @model required="true"
	 * @generated
	 */
	String getAbs_column();

	/**
	 * Sets the value of the '{@link chartIt.GraphDrawing#getAbs_column <em>Abs column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abs column</em>' attribute.
	 * @see #getAbs_column()
	 * @generated
	 */
	void setAbs_column(String value);

	/**
	 * Returns the value of the '<em><b>Ord column</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ord column</em>' attribute list.
	 * @see chartIt.ChartItPackage#getGraphDrawing_Ord_column()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getOrd_column();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute list.
	 * @see chartIt.ChartItPackage#getGraphDrawing_Label()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getLabel();

} // GraphDrawing
