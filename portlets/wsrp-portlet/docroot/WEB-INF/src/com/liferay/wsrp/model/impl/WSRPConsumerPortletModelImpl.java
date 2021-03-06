/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.wsrp.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.wsrp.model.WSRPConsumerPortlet;
import com.liferay.wsrp.model.WSRPConsumerPortletModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the WSRPConsumerPortlet service. Represents a row in the &quot;WSRP_WSRPConsumerPortlet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.wsrp.model.WSRPConsumerPortletModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WSRPConsumerPortletImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WSRPConsumerPortletImpl
 * @see com.liferay.wsrp.model.WSRPConsumerPortlet
 * @see com.liferay.wsrp.model.WSRPConsumerPortletModel
 * @generated
 */
public class WSRPConsumerPortletModelImpl extends BaseModelImpl<WSRPConsumerPortlet>
	implements WSRPConsumerPortletModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a w s r p consumer portlet model instance should use the {@link com.liferay.wsrp.model.WSRPConsumerPortlet} interface instead.
	 */
	public static final String TABLE_NAME = "WSRP_WSRPConsumerPortlet";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "wsrpConsumerPortletId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "wsrpConsumerId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "portletHandle", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table WSRP_WSRPConsumerPortlet (uuid_ VARCHAR(75) null,wsrpConsumerPortletId LONG not null primary key,companyId LONG,createDate DATE null,modifiedDate DATE null,wsrpConsumerId LONG,name VARCHAR(75) null,portletHandle VARCHAR(255) null)";
	public static final String TABLE_SQL_DROP = "drop table WSRP_WSRPConsumerPortlet";
	public static final String ORDER_BY_JPQL = " ORDER BY wsrpConsumerPortlet.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY WSRP_WSRPConsumerPortlet.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.wsrp.model.WSRPConsumerPortlet"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.wsrp.model.WSRPConsumerPortlet"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.wsrp.model.WSRPConsumerPortlet"),
			true);
	public static long PORTLETHANDLE_COLUMN_BITMASK = 1L;
	public static long UUID_COLUMN_BITMASK = 2L;
	public static long WSRPCONSUMERID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.wsrp.model.WSRPConsumerPortlet"));

	public WSRPConsumerPortletModelImpl() {
	}

	public long getPrimaryKey() {
		return _wsrpConsumerPortletId;
	}

	public void setPrimaryKey(long primaryKey) {
		setWsrpConsumerPortletId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_wsrpConsumerPortletId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return WSRPConsumerPortlet.class;
	}

	public String getModelClassName() {
		return WSRPConsumerPortlet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("wsrpConsumerPortletId", getWsrpConsumerPortletId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("wsrpConsumerId", getWsrpConsumerId());
		attributes.put("name", getName());
		attributes.put("portletHandle", getPortletHandle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long wsrpConsumerPortletId = (Long)attributes.get(
				"wsrpConsumerPortletId");

		if (wsrpConsumerPortletId != null) {
			setWsrpConsumerPortletId(wsrpConsumerPortletId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long wsrpConsumerId = (Long)attributes.get("wsrpConsumerId");

		if (wsrpConsumerId != null) {
			setWsrpConsumerId(wsrpConsumerId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String portletHandle = (String)attributes.get("portletHandle");

		if (portletHandle != null) {
			setPortletHandle(portletHandle);
		}
	}

	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	public long getWsrpConsumerPortletId() {
		return _wsrpConsumerPortletId;
	}

	public void setWsrpConsumerPortletId(long wsrpConsumerPortletId) {
		_wsrpConsumerPortletId = wsrpConsumerPortletId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getWsrpConsumerId() {
		return _wsrpConsumerId;
	}

	public void setWsrpConsumerId(long wsrpConsumerId) {
		_columnBitmask |= WSRPCONSUMERID_COLUMN_BITMASK;

		if (!_setOriginalWsrpConsumerId) {
			_setOriginalWsrpConsumerId = true;

			_originalWsrpConsumerId = _wsrpConsumerId;
		}

		_wsrpConsumerId = wsrpConsumerId;
	}

	public long getOriginalWsrpConsumerId() {
		return _originalWsrpConsumerId;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_columnBitmask = -1L;

		_name = name;
	}

	public String getPortletHandle() {
		if (_portletHandle == null) {
			return StringPool.BLANK;
		}
		else {
			return _portletHandle;
		}
	}

	public void setPortletHandle(String portletHandle) {
		_columnBitmask |= PORTLETHANDLE_COLUMN_BITMASK;

		if (_originalPortletHandle == null) {
			_originalPortletHandle = _portletHandle;
		}

		_portletHandle = portletHandle;
	}

	public String getOriginalPortletHandle() {
		return GetterUtil.getString(_originalPortletHandle);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			WSRPConsumerPortlet.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public WSRPConsumerPortlet toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (WSRPConsumerPortlet)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	public WSRPConsumerPortlet toUnescapedModel() {
		return (WSRPConsumerPortlet)this;
	}

	@Override
	public Object clone() {
		WSRPConsumerPortletImpl wsrpConsumerPortletImpl = new WSRPConsumerPortletImpl();

		wsrpConsumerPortletImpl.setUuid(getUuid());
		wsrpConsumerPortletImpl.setWsrpConsumerPortletId(getWsrpConsumerPortletId());
		wsrpConsumerPortletImpl.setCompanyId(getCompanyId());
		wsrpConsumerPortletImpl.setCreateDate(getCreateDate());
		wsrpConsumerPortletImpl.setModifiedDate(getModifiedDate());
		wsrpConsumerPortletImpl.setWsrpConsumerId(getWsrpConsumerId());
		wsrpConsumerPortletImpl.setName(getName());
		wsrpConsumerPortletImpl.setPortletHandle(getPortletHandle());

		wsrpConsumerPortletImpl.resetOriginalValues();

		return wsrpConsumerPortletImpl;
	}

	public int compareTo(WSRPConsumerPortlet wsrpConsumerPortlet) {
		int value = 0;

		value = getName().compareTo(wsrpConsumerPortlet.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WSRPConsumerPortlet)) {
			return false;
		}

		WSRPConsumerPortlet wsrpConsumerPortlet = (WSRPConsumerPortlet)obj;

		long primaryKey = wsrpConsumerPortlet.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		WSRPConsumerPortletModelImpl wsrpConsumerPortletModelImpl = this;

		wsrpConsumerPortletModelImpl._originalUuid = wsrpConsumerPortletModelImpl._uuid;

		wsrpConsumerPortletModelImpl._originalWsrpConsumerId = wsrpConsumerPortletModelImpl._wsrpConsumerId;

		wsrpConsumerPortletModelImpl._setOriginalWsrpConsumerId = false;

		wsrpConsumerPortletModelImpl._originalPortletHandle = wsrpConsumerPortletModelImpl._portletHandle;

		wsrpConsumerPortletModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<WSRPConsumerPortlet> toCacheModel() {
		WSRPConsumerPortletCacheModel wsrpConsumerPortletCacheModel = new WSRPConsumerPortletCacheModel();

		wsrpConsumerPortletCacheModel.uuid = getUuid();

		String uuid = wsrpConsumerPortletCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			wsrpConsumerPortletCacheModel.uuid = null;
		}

		wsrpConsumerPortletCacheModel.wsrpConsumerPortletId = getWsrpConsumerPortletId();

		wsrpConsumerPortletCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			wsrpConsumerPortletCacheModel.createDate = createDate.getTime();
		}
		else {
			wsrpConsumerPortletCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			wsrpConsumerPortletCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			wsrpConsumerPortletCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		wsrpConsumerPortletCacheModel.wsrpConsumerId = getWsrpConsumerId();

		wsrpConsumerPortletCacheModel.name = getName();

		String name = wsrpConsumerPortletCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			wsrpConsumerPortletCacheModel.name = null;
		}

		wsrpConsumerPortletCacheModel.portletHandle = getPortletHandle();

		String portletHandle = wsrpConsumerPortletCacheModel.portletHandle;

		if ((portletHandle != null) && (portletHandle.length() == 0)) {
			wsrpConsumerPortletCacheModel.portletHandle = null;
		}

		return wsrpConsumerPortletCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", wsrpConsumerPortletId=");
		sb.append(getWsrpConsumerPortletId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", wsrpConsumerId=");
		sb.append(getWsrpConsumerId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", portletHandle=");
		sb.append(getPortletHandle());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.liferay.wsrp.model.WSRPConsumerPortlet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wsrpConsumerPortletId</column-name><column-value><![CDATA[");
		sb.append(getWsrpConsumerPortletId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wsrpConsumerId</column-name><column-value><![CDATA[");
		sb.append(getWsrpConsumerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portletHandle</column-name><column-value><![CDATA[");
		sb.append(getPortletHandle());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = WSRPConsumerPortlet.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			WSRPConsumerPortlet.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _wsrpConsumerPortletId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _wsrpConsumerId;
	private long _originalWsrpConsumerId;
	private boolean _setOriginalWsrpConsumerId;
	private String _name;
	private String _portletHandle;
	private String _originalPortletHandle;
	private long _columnBitmask;
	private WSRPConsumerPortlet _escapedModel;
}