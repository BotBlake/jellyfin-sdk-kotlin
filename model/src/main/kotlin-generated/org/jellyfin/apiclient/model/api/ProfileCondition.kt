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
data class ProfileCondition(
	@SerialName("Condition")
	val condition: ProfileConditionType? = null,
	@SerialName("Property")
	val property: ProfileConditionValue? = null,
	@SerialName("Value")
	val value: String? = null,
	@SerialName("IsRequired")
	val isRequired: Boolean
)
