<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
--%>

<%@ include file="/html/taglib/init.jsp" %>

<%
// Fix: Mathchapta won't be used because mathchapta is defined in properties but preferences have priority over properties.
// Thus: set the preferences-value to be equal to the properties value

PortletPreferences preferences = com.liferay.portal.util.PrefsPropsUtil.getPreferences();
preferences.setValue(com.liferay.portal.kernel.util.PropsKeys.CAPTCHA_ENGINE_IMPL, com.liferay.portal.util.PropsValues.CAPTCHA_ENGINE_IMPL);
preferences.store();
%>

<%@ page import="com.liferay.portal.kernel.captcha.CaptchaUtil" %>