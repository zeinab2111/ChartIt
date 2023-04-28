/**
 */
package chartIt.impl;

import chartIt.ChartItFactory;
import chartIt.ChartItPackage;
import chartIt.Column;
import chartIt.CsvLoader;
import chartIt.DataFiltering;
import chartIt.Function;
import chartIt.GraphDrawing;
import chartIt.NamedElement;
import chartIt.Operator;
import chartIt.Program;
import chartIt.RowFilter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartItPackageImpl extends EPackageImpl implements ChartItPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvLoaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFilteringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphDrawingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see chartIt.ChartItPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChartItPackageImpl() {
		super(eNS_URI, ChartItFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ChartItPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChartItPackage init() {
		if (isInited)
			return (ChartItPackage) EPackage.Registry.INSTANCE.getEPackage(ChartItPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredChartItPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ChartItPackageImpl theChartItPackage = registeredChartItPackage instanceof ChartItPackageImpl
				? (ChartItPackageImpl) registeredChartItPackage
				: new ChartItPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theChartItPackage.createPackageContents();

		// Initialize created meta-data
		theChartItPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChartItPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChartItPackage.eNS_URI, theChartItPackage);
		return theChartItPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Functions() {
		return (EReference) programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_Id() {
		return (EAttribute) programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsvLoader() {
		return csvLoaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsvLoader_Path() {
		return (EAttribute) csvLoaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFiltering() {
		return dataFilteringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFiltering_Column_filter() {
		return (EReference) dataFilteringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFiltering_Rowfilter_condition() {
		return (EReference) dataFilteringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphDrawing() {
		return graphDrawingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphDrawing_Graph_type() {
		return (EAttribute) graphDrawingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphDrawing_Abs_column() {
		return (EAttribute) graphDrawingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphDrawing_Ord_column() {
		return (EAttribute) graphDrawingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphDrawing_Label() {
		return (EAttribute) graphDrawingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Index() {
		return (EAttribute) columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_New_name_column() {
		return (EAttribute) columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowFilter() {
		return rowFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowFilter_Column_name() {
		return (EAttribute) rowFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowFilter_Operator() {
		return (EAttribute) rowFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowFilter_Int_value() {
		return (EAttribute) rowFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowFilter_String_value() {
		return (EAttribute) rowFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartItFactory getChartItFactory() {
		return (ChartItFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__FUNCTIONS);
		createEAttribute(programEClass, PROGRAM__ID);

		functionEClass = createEClass(FUNCTION);

		csvLoaderEClass = createEClass(CSV_LOADER);
		createEAttribute(csvLoaderEClass, CSV_LOADER__PATH);

		dataFilteringEClass = createEClass(DATA_FILTERING);
		createEReference(dataFilteringEClass, DATA_FILTERING__COLUMN_FILTER);
		createEReference(dataFilteringEClass, DATA_FILTERING__ROWFILTER_CONDITION);

		graphDrawingEClass = createEClass(GRAPH_DRAWING);
		createEAttribute(graphDrawingEClass, GRAPH_DRAWING__GRAPH_TYPE);
		createEAttribute(graphDrawingEClass, GRAPH_DRAWING__ABS_COLUMN);
		createEAttribute(graphDrawingEClass, GRAPH_DRAWING__ORD_COLUMN);
		createEAttribute(graphDrawingEClass, GRAPH_DRAWING__LABEL);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__INDEX);
		createEAttribute(columnEClass, COLUMN__NEW_NAME_COLUMN);

		rowFilterEClass = createEClass(ROW_FILTER);
		createEAttribute(rowFilterEClass, ROW_FILTER__COLUMN_NAME);
		createEAttribute(rowFilterEClass, ROW_FILTER__OPERATOR);
		createEAttribute(rowFilterEClass, ROW_FILTER__INT_VALUE);
		createEAttribute(rowFilterEClass, ROW_FILTER__STRING_VALUE);

		// Create enums
		operatorEEnum = createEEnum(OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		programEClass.getESuperTypes().add(this.getNamedElement());
		functionEClass.getESuperTypes().add(this.getNamedElement());
		csvLoaderEClass.getESuperTypes().add(this.getFunction());
		dataFilteringEClass.getESuperTypes().add(this.getFunction());
		graphDrawingEClass.getESuperTypes().add(this.getFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_Functions(), this.getFunction(), null, "functions", null, 1, -1, Program.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_Id(), ecorePackage.getEString(), "id", null, 1, 1, Program.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(csvLoaderEClass, CsvLoader.class, "CsvLoader", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCsvLoader_Path(), ecorePackage.getEString(), "path", null, 1, 1, CsvLoader.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFilteringEClass, DataFiltering.class, "DataFiltering", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFiltering_Column_filter(), this.getColumn(), null, "column_filter", null, 1, -1,
				DataFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFiltering_Rowfilter_condition(), this.getRowFilter(), null, "rowfilter_condition", null,
				0, 1, DataFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphDrawingEClass, GraphDrawing.class, "GraphDrawing", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphDrawing_Graph_type(), ecorePackage.getEString(), "graph_type", null, 1, 1,
				GraphDrawing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphDrawing_Abs_column(), ecorePackage.getEString(), "abs_column", null, 1, 1,
				GraphDrawing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphDrawing_Ord_column(), ecorePackage.getEString(), "ord_column", null, 1, -1,
				GraphDrawing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphDrawing_Label(), ecorePackage.getEString(), "label", null, 1, -1, GraphDrawing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Index(), ecorePackage.getEInt(), "index", null, 1, 1, Column.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_New_name_column(), ecorePackage.getEString(), "new_name_column", null, 1, 1,
				Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(rowFilterEClass, RowFilter.class, "RowFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRowFilter_Column_name(), ecorePackage.getEString(), "column_name", null, 1, 1,
				RowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowFilter_Operator(), this.getOperator(), "operator", null, 1, 1, RowFilter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowFilter_Int_value(), ecorePackage.getEInt(), "int_value", null, 0, 1, RowFilter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowFilter_String_value(), ecorePackage.getEString(), "string_value", null, 0, 1,
				RowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.GREATER_THAN);
		addEEnumLiteral(operatorEEnum, Operator.SMALLER_THAN);
		addEEnumLiteral(operatorEEnum, Operator.EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //ChartItPackageImpl
