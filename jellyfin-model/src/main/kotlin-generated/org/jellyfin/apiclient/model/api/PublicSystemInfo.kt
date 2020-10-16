// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Boolean
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PublicSystemInfo(
	/**
	 * Gets or sets the local address.
	 */
	@SerialName("LocalAddress")
	val localAddress: String? = null,
	/**
	 * Gets or sets the name of the server.
	 */
	@SerialName("ServerName")
	val serverName: String? = null,
	/**
	 * Gets or sets the server version.
	 */
	@SerialName("Version")
	val version: String? = null,
	/**
	 * Gets or sets the product name. This is the AssemblyProduct name.
	 */
	@SerialName("ProductName")
	val productName: String? = null,
	/**
	 * Gets or sets the operating system.
	 */
	@SerialName("OperatingSystem")
	val operatingSystem: String? = null,
	/**
	 * Gets or sets the id.
	 */
	@SerialName("Id")
	val id: String? = null,
	/**
	 * Gets or sets a value indicating whether the startup wizard is completed.
	 */
	@SerialName("StartupWizardCompleted")
	val startupWizardCompleted: Boolean? = null
)
