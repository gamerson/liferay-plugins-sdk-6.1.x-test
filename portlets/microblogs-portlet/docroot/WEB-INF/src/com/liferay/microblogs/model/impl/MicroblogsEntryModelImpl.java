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

package com.liferay.microblogs.model.impl;

import com.liferay.microblogs.model.MicroblogsEntry;
import com.liferay.microblogs.model.MicroblogsEntryModel;
import com.liferay.microblogs.model.MicroblogsEntrySoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the MicroblogsEntry service. Represents a row in the &quot;MicroblogsEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.microblogs.model.MicroblogsEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MicroblogsEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MicroblogsEntryImpl
 * @see com.liferay.microblogs.model.MicroblogsEntry
 * @see com.liferay.microblogs.model.MicroblogsEntryModel
 * @generated
 */
@JSON(strict = true)
public class MicroblogsEntryModelImpl extends BaseModelImpl<MicroblogsEntry>
	implements MicroblogsEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a microblogs entry model instance should use the {@link com.liferay.microblogs.model.MicroblogsEntry} interface instead.
	 */
	public static final String TABLE_NAME = "MicroblogsEntry";
	public static final Object[][] TABLE_COLUMNS = {
			{ "microblogsEntryId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "content", Types.VARCHAR },
			{ "type_", Types.INTEGER },
			{ "receiverUserId", Types.BIGINT },
			{ "receiverMicroblogsEntryId", Types.BIGINT },
			{ "socialRelationType", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table MicroblogsEntry (microblogsEntryId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,content STRING null,type_ INTEGER,receiverUserId LONG,receiverMicroblogsEntryId LONG,socialRelationType INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table MicroblogsEntry";
	public static final String ORDER_BY_JPQL = " ORDER BY microblogsEntry.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY MicroblogsEntry.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.microblogs.model.MicroblogsEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.microblogs.model.MicroblogsEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.microblogs.model.MicroblogsEntry"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long RECEIVERMICROBLOGSENTRYID_COLUMN_BITMASK = 2L;
	public static long RECEIVERUSERID_COLUMN_BITMASK = 4L;
	public static long TYPE_COLUMN_BITMASK = 8L;
	public static long USERID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static MicroblogsEntry toModel(MicroblogsEntrySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		MicroblogsEntry model = new MicroblogsEntryImpl();

		model.setMicroblogsEntryId(soapModel.getMicroblogsEntryId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setContent(soapModel.getContent());
		model.setType(soapModel.getType());
		model.setReceiverUserId(soapModel.getReceiverUserId());
		model.setReceiverMicroblogsEntryId(soapModel.getReceiverMicroblogsEntryId());
		model.setSocialRelationType(soapModel.getSocialRelationType());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<MicroblogsEntry> toModels(
		MicroblogsEntrySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<MicroblogsEntry> models = new ArrayList<MicroblogsEntry>(soapModels.length);

		for (MicroblogsEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.microblogs.model.MicroblogsEntry"));

	public MicroblogsEntryModelImpl() {
	}

	public long getPrimaryKey() {
		return _microblogsEntryId;
	}

	public void setPrimaryKey(long primaryKey) {
		setMicroblogsEntryId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_microblogsEntryId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return MicroblogsEntry.class;
	}

	public String getModelClassName() {
		return MicroblogsEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("microblogsEntryId", getMicroblogsEntryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("content", getContent());
		attributes.put("type", getType());
		attributes.put("receiverUserId", getReceiverUserId());
		attributes.put("receiverMicroblogsEntryId",
			getReceiverMicroblogsEntryId());
		attributes.put("socialRelationType", getSocialRelationType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long microblogsEntryId = (Long)attributes.get("microblogsEntryId");

		if (microblogsEntryId != null) {
			setMicroblogsEntryId(microblogsEntryId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Long receiverUserId = (Long)attributes.get("receiverUserId");

		if (receiverUserId != null) {
			setReceiverUserId(receiverUserId);
		}

		Long receiverMicroblogsEntryId = (Long)attributes.get(
				"receiverMicroblogsEntryId");

		if (receiverMicroblogsEntryId != null) {
			setReceiverMicroblogsEntryId(receiverMicroblogsEntryId);
		}

		Integer socialRelationType = (Integer)attributes.get(
				"socialRelationType");

		if (socialRelationType != null) {
			setSocialRelationType(socialRelationType);
		}
	}

	@JSON
	public long getMicroblogsEntryId() {
		return _microblogsEntryId;
	}

	public void setMicroblogsEntryId(long microblogsEntryId) {
		_microblogsEntryId = microblogsEntryId;
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@JSON
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	public void setContent(String content) {
		_content = content;
	}

	@JSON
	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_columnBitmask |= TYPE_COLUMN_BITMASK;

		if (!_setOriginalType) {
			_setOriginalType = true;

			_originalType = _type;
		}

		_type = type;
	}

	public int getOriginalType() {
		return _originalType;
	}

	@JSON
	public long getReceiverUserId() {
		return _receiverUserId;
	}

	public void setReceiverUserId(long receiverUserId) {
		_columnBitmask |= RECEIVERUSERID_COLUMN_BITMASK;

		if (!_setOriginalReceiverUserId) {
			_setOriginalReceiverUserId = true;

			_originalReceiverUserId = _receiverUserId;
		}

		_receiverUserId = receiverUserId;
	}

	public String getReceiverUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getReceiverUserId(), "uuid",
			_receiverUserUuid);
	}

	public void setReceiverUserUuid(String receiverUserUuid) {
		_receiverUserUuid = receiverUserUuid;
	}

	public long getOriginalReceiverUserId() {
		return _originalReceiverUserId;
	}

	@JSON
	public long getReceiverMicroblogsEntryId() {
		return _receiverMicroblogsEntryId;
	}

	public void setReceiverMicroblogsEntryId(long receiverMicroblogsEntryId) {
		_columnBitmask |= RECEIVERMICROBLOGSENTRYID_COLUMN_BITMASK;

		if (!_setOriginalReceiverMicroblogsEntryId) {
			_setOriginalReceiverMicroblogsEntryId = true;

			_originalReceiverMicroblogsEntryId = _receiverMicroblogsEntryId;
		}

		_receiverMicroblogsEntryId = receiverMicroblogsEntryId;
	}

	public long getOriginalReceiverMicroblogsEntryId() {
		return _originalReceiverMicroblogsEntryId;
	}

	@JSON
	public int getSocialRelationType() {
		return _socialRelationType;
	}

	public void setSocialRelationType(int socialRelationType) {
		_socialRelationType = socialRelationType;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			MicroblogsEntry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MicroblogsEntry toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (MicroblogsEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	public MicroblogsEntry toUnescapedModel() {
		return (MicroblogsEntry)this;
	}

	@Override
	public Object clone() {
		MicroblogsEntryImpl microblogsEntryImpl = new MicroblogsEntryImpl();

		microblogsEntryImpl.setMicroblogsEntryId(getMicroblogsEntryId());
		microblogsEntryImpl.setCompanyId(getCompanyId());
		microblogsEntryImpl.setUserId(getUserId());
		microblogsEntryImpl.setUserName(getUserName());
		microblogsEntryImpl.setCreateDate(getCreateDate());
		microblogsEntryImpl.setModifiedDate(getModifiedDate());
		microblogsEntryImpl.setContent(getContent());
		microblogsEntryImpl.setType(getType());
		microblogsEntryImpl.setReceiverUserId(getReceiverUserId());
		microblogsEntryImpl.setReceiverMicroblogsEntryId(getReceiverMicroblogsEntryId());
		microblogsEntryImpl.setSocialRelationType(getSocialRelationType());

		microblogsEntryImpl.resetOriginalValues();

		return microblogsEntryImpl;
	}

	public int compareTo(MicroblogsEntry microblogsEntry) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				microblogsEntry.getCreateDate());

		value = value * -1;

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

		if (!(obj instanceof MicroblogsEntry)) {
			return false;
		}

		MicroblogsEntry microblogsEntry = (MicroblogsEntry)obj;

		long primaryKey = microblogsEntry.getPrimaryKey();

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
		MicroblogsEntryModelImpl microblogsEntryModelImpl = this;

		microblogsEntryModelImpl._originalCompanyId = microblogsEntryModelImpl._companyId;

		microblogsEntryModelImpl._setOriginalCompanyId = false;

		microblogsEntryModelImpl._originalUserId = microblogsEntryModelImpl._userId;

		microblogsEntryModelImpl._setOriginalUserId = false;

		microblogsEntryModelImpl._originalType = microblogsEntryModelImpl._type;

		microblogsEntryModelImpl._setOriginalType = false;

		microblogsEntryModelImpl._originalReceiverUserId = microblogsEntryModelImpl._receiverUserId;

		microblogsEntryModelImpl._setOriginalReceiverUserId = false;

		microblogsEntryModelImpl._originalReceiverMicroblogsEntryId = microblogsEntryModelImpl._receiverMicroblogsEntryId;

		microblogsEntryModelImpl._setOriginalReceiverMicroblogsEntryId = false;

		microblogsEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<MicroblogsEntry> toCacheModel() {
		MicroblogsEntryCacheModel microblogsEntryCacheModel = new MicroblogsEntryCacheModel();

		microblogsEntryCacheModel.microblogsEntryId = getMicroblogsEntryId();

		microblogsEntryCacheModel.companyId = getCompanyId();

		microblogsEntryCacheModel.userId = getUserId();

		microblogsEntryCacheModel.userName = getUserName();

		String userName = microblogsEntryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			microblogsEntryCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			microblogsEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			microblogsEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			microblogsEntryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			microblogsEntryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		microblogsEntryCacheModel.content = getContent();

		String content = microblogsEntryCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			microblogsEntryCacheModel.content = null;
		}

		microblogsEntryCacheModel.type = getType();

		microblogsEntryCacheModel.receiverUserId = getReceiverUserId();

		microblogsEntryCacheModel.receiverMicroblogsEntryId = getReceiverMicroblogsEntryId();

		microblogsEntryCacheModel.socialRelationType = getSocialRelationType();

		return microblogsEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{microblogsEntryId=");
		sb.append(getMicroblogsEntryId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", receiverUserId=");
		sb.append(getReceiverUserId());
		sb.append(", receiverMicroblogsEntryId=");
		sb.append(getReceiverMicroblogsEntryId());
		sb.append(", socialRelationType=");
		sb.append(getSocialRelationType());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.liferay.microblogs.model.MicroblogsEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>microblogsEntryId</column-name><column-value><![CDATA[");
		sb.append(getMicroblogsEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
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
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverUserId</column-name><column-value><![CDATA[");
		sb.append(getReceiverUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverMicroblogsEntryId</column-name><column-value><![CDATA[");
		sb.append(getReceiverMicroblogsEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>socialRelationType</column-name><column-value><![CDATA[");
		sb.append(getSocialRelationType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = MicroblogsEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			MicroblogsEntry.class
		};
	private long _microblogsEntryId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _content;
	private int _type;
	private int _originalType;
	private boolean _setOriginalType;
	private long _receiverUserId;
	private String _receiverUserUuid;
	private long _originalReceiverUserId;
	private boolean _setOriginalReceiverUserId;
	private long _receiverMicroblogsEntryId;
	private long _originalReceiverMicroblogsEntryId;
	private boolean _setOriginalReceiverMicroblogsEntryId;
	private int _socialRelationType;
	private long _columnBitmask;
	private MicroblogsEntry _escapedModel;
}