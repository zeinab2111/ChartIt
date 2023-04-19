/**
 */
package chartIt.impl;

import chartIt.ChartItPackage;
import chartIt.Column;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chartIt.impl.ColumnImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link chartIt.impl.ColumnImpl#getNew_name_column <em>New name column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends MinimalEObjectImpl.Container implements Column {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew_name_column() <em>New name column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name_column()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNew_name_column() <em>New name column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name_column()
	 * @generated
	 * @ordered
	 */
	protected String new_name_column = NEW_NAME_COLUMN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartItPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItPackage.COLUMN__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNew_name_column() {
		return new_name_column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew_name_column(String newNew_name_column) {
		String oldNew_name_column = new_name_column;
		new_name_column = newNew_name_column;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItPackage.COLUMN__NEW_NAME_COLUMN,
					oldNew_name_column, new_name_column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChartItPackage.COLUMN__INDEX:
			return getIndex();
		case ChartItPackage.COLUMN__NEW_NAME_COLUMN:
			return getNew_name_column();
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
		case ChartItPackage.COLUMN__INDEX:
			setIndex((Integer) newValue);
			return;
		case ChartItPackage.COLUMN__NEW_NAME_COLUMN:
			setNew_name_column((String) newValue);
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
		case ChartItPackage.COLUMN__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case ChartItPackage.COLUMN__NEW_NAME_COLUMN:
			setNew_name_column(NEW_NAME_COLUMN_EDEFAULT);
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
		case ChartItPackage.COLUMN__INDEX:
			return index != INDEX_EDEFAULT;
		case ChartItPackage.COLUMN__NEW_NAME_COLUMN:
			return NEW_NAME_COLUMN_EDEFAULT == null ? new_name_column != null
					: !NEW_NAME_COLUMN_EDEFAULT.equals(new_name_column);
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
		result.append(" (index: ");
		result.append(index);
		result.append(", new_name_column: ");
		result.append(new_name_column);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
