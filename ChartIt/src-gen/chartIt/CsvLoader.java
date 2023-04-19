/**
 */
package chartIt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csv Loader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chartIt.CsvLoader#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see chartIt.ChartItPackage#getCsvLoader()
 * @model
 * @generated
 */
public interface CsvLoader extends Function {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see chartIt.ChartItPackage#getCsvLoader_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link chartIt.CsvLoader#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // CsvLoader
