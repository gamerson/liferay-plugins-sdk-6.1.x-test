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

package com.liferay.portal.workflow.kaleo.comparator;

import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskNameComparator;

/**
 * @author Shuyang Zhou
 */
public class WorkflowTaskNameComparator extends BaseWorkflowTaskNameComparator {

	public static final String ORDER_BY_ASC = "name ASC, kaleoTaskId ASC";

	public static final String ORDER_BY_DESC = "name DESC, kaleoTaskId DESC";

	public static final String[] ORDER_BY_FIELDS = {"name", "kaleoTaskId"};

	public WorkflowTaskNameComparator() {
		super();
	}

	public WorkflowTaskNameComparator(boolean asc) {
		super(asc);
	}

	@Override
	public String getOrderBy() {
		if (isAscending()) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	@Override
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

}