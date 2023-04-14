/**
 */
package chartIt.impl;

import chartIt.ChartItPackage;
import chartIt.Column;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> index;

	/**
	 * The cached value of the '{@link #getNew_name_column() <em>New name column</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew_name_column()
	 * @generated
	 * @ordered
	 */
	protected EList<String> new_name_column;

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
	public EList<Integer> getIndex() {
		if (index == null) {
			index = new EDataTypeUniqueEList<Integer>(Integer.class, this, ChartItPackage.COLUMN__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNew_name_column() {
		if (new_name_column == null) {
			new_name_column = new EDataTypeUniqueEList<String>(String.class, this,
					ChartItPackage.COLUMN__NEW_NAME_COLUMN);
		}
		return new_name_column;
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
			getIndex().clear();
			getIndex().addAll((Collection<? extends Integer>) newValue);
			return;
		case ChartItPackage.COLUMN__NEW_NAME_COLUMN:
			getNew_name_column().clear();
			getNew_name_column().addAll((Collection<? extends String>) newValue);
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
			getIndex().clear();
			return;
		case ChartItPackage.COLUMN__NEW_NAME_COLUMN:
			getNew_name_column().clear();
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
			return index != null && !index.isEmpty();
		case ChartItPackage.COLUMN__NEW_NAME_COLUMN:
			return new_name_column != null && !new_name_column.isEmpty();
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
