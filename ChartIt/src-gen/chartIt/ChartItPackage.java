/**
 */
package chartIt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see chartIt.ChartItFactory
 * @model kind="package"
 * @generated
 */
public interface ChartItPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chartIt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/chartIt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chartIt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChartItPackage eINSTANCE = chartIt.impl.ChartItPackageImpl.init();

	/**
	 * The meta object id for the '{@link chartIt.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartIt.impl.NamedElementImpl
	 * @see chartIt.impl.ChartItPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chartIt.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartIt.impl.ProgramImpl
	 * @see chartIt.impl.ChartItPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FUNCTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ID = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chartIt.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartIt.impl.FunctionImpl
	 * @see chartIt.impl.ChartItPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chartIt.impl.CsvLoaderImpl <em>Csv Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartIt.impl.CsvLoaderImpl
	 * @see chartIt.impl.ChartItPackageImpl#getCsvLoader()
	 * @generated
	 */
	int CSV_LOADER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOADER__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOADER__PATH = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Csv Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOADER_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Csv Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_LOADER_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chartIt.impl.DataFilteringImpl <em>Data Filtering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartIt.impl.DataFilteringImpl
	 * @see chartIt.impl.ChartItPackageImpl#getDataFiltering()
	 * @generated
	 */
	int DATA_FILTERING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Column filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__COLUMN_FILTER = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rowfilter condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__ROWFILTER_CONDITION = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chartIt.impl.GraphDrawingImpl <em>Graph Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartIt.impl.GraphDrawingImpl
	 * @see chartIt.impl.ChartItPackageImpl#getGraphDrawing()
	 * @generated
	 */
	int GRAPH_DRAWING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DRAWING__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Graph type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DRAWING__GRAPH_TYPE = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abs column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DRAWING__ABS_COLUMN = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ord column</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DRAWING__ORD_COLUMN = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DRAWING__LABELS = FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Graph Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DRAWING_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Graph Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_DRAWING_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link chartIt.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartIt.impl.ColumnImpl
	 * @see chartIt.impl.ChartItPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 6;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__INDEX = 0;

	/**
	 * The feature id for the '<em><b>New name column</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NEW_NAME_COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chartIt.impl.RowFilterImpl <em>Row Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartIt.impl.RowFilterImpl
	 * @see chartIt.impl.ChartItPackageImpl#getRowFilter()
	 * @generated
	 */
	int ROW_FILTER = 7;

	/**
	 * The feature id for the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FILTER__COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FILTER__OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Int value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FILTER__INT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>String value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FILTER__STRING_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Row Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FILTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Row Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chartIt.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chartIt.Operator
	 * @see chartIt.impl.ChartItPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 8;

	/**
	 * Returns the meta object for class '{@link chartIt.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see chartIt.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link chartIt.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chartIt.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link chartIt.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see chartIt.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link chartIt.Program#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see chartIt.Program#getFunctions()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Functions();

	/**
	 * Returns the meta object for the attribute '{@link chartIt.Program#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see chartIt.Program#getId()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Id();

	/**
	 * Returns the meta object for class '{@link chartIt.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see chartIt.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link chartIt.CsvLoader <em>Csv Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Csv Loader</em>'.
	 * @see chartIt.CsvLoader
	 * @generated
	 */
	EClass getCsvLoader();

	/**
	 * Returns the meta object for the attribute '{@link chartIt.CsvLoader#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see chartIt.CsvLoader#getPath()
	 * @see #getCsvLoader()
	 * @generated
	 */
	EAttribute getCsvLoader_Path();

	/**
	 * Returns the meta object for class '{@link chartIt.DataFiltering <em>Data Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Filtering</em>'.
	 * @see chartIt.DataFiltering
	 * @generated
	 */
	EClass getDataFiltering();

	/**
	 * Returns the meta object for the containment reference list '{@link chartIt.DataFiltering#getColumn_filter <em>Column filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column filter</em>'.
	 * @see chartIt.DataFiltering#getColumn_filter()
	 * @see #getDataFiltering()
	 * @generated
	 */
	EReference getDataFiltering_Column_filter();

	/**
	 * Returns the meta object for the containment reference '{@link chartIt.DataFiltering#getRowfilter_condition <em>Rowfilter condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rowfilter condition</em>'.
	 * @see chartIt.DataFiltering#getRowfilter_condition()
	 * @see #getDataFiltering()
	 * @generated
	 */
	EReference getDataFiltering_Rowfilter_condition();

	/**
	 * Returns the meta object for class '{@link chartIt.GraphDrawing <em>Graph Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Drawing</em>'.
	 * @see chartIt.GraphDrawing
	 * @generated
	 */
	EClass getGraphDrawing();

	/**
	 * Returns the meta object for the attribute '{@link chartIt.GraphDrawing#getGraph_type <em>Graph type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph type</em>'.
	 * @see chartIt.GraphDrawing#getGraph_type()
	 * @see #getGraphDrawing()
	 * @generated
	 */
	EAttribute getGraphDrawing_Graph_type();

	/**
	 * Returns the meta object for the attribute '{@link chartIt.GraphDrawing#getAbs_column <em>Abs column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abs column</em>'.
	 * @see chartIt.GraphDrawing#getAbs_column()
	 * @see #getGraphDrawing()
	 * @generated
	 */
	EAttribute getGraphDrawing_Abs_column();

	/**
	 * Returns the meta object for the attribute list '{@link chartIt.GraphDrawing#getOrd_column <em>Ord column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ord column</em>'.
	 * @see chartIt.GraphDrawing#getOrd_column()
	 * @see #getGraphDrawing()
	 * @generated
	 */
	EAttribute getGraphDrawing_Ord_column();

	/**
	 * Returns the meta object for the attribute list '{@link chartIt.GraphDrawing#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see chartIt.GraphDrawing#getLabels()
	 * @see #getGraphDrawing()
	 * @generated
	 */
	EAttribute getGraphDrawing_Labels();

	/**
	 * Returns the meta object for class '{@link chartIt.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see chartIt.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute list '{@link chartIt.Column#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Index</em>'.
	 * @see chartIt.Column#getIndex()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Index();

	/**
	 * Returns the meta object for the attribute list '{@link chartIt.Column#getNew_name_column <em>New name column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>New name column</em>'.
	 * @see chartIt.Column#getNew_name_column()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_New_name_column();

	/**
	 * Returns the meta object for class '{@link chartIt.RowFilter <em>Row Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Filter</em>'.
	 * @see chartIt.RowFilter
	 * @generated
	 */
	EClass getRowFilter();

	/**
	 * Returns the meta object for the attribute '{@link chartIt.RowFilter#getColumn_name <em>Column name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column name</em>'.
	 * @see chartIt.RowFilter#getColumn_name()
	 * @see #getRowFilter()
	 * @generated
	 */
	EAttribute getRowFilter_Column_name();

	/**
	 * Returns the meta object for the attribute '{@link chartIt.RowFilter#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see chartIt.RowFilter#getOperator()
	 * @see #getRowFilter()
	 * @generated
	 */
	EAttribute getRowFilter_Operator();

	/**
	 * Returns the meta object for the attribute '{@link chartIt.RowFilter#getInt_value <em>Int value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int value</em>'.
	 * @see chartIt.RowFilter#getInt_value()
	 * @see #getRowFilter()
	 * @generated
	 */
	EAttribute getRowFilter_Int_value();

	/**
	 * Returns the meta object for the attribute '{@link chartIt.RowFilter#getString_value <em>String value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String value</em>'.
	 * @see chartIt.RowFilter#getString_value()
	 * @see #getRowFilter()
	 * @generated
	 */
	EAttribute getRowFilter_String_value();

	/**
	 * Returns the meta object for enum '{@link chartIt.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see chartIt.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChartItFactory getChartItFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link chartIt.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartIt.impl.NamedElementImpl
		 * @see chartIt.impl.ChartItPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link chartIt.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartIt.impl.ProgramImpl
		 * @see chartIt.impl.ChartItPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__FUNCTIONS = eINSTANCE.getProgram_Functions();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__ID = eINSTANCE.getProgram_Id();

		/**
		 * The meta object literal for the '{@link chartIt.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartIt.impl.FunctionImpl
		 * @see chartIt.impl.ChartItPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link chartIt.impl.CsvLoaderImpl <em>Csv Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartIt.impl.CsvLoaderImpl
		 * @see chartIt.impl.ChartItPackageImpl#getCsvLoader()
		 * @generated
		 */
		EClass CSV_LOADER = eINSTANCE.getCsvLoader();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSV_LOADER__PATH = eINSTANCE.getCsvLoader_Path();

		/**
		 * The meta object literal for the '{@link chartIt.impl.DataFilteringImpl <em>Data Filtering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartIt.impl.DataFilteringImpl
		 * @see chartIt.impl.ChartItPackageImpl#getDataFiltering()
		 * @generated
		 */
		EClass DATA_FILTERING = eINSTANCE.getDataFiltering();

		/**
		 * The meta object literal for the '<em><b>Column filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FILTERING__COLUMN_FILTER = eINSTANCE.getDataFiltering_Column_filter();

		/**
		 * The meta object literal for the '<em><b>Rowfilter condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FILTERING__ROWFILTER_CONDITION = eINSTANCE.getDataFiltering_Rowfilter_condition();

		/**
		 * The meta object literal for the '{@link chartIt.impl.GraphDrawingImpl <em>Graph Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartIt.impl.GraphDrawingImpl
		 * @see chartIt.impl.ChartItPackageImpl#getGraphDrawing()
		 * @generated
		 */
		EClass GRAPH_DRAWING = eINSTANCE.getGraphDrawing();

		/**
		 * The meta object literal for the '<em><b>Graph type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_DRAWING__GRAPH_TYPE = eINSTANCE.getGraphDrawing_Graph_type();

		/**
		 * The meta object literal for the '<em><b>Abs column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_DRAWING__ABS_COLUMN = eINSTANCE.getGraphDrawing_Abs_column();

		/**
		 * The meta object literal for the '<em><b>Ord column</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_DRAWING__ORD_COLUMN = eINSTANCE.getGraphDrawing_Ord_column();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_DRAWING__LABELS = eINSTANCE.getGraphDrawing_Labels();

		/**
		 * The meta object literal for the '{@link chartIt.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartIt.impl.ColumnImpl
		 * @see chartIt.impl.ChartItPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__INDEX = eINSTANCE.getColumn_Index();

		/**
		 * The meta object literal for the '<em><b>New name column</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NEW_NAME_COLUMN = eINSTANCE.getColumn_New_name_column();

		/**
		 * The meta object literal for the '{@link chartIt.impl.RowFilterImpl <em>Row Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartIt.impl.RowFilterImpl
		 * @see chartIt.impl.ChartItPackageImpl#getRowFilter()
		 * @generated
		 */
		EClass ROW_FILTER = eINSTANCE.getRowFilter();

		/**
		 * The meta object literal for the '<em><b>Column name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_FILTER__COLUMN_NAME = eINSTANCE.getRowFilter_Column_name();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_FILTER__OPERATOR = eINSTANCE.getRowFilter_Operator();

		/**
		 * The meta object literal for the '<em><b>Int value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_FILTER__INT_VALUE = eINSTANCE.getRowFilter_Int_value();

		/**
		 * The meta object literal for the '<em><b>String value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_FILTER__STRING_VALUE = eINSTANCE.getRowFilter_String_value();

		/**
		 * The meta object literal for the '{@link chartIt.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chartIt.Operator
		 * @see chartIt.impl.ChartItPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //ChartItPackage
