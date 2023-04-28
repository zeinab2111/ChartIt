/**
 */
package chartIt.impl;

import chartIt.ChartItPackage;
import chartIt.Operator;
import chartIt.RowFilter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chartIt.impl.RowFilterImpl#getColumn_name <em>Column name</em>}</li>
 *   <li>{@link chartIt.impl.RowFilterImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link chartIt.impl.RowFilterImpl#getInt_value <em>Int value</em>}</li>
 *   <li>{@link chartIt.impl.RowFilterImpl#getString_value <em>String value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowFilterImpl extends MinimalEObjectImpl.Container implements RowFilter {
	/**
	 * The default value of the '{@link #getColumn_name() <em>Column name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn_name()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn_name() <em>Column name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn_name()
	 * @generated
	 * @ordered
	 */
	protected String column_name = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operator OPERATOR_EDEFAULT = Operator.GREATER_THAN;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInt_value() <em>Int value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt_value()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInt_value() <em>Int value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt_value()
	 * @generated
	 * @ordered
	 */
	protected int int_value = INT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getString_value() <em>String value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString_value()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString_value() <em>String value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString_value()
	 * @generated
	 * @ordered
	 */
	protected String string_value = STRING_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartItPackage.Literals.ROW_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn_name() {
		return column_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn_name(String newColumn_name) {
		String oldColumn_name = column_name;
		column_name = newColumn_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItPackage.ROW_FILTER__COLUMN_NAME,
					oldColumn_name, column_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		Operator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItPackage.ROW_FILTER__OPERATOR, oldOperator,
					operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInt_value() {
		return int_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt_value(int newInt_value) {
		int oldInt_value = int_value;
		int_value = newInt_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItPackage.ROW_FILTER__INT_VALUE, oldInt_value,
					int_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getString_value() {
		return string_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString_value(String newString_value) {
		String oldString_value = string_value;
		string_value = newString_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItPackage.ROW_FILTER__STRING_VALUE,
					oldString_value, string_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChartItPackage.ROW_FILTER__COLUMN_NAME:
			return getColumn_name();
		case ChartItPackage.ROW_FILTER__OPERATOR:
			return getOperator();
		case ChartItPackage.ROW_FILTER__INT_VALUE:
			return getInt_value();
		case ChartItPackage.ROW_FILTER__STRING_VALUE:
			return getString_value();
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
		case ChartItPackage.ROW_FILTER__COLUMN_NAME:
			setColumn_name((String) newValue);
			return;
		case ChartItPackage.ROW_FILTER__OPERATOR:
			setOperator((Operator) newValue);
			return;
		case ChartItPackage.ROW_FILTER__INT_VALUE:
			setInt_value((Integer) newValue);
			return;
		case ChartItPackage.ROW_FILTER__STRING_VALUE:
			setString_value((String) newValue);
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
		case ChartItPackage.ROW_FILTER__COLUMN_NAME:
			setColumn_name(COLUMN_NAME_EDEFAULT);
			return;
		case ChartItPackage.ROW_FILTER__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case ChartItPackage.ROW_FILTER__INT_VALUE:
			setInt_value(INT_VALUE_EDEFAULT);
			return;
		case ChartItPackage.ROW_FILTER__STRING_VALUE:
			setString_value(STRING_VALUE_EDEFAULT);
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
		case ChartItPackage.ROW_FILTER__COLUMN_NAME:
			return COLUMN_NAME_EDEFAULT == null ? column_name != null : !COLUMN_NAME_EDEFAULT.equals(column_name);
		case ChartItPackage.ROW_FILTER__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case ChartItPackage.ROW_FILTER__INT_VALUE:
			return int_value != INT_VALUE_EDEFAULT;
		case ChartItPackage.ROW_FILTER__STRING_VALUE:
			return STRING_VALUE_EDEFAULT == null ? string_value != null : !STRING_VALUE_EDEFAULT.equals(string_value);
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
		result.append(" (column_name: ");
		result.append(column_name);
		result.append(", operator: ");
		result.append(operator);
		result.append(", int_value: ");
		result.append(int_value);
		result.append(", string_value: ");
		result.append(string_value);
		result.append(')');
		return result.toString();
	}

} //RowFilterImpl
