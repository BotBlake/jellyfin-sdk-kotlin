// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api.request

import kotlin.Int
import kotlin.collections.Collection
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.api.ItemFields
import org.jellyfin.sdk.model.api.ItemFilter
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Latest channel items.
 */
@Serializable
public data class GetLatestChannelItemsRequest(
	/**
	 * Optional. User Id.
	 */
	@SerialName("userId")
	public val userId: UUID? = null,
	/**
	 * Optional. The record index to start at. All items with a lower index will be dropped from the results.
	 */
	@SerialName("startIndex")
	public val startIndex: Int? = null,
	/**
	 * Optional. The maximum number of records to return.
	 */
	@SerialName("limit")
	public val limit: Int? = null,
	/**
	 * Optional. Specify additional filters to apply.
	 */
	@SerialName("filters")
	public val filters: Collection<ItemFilter>? = null,
	/**
	 * Optional. Specify additional fields of information to return in the output.
	 */
	@SerialName("fields")
	public val fields: Collection<ItemFields>? = null,
	/**
	 * Optional. Specify one or more channel id's, comma delimited.
	 */
	@SerialName("channelIds")
	public val channelIds: Collection<UUID>? = null,
)
