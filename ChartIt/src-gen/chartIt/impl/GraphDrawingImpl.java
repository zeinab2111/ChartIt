/**
 */
package chartIt.impl;

import chartIt.ChartItPackage;
import chartIt.GraphDrawing;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Drawing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chartIt.impl.GraphDrawingImpl#getGraph_type <em>Graph type</em>}</li>
 *   <li>{@link chartIt.impl.GraphDrawingImpl#getAbs_column <em>Abs column</em>}</li>
 *   <li>{@link chartIt.impl.GraphDrawingImpl#getOrd_column <em>Ord column</em>}</li>
 *   <li>{@link chartIt.impl.GraphDrawingImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphDrawingImpl extends FunctionImpl implements GraphDrawing {
	/**
	 * The default value of the '{@link #getGraph_type() <em>Graph type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph_type()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAPH_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraph_type() <em>Graph type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph_type()
	 * @generated
	 * @ordered
	 */
	protected String graph_type = GRAPH_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbs_column() <em>Abs column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbs_column()
	 * @generated
	 * @ordered
	 */
	protected static final String ABS_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbs_column() <em>Abs column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbs_column()
	 * @generated
	 * @ordered
	 */
	protected String abs_column = ABS_COLUMN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrd_column() <em>Ord column</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrd_column()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ord_column;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> label;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphDrawingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartItPackage.Literals.GRAPH_DRAWING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGraph_type() {
		return graph_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph_type(String newGraph_type) {
		String oldGraph_type = graph_type;
		graph_type = newGraph_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItPackage.GRAPH_DRAWING__GRAPH_TYPE,
					oldGraph_type, graph_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbs_column() {
		return abs_column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbs_column(String newAbs_column) {
		String oldAbs_column = abs_column;
		abs_column = newAbs_column;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItPackage.GRAPH_DRAWING__ABS_COLUMN,
					oldAbs_column, abs_column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOrd_column() {
		if (ord_column == null) {
			ord_column = new EDataTypeUniqueEList<String>(String.class, this, ChartItPackage.GRAPH_DRAWING__ORD_COLUMN);
		}
		return ord_column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLabel() {
		if (label == null) {
			label = new EDataTypeUniqueEList<String>(String.class, this, ChartItPackage.GRAPH_DRAWING__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChartItPackage.GRAPH_DRAWING__GRAPH_TYPE:
			return getGraph_type();
		case ChartItPackage.GRAPH_DRAWING__ABS_COLUMN:
			return getAbs_column();
		case ChartItPackage.GRAPH_DRAWING__ORD_COLUMN:
			return getOrd_column();
		case ChartItPackage.GRAPH_DRAWING__LABEL:
			return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ChartItPackage.GRAPH_DRAWING__GRAPH_TYPE:
			setGraph_type((String) newValue);
			return;
		case ChartItPackage.GRAPH_DRAWING__ABS_COLUMN:
			setAbs_column((String) newValue);
			return;
		case ChartItPackage.GRAPH_DRAWING__ORD_COLUMN:
			getOrd_column().clear();
			getOrd_column().addAll((Collection<? extends String>) newValue);
			return;
		case ChartItPackage.GRAPH_DRAWING__LABEL:
			getLabel().clear();
			getLabel().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ChartItPackage.GRAPH_DRAWING__GRAPH_TYPE:
			setGraph_type(GRAPH_TYPE_EDEFAULT);
			return;
		case ChartItPackage.GRAPH_DRAWING__ABS_COLUMN:
			setAbs_column(ABS_COLUMN_EDEFAULT);
			return;
		case ChartItPackage.GRAPH_DRAWING__ORD_COLUMN:
			getOrd_column().clear();
			return;
		case ChartItPackage.GRAPH_DRAWING__LABEL:
			getLabel().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ChartItPackage.GRAPH_DRAWING__GRAPH_TYPE:
			return GRAPH_TYPE_EDEFAULT == null ? graph_type != null : !GRAPH_TYPE_EDEFAULT.equals(graph_type);
		case ChartItPackage.GRAPH_DRAWING__ABS_COLUMN:
			return ABS_COLUMN_EDEFAULT == null ? abs_column != null : !ABS_COLUMN_EDEFAULT.equals(abs_column);
		case ChartItPackage.GRAPH_DRAWING__ORD_COLUMN:
			return ord_column != null && !ord_column.isEmpty();
		case ChartItPackage.GRAPH_DRAWING__LABEL:
			return label != null && !label.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (graph_type: ");
		result.append(graph_type);
		result.append(", abs_column: ");
		result.append(abs_column);
		result.append(", ord_column: ");
		result.append(ord_column);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //GraphDrawingImpl
