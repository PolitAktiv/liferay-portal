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

package com.liferay.portlet.portletdisplaytemplate.util;

import com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission;
import com.liferay.portal.kernel.template.TemplateHandler;
import com.liferay.portal.kernel.template.TemplateVariableGroup;
import com.liferay.portlet.dynamicdatamapping.model.DDMTemplate;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Eduardo Garcia
 */
public class PortletDisplayTemplateUtil {

	/**
	 * Returns the portlet display template's DDM template matching the group
	 * and display style stored in the portlet configuration.
	 *
	 * @param      groupId the primary key of the group
	 * @param      displayStyle the display style stored in the portlet
	 *             configuration
	 * @return     the portlet display template's DDM template
	 * @deprecated As of 7.0.0, replaced by {@link
	 *             #getPortletDisplayTemplateDDMTemplate(long, long, String)}
	 */
	@Deprecated
	public static DDMTemplate fetchDDMTemplate(
		long groupId, String displayStyle) {

		return getPortletDisplayTemplate().fetchDDMTemplate(
			groupId, displayStyle);
	}

	/**
	 * Returns the group ID of the portlet display template's DDM template.
	 *
	 * @param  groupId the primary key of the group
	 * @return the group ID of the portlet display template's DDM template
	 */
	public static long getDDMTemplateGroupId(long groupId) {
		return getPortletDisplayTemplate().getDDMTemplateGroupId(groupId);
	}

	/**
	 * Returns the template key of the portlet display template's DDM template
	 * from the display style stored in the portlet configuration.
	 *
	 * @param  displayStyle the display style stored in the portlet
	 *         configuration
	 * @return the template key of the portlet display template's DDM template
	 */
	public static String getDDMTemplateKey(String displayStyle) {
		return getPortletDisplayTemplate().getDDMTemplateKey(displayStyle);
	}

	/**
	 * Returns the UUID of the portlet display template's DDM template from the
	 * display style stored in the portlet configuration.
	 *
	 * @param      displayStyle the display style stored in the portlet
	 *             configuration
	 * @return     the UUID of the portlet display template's DDM template
	 * @deprecated As of 7.0.0, replaced by {@link #getDDMTemplateKey(String)}
	 */
	@Deprecated
	public static String getDDMTemplateUuid(String displayStyle) {
		return getPortletDisplayTemplate().getDDMTemplateUuid(displayStyle);
	}

	/**
	 * Returns the default portlet display template's DDM template that's
	 * associated with the class name ID.
	 *
	 * @param  groupId the primary key of the group
	 * @param  classNameId the primary key of the class name of the model the
	 *         display style is related to
	 * @return the default portlet display template's DDM template
	 */
	public static DDMTemplate getDefaultPortletDisplayTemplateDDMTemplate(
		long groupId, long classNameId) {

		return
			getPortletDisplayTemplate().
				getDefaultPortletDisplayTemplateDDMTemplate(
					groupId, classNameId);
	}

	/**
	 * Returns the display style that's associated with the template key of the
	 * portlet display template's DDM template.
	 *
	 * @param  ddmTemplateKey the template key of the portlet display template's
	 *         DDM template
	 * @return the display style stored in the portlet configuration
	 */
	public static String getDisplayStyle(String ddmTemplateKey) {
		return getPortletDisplayTemplate().getDisplayStyle(ddmTemplateKey);
	}

	public static PortletDisplayTemplate getPortletDisplayTemplate() {
		PortalRuntimePermission.checkGetBeanProperty(
			PortletDisplayTemplate.class);

		return _portletDisplayTemplate;
	}

	/**
	 * Returns the portlet display template's DDM template that's associated
	 * with the class name ID and that matches the group and display style
	 * stored in the portlet configuration.
	 *
	 * @param  groupId the primary key of the group
	 * @param  classNameId the primary key of the class name of the model the
	 *         display style is related to
	 * @param  displayStyle the display style stored in the portlet
	 *         configuration
	 * @return the portlet display template's DDM template
	 */
	public static DDMTemplate getPortletDisplayTemplateDDMTemplate(
		long groupId, long classNameId, String displayStyle) {

		return
			getPortletDisplayTemplate().getPortletDisplayTemplateDDMTemplate(
				groupId, classNameId, displayStyle);
	}

	/**
	 * Returns the portlet display template's DDM template that's associated
	 * with the class name ID and that matches the group and display style
	 * stored in the portlet configuration. Optionally returns the default
	 * portlet display template's DDM template that's associated with the class
	 * name ID if none are found for the given parameters.
	 *
	 * @param  groupId the primary key of the group
	 * @param  classNameId the primary key of the class name of the model the
	 *         display style is related to
	 * @param  displayStyle the display style stored in the portlet
	 *         configuration
	 * @param  useDefault whether to return the default portlet display
	 *         template's DDM template that's associated with the class name ID
	 *         if none are found for the given parameters.
	 * @return the portlet display template's DDM template
	 */
	public static DDMTemplate getPortletDisplayTemplateDDMTemplate(
		long groupId, long classNameId, String displayStyle,
		boolean useDefault) {

		return
			getPortletDisplayTemplate().getPortletDisplayTemplateDDMTemplate(
				groupId, classNameId, displayStyle, useDefault);
	}

	/**
	 * Returns the primary key of the portlet display template's DDM template
	 * matching the group and the display style stored in the portlet
	 * configuration.
	 *
	 * @param      groupId the primary key of the group
	 * @param      displayStyle the display style stored in the portlet
	 *             configuration
	 * @return     the primary key of the portlet display template's DDM
	 *             template
	 * @deprecated As of 7.0.0, replaced by {@link
	 *             #getPortletDisplayTemplateDDMTemplate(long, long, String)}
	 */
	@Deprecated
	public static long getPortletDisplayTemplateDDMTemplateId(
		long groupId, String displayStyle) {

		return
			getPortletDisplayTemplate().getPortletDisplayTemplateDDMTemplateId(
				groupId, displayStyle);
	}

	/**
	 * Returns the portlet display template handlers.
	 *
	 * @return the portlet display template handlers
	 */
	public static List<TemplateHandler> getPortletDisplayTemplateHandlers() {
		return getPortletDisplayTemplate().getPortletDisplayTemplateHandlers();
	}

	/**
	 * Returns the portlet display template's map of script variable groups for
	 * which hints are displayed in the template editor palette.
	 *
	 * @param  language the portlet display template's scripting language.
	 *         Acceptable values for the FreeMarker, Velocity, or XSL languages
	 *         are {@link
	 *         com.liferay.portal.kernel.template.TemplateConstants#LANG_TYPE_FTL},
	 *         {@link
	 *         com.liferay.portal.kernel.template.TemplateConstants#LANG_TYPE_VM},
	 *         or {@link
	 *         com.liferay.portal.kernel.template.TemplateConstants#LANG_TYPE_XSL},
	 *         respectively.
	 * @return the portlet display template's map of script variable groups for
	 *         which hints are displayed in the template editor palette
	 * @see    TemplateHandler#getTemplateVariableGroups(long, String,
	 *         java.util.Locale)
	 */
	public static Map<String, TemplateVariableGroup>
		getTemplateVariableGroups(String language) {

		return getPortletDisplayTemplate().getTemplateVariableGroups(language);
	}

	/**
	 * Returns the result of rendering the DDM template with the entries in the
	 * page context.
	 *
	 * @param  request the request with which the template is rendered
	 * @param  response the response with which the template is rendered
	 * @param  ddmTemplate the DDM template
	 * @param  entries the entries that are rendered in the template
	 * @return the result of rendering the DDM template
	 * @throws Exception if the DDM template could not be rendered
	 */
	public static String renderDDMTemplate(
			HttpServletRequest request, HttpServletResponse response,
			DDMTemplate ddmTemplate, List<?> entries)
		throws Exception {

		return getPortletDisplayTemplate().renderDDMTemplate(
			request, response, ddmTemplate, entries);
	}

	/**
	 * Returns the result of rendering the DDM template with the entries in the
	 * page context and template context.
	 *
	 * @param  request the request with which the template is rendered
	 * @param  response the response with which the template is rendered
	 * @param  ddmTemplate the DDM template
	 * @param  entries the entries that are rendered in the template
	 * @param  contextObjects the map of objects defining the context in which
	 *         the template is rendered
	 * @return the result of rendering the DDM template
	 * @throws Exception if the DDM template could not be rendered
	 */
	public static String renderDDMTemplate(
			HttpServletRequest request, HttpServletResponse response,
			DDMTemplate ddmTemplate, List<?> entries,
			Map<String, Object> contextObjects)
		throws Exception {

		return getPortletDisplayTemplate().renderDDMTemplate(
			request, response, ddmTemplate, entries, contextObjects);
	}

	/**
	 * Returns the result of rendering the DDM template with the entries in the
	 * page context.
	 *
	 * @param  request the request with which the template is rendered.
	 * @param  response the response with which the template is rendered.
	 * @param  ddmTemplateId the primary key of the DDM template
	 * @param  entries the entries that are rendered in the template
	 * @return the result of rendering the DDM template
	 * @throws Exception if the DDM template could not be rendered
	 */
	public static String renderDDMTemplate(
			HttpServletRequest request, HttpServletResponse response,
			long ddmTemplateId, List<?> entries)
		throws Exception {

		return getPortletDisplayTemplate().renderDDMTemplate(
			request, response, ddmTemplateId, entries);
	}

	/**
	 * Returns the result of rendering the DDM template with the entries in the
	 * page context and template context.
	 *
	 * @param  request the request with which the template is rendered.
	 * @param  response the response with which the template is rendered.
	 * @param  ddmTemplateId the primary key of the DDM template
	 * @param  entries the entries that are rendered in the template
	 * @param  contextObjects the map of objects defining the context in which
	 *         the template is rendered
	 * @return the result of rendering the DDM template
	 * @throws Exception if the DDM template could not be rendered
	 */
	public static String renderDDMTemplate(
			HttpServletRequest request, HttpServletResponse response,
			long ddmTemplateId, List<?> entries,
			Map<String, Object> contextObjects)
		throws Exception {

		return getPortletDisplayTemplate().renderDDMTemplate(
			request, response, ddmTemplateId, entries, contextObjects);
	}

	public void setPortletDisplayTemplate(
		PortletDisplayTemplate portletDisplayTemplate) {

		PortalRuntimePermission.checkSetBeanProperty(getClass());

		_portletDisplayTemplate = portletDisplayTemplate;
	}

	private static PortletDisplayTemplate _portletDisplayTemplate;

}