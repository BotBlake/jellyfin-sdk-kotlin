// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.emptyMap
import org.jellyfin.sdk.api.client.ApiClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.extensions.`get`
import org.jellyfin.sdk.api.client.extensions.post
import org.jellyfin.sdk.model.api.StartupConfigurationDto
import org.jellyfin.sdk.model.api.StartupRemoteAccessDto
import org.jellyfin.sdk.model.api.StartupUserDto

public class StartupApi(
	private val api: ApiClient,
) : Api {
	/**
	 * Completes the startup wizard.
	 */
	public suspend fun completeWizard(): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Unit>("/Startup/Complete", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets the first user.
	 */
	public suspend fun getFirstUser(): Response<StartupUserDto> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<StartupUserDto>("/Startup/User", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets the first user.
	 */
	public suspend fun getFirstUser2(): Response<StartupUserDto> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<StartupUserDto>("/Startup/FirstUser", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets the initial startup wizard configuration.
	 */
	public suspend fun getStartupConfiguration(): Response<StartupConfigurationDto> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<StartupConfigurationDto>("/Startup/Configuration", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Sets remote access and UPnP.
	 */
	public suspend fun setRemoteAccess(`data`: StartupRemoteAccessDto): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/Startup/RemoteAccess", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Sets the initial startup wizard configuration.
	 */
	public suspend fun updateInitialConfiguration(`data`: StartupConfigurationDto): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/Startup/Configuration", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Sets the user name and password.
	 */
	public suspend fun updateStartupUser(`data`: StartupUserDto? = null): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/Startup/User", pathParameters, queryParameters, data)
		return response
	}
}
