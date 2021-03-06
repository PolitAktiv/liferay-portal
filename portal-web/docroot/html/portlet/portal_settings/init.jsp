<%--
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
--%>

<%@ include file="/html/portlet/init.jsp" %>

<%@ page import="com.liferay.portal.AccountNameException" %><%@
page import="com.liferay.portal.CompanyMxException" %><%@
page import="com.liferay.portal.CompanyVirtualHostException" %><%@
page import="com.liferay.portal.facebook.FacebookConnectUtil" %><%@
page import="com.liferay.portal.kernel.ldap.DuplicateLDAPServerNameException" %><%@
page import="com.liferay.portal.kernel.ldap.LDAPFilterException" %><%@
page import="com.liferay.portal.kernel.ldap.LDAPServerNameException" %><%@
page import="com.liferay.portal.kernel.ldap.LDAPUtil" %><%@
page import="com.liferay.portal.security.ldap.LDAPSettingsUtil" %><%@
page import="com.liferay.portal.security.ldap.PortalLDAPUtil" %><%@
page import="com.liferay.portal.security.sso.OpenSSOUtil" %><%@
page import="com.liferay.portal.util.TermsOfUseContentProvider" %><%@
page import="com.liferay.portal.util.TermsOfUseContentProviderRegistryUtil" %><%@
page import="com.liferay.portlet.ratings.display.context.CompanyPortletRatingsDefinitionDisplayContext" %><%@
page import="com.liferay.portlet.social.util.SocialInteractionsConfiguration" %><%@
page import="com.liferay.portlet.social.util.SocialInteractionsConfigurationUtil" %><%@
page import="com.liferay.portlet.social.util.SocialRelationTypesUtil" %>

<%@ page import="java.net.HttpURLConnection" %><%@
page import="java.net.MalformedURLException" %><%@
page import="java.net.URL" %>

<%@ page import="javax.naming.directory.Attribute" %><%@
page import="javax.naming.directory.Attributes" %><%@
page import="javax.naming.directory.SearchResult" %><%@
page import="javax.naming.ldap.LdapContext" %>

<%@ include file="/html/portlet/portal_settings/init-ext.jsp" %>