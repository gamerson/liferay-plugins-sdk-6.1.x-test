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

package com.liferay.socialcoding.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the JIRAAction service. Represents a row in the &quot;jiraaction&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.socialcoding.model.impl.JIRAActionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.socialcoding.model.impl.JIRAActionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JIRAAction
 * @see com.liferay.socialcoding.model.impl.JIRAActionImpl
 * @see com.liferay.socialcoding.model.impl.JIRAActionModelImpl
 * @generated
 */
public interface JIRAActionModel extends BaseModel<JIRAAction> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a j i r a action model instance should use the {@link JIRAAction} interface instead.
	 */

	/**
	 * Returns the primary key of this j i r a action.
	 *
	 * @return the primary key of this j i r a action
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this j i r a action.
	 *
	 * @param primaryKey the primary key of this j i r a action
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the jira action ID of this j i r a action.
	 *
	 * @return the jira action ID of this j i r a action
	 */
	public long getJiraActionId();

	/**
	 * Sets the jira action ID of this j i r a action.
	 *
	 * @param jiraActionId the jira action ID of this j i r a action
	 */
	public void setJiraActionId(long jiraActionId);

	/**
	 * Returns the jira user ID of this j i r a action.
	 *
	 * @return the jira user ID of this j i r a action
	 */
	@AutoEscape
	public String getJiraUserId();

	/**
	 * Sets the jira user ID of this j i r a action.
	 *
	 * @param jiraUserId the jira user ID of this j i r a action
	 */
	public void setJiraUserId(String jiraUserId);

	/**
	 * Returns the create date of this j i r a action.
	 *
	 * @return the create date of this j i r a action
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this j i r a action.
	 *
	 * @param createDate the create date of this j i r a action
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this j i r a action.
	 *
	 * @return the modified date of this j i r a action
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this j i r a action.
	 *
	 * @param modifiedDate the modified date of this j i r a action
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the jira issue ID of this j i r a action.
	 *
	 * @return the jira issue ID of this j i r a action
	 */
	public long getJiraIssueId();

	/**
	 * Sets the jira issue ID of this j i r a action.
	 *
	 * @param jiraIssueId the jira issue ID of this j i r a action
	 */
	public void setJiraIssueId(long jiraIssueId);

	/**
	 * Returns the type of this j i r a action.
	 *
	 * @return the type of this j i r a action
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this j i r a action.
	 *
	 * @param type the type of this j i r a action
	 */
	public void setType(String type);

	/**
	 * Returns the body of this j i r a action.
	 *
	 * @return the body of this j i r a action
	 */
	@AutoEscape
	public String getBody();

	/**
	 * Sets the body of this j i r a action.
	 *
	 * @param body the body of this j i r a action
	 */
	public void setBody(String body);

	/**
	 * Returns the jira group name of this j i r a action.
	 *
	 * @return the jira group name of this j i r a action
	 */
	@AutoEscape
	public String getJiraGroupName();

	/**
	 * Sets the jira group name of this j i r a action.
	 *
	 * @param jiraGroupName the jira group name of this j i r a action
	 */
	public void setJiraGroupName(String jiraGroupName);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(JIRAAction jiraAction);

	public int hashCode();

	public CacheModel<JIRAAction> toCacheModel();

	public JIRAAction toEscapedModel();

	public JIRAAction toUnescapedModel();

	public String toString();

	public String toXmlString();
}