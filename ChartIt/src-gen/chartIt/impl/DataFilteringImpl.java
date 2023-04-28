/**
 */
package chartIt.impl;

import chartIt.ChartItPackage;
import chartIt.Column;
import chartIt.DataFiltering;
import chartIt.RowFilter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Filtering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chartIt.impl.DataFilteringImpl#getColumn_filter <em>Column filter</em>}</li>
 *   <li>{@link chartIt.impl.DataFilteringImpl#getRowfilter_condition <em>Rowfilter condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFilteringImpl extends FunctionImpl implements DataFiltering {
	/**
	 * The cached value of the '{@link #getColumn_filter() <em>Column filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn_filter()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column_filter;

	/**
	 * The cached value of the '{@link #getRowfilter_condition() <em>Rowfilter condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowfilter_condition()
	 * @generated
	 * @ordered
	 */
	protected RowFilter rowfilter_condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFilteringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartItPackage.Literals.DATA_FILTERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn_filter() {
		if (column_filter == null) {
			column_filter = new EObjectContainmentEList<Column>(Column.class, this,
					ChartItPackage.DATA_FILTERING__COLUMN_FILTER);
		}
		return column_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowFilter getRowfilter_condition() {
		return rowfilter_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRowfilter_condition(RowFilter newRowfilter_condition, NotificationChain msgs) {
		RowFilter oldRowfilter_condition = rowfilter_condition;
		rowfilter_condition = newRowfilter_condition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChartItPackage.DATA_FILTERING__ROWFILTER_CONDITION, oldRowfilter_condition, newRowfilter_condition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowfilter_condition(RowFilter newRowfilter_condition) {
		if (newRowfilter_condition != rowfilter_condition) {
			NotificationChain msgs = null;
			if (rowfilter_condition != null)
				msgs = ((InternalEObject) rowfilter_condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ChartItPackage.DATA_FILTERING__ROWFILTER_CONDITION, null, msgs);
			if (newRowfilter_condition != null)
				msgs = ((InternalEObject) newRowfilter_condition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ChartItPackage.DATA_FILTERING__ROWFILTER_CONDITION, null, msgs);
			msgs = basicSetRowfilter_condition(newRowfilter_condition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItPackage.DATA_FILTERING__ROWFILTER_CONDITION,
					newRowfilter_condition, newRowfilter_condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChartItPackage.DATA_FILTERING__COLUMN_FILTER:
			return ((InternalEList<?>) getColumn_filter()).basicRemove(otherEnd, msgs);
		case ChartItPackage.DATA_FILTERING__ROWFILTER_CONDITION:
			return basicSetRowfilter_condition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChartItPackage.DATA_FILTERING__COLUMN_FILTER:
			return getColumn_filter();
		case ChartItPackage.DATA_FILTERING__ROWFILTER_CONDITION:
			return getRowfilter_condition();
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
		case ChartItPackage.DATA_FILTERING__COLUMN_FILTER:
			getColumn_filter().clear();
			getColumn_filter().addAll((Collection<? extends Column>) newValue);
			return;
		case ChartItPackage.DATA_FILTERING__ROWFILTER_CONDITION:
			setRowfilter_condition((RowFilter) newValue);
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
		case ChartItPackage.DATA_FILTERING__COLUMN_FILTER:
			getColumn_filter().clear();
			return;
		case ChartItPackage.DATA_FILTERING__ROWFILTER_CONDITION:
			setRowfilter_condition((RowFilter) null);
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
		case ChartItPackage.DATA_FILTERING__COLUMN_FILTER:
			return column_filter != null && !column_filter.isEmpty();
		case ChartItPackage.DATA_FILTERING__ROWFILTER_CONDITION:
			return rowfilter_condition != null;
		}
		return super.eIsSet(featureID);
	}

} //DataFilteringImpl
