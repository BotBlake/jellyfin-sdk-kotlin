// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import kotlin.Any
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.buildMap
import kotlin.collections.emptyMap
import org.jellyfin.sdk.api.client.ApiClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.extensions.`get`
import org.jellyfin.sdk.api.client.extensions.delete
import org.jellyfin.sdk.api.client.extensions.post
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.api.FontFile
import org.jellyfin.sdk.model.api.RemoteSubtitleInfo
import org.jellyfin.sdk.model.api.UploadSubtitleDto
import org.jellyfin.sdk.model.api.request.GetSubtitleDeprecatedRequest
import org.jellyfin.sdk.model.api.request.GetSubtitleRequest
import org.jellyfin.sdk.model.api.request.GetSubtitleWithTicksDeprecatedRequest
import org.jellyfin.sdk.model.api.request.GetSubtitleWithTicksRequest

public class SubtitleApi(
	private val api: ApiClient,
) : Api {
	/**
	 * Deletes an external subtitle file.
	 *
	 * @param itemId The item id.
	 * @param index The index of the subtitle file.
	 */
	public suspend fun deleteSubtitle(itemId: UUID, index: Int): Response<Unit> {
		val pathParameters = buildMap<String, Any?>(2) {
			put("itemId", itemId)
			put("index", index)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.delete<Unit>("/Videos/{itemId}/Subtitles/{index}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Downloads a remote subtitle.
	 *
	 * @param itemId The item id.
	 * @param subtitleId The subtitle id.
	 */
	public suspend fun downloadRemoteSubtitles(itemId: UUID, subtitleId: String): Response<Unit> {
		val pathParameters = buildMap<String, Any?>(2) {
			put("itemId", itemId)
			put("subtitleId", subtitleId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Unit>("/Items/{itemId}/RemoteSearch/Subtitles/{subtitleId}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets a fallback font file.
	 *
	 * @param name The name of the fallback font file to get.
	 */
	public suspend fun getFallbackFont(name: String): Response<ByteArray> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("name", name)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<ByteArray>("/FallbackFont/Fonts/{name}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets a fallback font file.
	 *
	 * @param name The name of the fallback font file to get.
	 */
	public fun getFallbackFontUrl(name: String): String {
		val pathParameters = buildMap<String, Any?>(1) {
			put("name", name)
		}
		val queryParameters = emptyMap<String, Any?>()
		return api.createUrl("/FallbackFont/Fonts/{name}", pathParameters, queryParameters)
	}

	/**
	 * Gets a list of available fallback font files.
	 */
	public suspend fun getFallbackFontList(): Response<List<FontFile>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<FontFile>>("/FallbackFont/Fonts", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets the remote subtitles.
	 *
	 * @param subtitleId The item id.
	 */
	public suspend fun getRemoteSubtitles(subtitleId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("subtitleId", subtitleId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Providers/Subtitles/Subtitles/{subtitleId}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 * @param startPositionTicks The start position of the subtitle in ticks.
	 */
	public suspend fun getSubtitle(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeFormat: String,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false,
		startPositionTicks: Long? = 0,
	): Response<String> {
		val pathParameters = buildMap<String, Any?>(4) {
			put("routeItemId", routeItemId)
			put("routeMediaSourceId", routeMediaSourceId)
			put("routeIndex", routeIndex)
			put("routeFormat", routeFormat)
		}
		val queryParameters = buildMap<String, Any?>(4) {
			put("endPositionTicks", endPositionTicks)
			put("copyTimestamps", copyTimestamps)
			put("addVttTimeMap", addVttTimeMap)
			put("startPositionTicks", startPositionTicks)
		}
		val data = null
		val response = api.`get`<String>("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/Stream.{routeFormat}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param request The request parameters
	 */
	public suspend fun getSubtitle(request: GetSubtitleRequest): Response<String> = getSubtitle(
		routeItemId = request.routeItemId,
		routeMediaSourceId = request.routeMediaSourceId,
		routeIndex = request.routeIndex,
		routeFormat = request.routeFormat,
		endPositionTicks = request.endPositionTicks,
		copyTimestamps = request.copyTimestamps,
		addVttTimeMap = request.addVttTimeMap,
		startPositionTicks = request.startPositionTicks,
	)

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 * @param startPositionTicks The start position of the subtitle in ticks.
	 */
	public fun getSubtitleUrl(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeFormat: String,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false,
		startPositionTicks: Long? = 0,
	): String {
		val pathParameters = buildMap<String, Any?>(4) {
			put("routeItemId", routeItemId)
			put("routeMediaSourceId", routeMediaSourceId)
			put("routeIndex", routeIndex)
			put("routeFormat", routeFormat)
		}
		val queryParameters = buildMap<String, Any?>(4) {
			put("endPositionTicks", endPositionTicks)
			put("copyTimestamps", copyTimestamps)
			put("addVttTimeMap", addVttTimeMap)
			put("startPositionTicks", startPositionTicks)
		}
		return api.createUrl("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/Stream.{routeFormat}", pathParameters, queryParameters)
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param itemId The item id.
	 * @param mediaSourceId The media source id.
	 * @param index The subtitle stream index.
	 * @param format The format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 * @param startPositionTicks The start position of the subtitle in ticks.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getSubtitleDeprecated(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeFormat: String,
		itemId: UUID? = null,
		mediaSourceId: String? = null,
		index: Int? = null,
		format: String? = null,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false,
		startPositionTicks: Long? = 0,
	): Response<String> {
		val pathParameters = buildMap<String, Any?>(4) {
			put("routeItemId", routeItemId)
			put("routeMediaSourceId", routeMediaSourceId)
			put("routeIndex", routeIndex)
			put("routeFormat", routeFormat)
		}
		val queryParameters = buildMap<String, Any?>(8) {
			put("itemId", itemId)
			put("mediaSourceId", mediaSourceId)
			put("index", index)
			put("format", format)
			put("endPositionTicks", endPositionTicks)
			put("copyTimestamps", copyTimestamps)
			put("addVttTimeMap", addVttTimeMap)
			put("startPositionTicks", startPositionTicks)
		}
		val data = null
		val response = api.`get`<String>("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/Stream.{routeFormat}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param request The request parameters
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getSubtitleDeprecated(request: GetSubtitleDeprecatedRequest): Response<String> = getSubtitleDeprecated(
		routeItemId = request.routeItemId,
		routeMediaSourceId = request.routeMediaSourceId,
		routeIndex = request.routeIndex,
		routeFormat = request.routeFormat,
		itemId = request.itemId,
		mediaSourceId = request.mediaSourceId,
		index = request.index,
		format = request.format,
		endPositionTicks = request.endPositionTicks,
		copyTimestamps = request.copyTimestamps,
		addVttTimeMap = request.addVttTimeMap,
		startPositionTicks = request.startPositionTicks,
	)

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param itemId The item id.
	 * @param mediaSourceId The media source id.
	 * @param index The subtitle stream index.
	 * @param format The format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 * @param startPositionTicks The start position of the subtitle in ticks.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public fun getSubtitleDeprecatedUrl(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeFormat: String,
		itemId: UUID? = null,
		mediaSourceId: String? = null,
		index: Int? = null,
		format: String? = null,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false,
		startPositionTicks: Long? = 0,
	): String {
		val pathParameters = buildMap<String, Any?>(4) {
			put("routeItemId", routeItemId)
			put("routeMediaSourceId", routeMediaSourceId)
			put("routeIndex", routeIndex)
			put("routeFormat", routeFormat)
		}
		val queryParameters = buildMap<String, Any?>(8) {
			put("itemId", itemId)
			put("mediaSourceId", mediaSourceId)
			put("index", index)
			put("format", format)
			put("endPositionTicks", endPositionTicks)
			put("copyTimestamps", copyTimestamps)
			put("addVttTimeMap", addVttTimeMap)
			put("startPositionTicks", startPositionTicks)
		}
		return api.createUrl("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/Stream.{routeFormat}", pathParameters, queryParameters)
	}

	/**
	 * Gets an HLS subtitle playlist.
	 *
	 * @param itemId The item id.
	 * @param index The subtitle stream index.
	 * @param mediaSourceId The media source id.
	 * @param segmentLength The subtitle segment length.
	 */
	public suspend fun getSubtitlePlaylist(
		itemId: UUID,
		index: Int,
		mediaSourceId: String,
		segmentLength: Int,
	): Response<ByteArray> {
		val pathParameters = buildMap<String, Any?>(3) {
			put("itemId", itemId)
			put("index", index)
			put("mediaSourceId", mediaSourceId)
		}
		val queryParameters = buildMap<String, Any?>(1) {
			put("segmentLength", segmentLength)
		}
		val data = null
		val response = api.`get`<ByteArray>("/Videos/{itemId}/{mediaSourceId}/Subtitles/{index}/subtitles.m3u8", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets an HLS subtitle playlist.
	 *
	 * @param itemId The item id.
	 * @param index The subtitle stream index.
	 * @param mediaSourceId The media source id.
	 * @param segmentLength The subtitle segment length.
	 */
	public fun getSubtitlePlaylistUrl(
		itemId: UUID,
		index: Int,
		mediaSourceId: String,
		segmentLength: Int,
	): String {
		val pathParameters = buildMap<String, Any?>(3) {
			put("itemId", itemId)
			put("index", index)
			put("mediaSourceId", mediaSourceId)
		}
		val queryParameters = buildMap<String, Any?>(1) {
			put("segmentLength", segmentLength)
		}
		return api.createUrl("/Videos/{itemId}/{mediaSourceId}/Subtitles/{index}/subtitles.m3u8", pathParameters, queryParameters)
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeStartPositionTicks The (route) start position of the subtitle in ticks.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 */
	public suspend fun getSubtitleWithTicks(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeStartPositionTicks: Long,
		routeFormat: String,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false,
	): Response<String> {
		val pathParameters = buildMap<String, Any?>(5) {
			put("routeItemId", routeItemId)
			put("routeMediaSourceId", routeMediaSourceId)
			put("routeIndex", routeIndex)
			put("routeStartPositionTicks", routeStartPositionTicks)
			put("routeFormat", routeFormat)
		}
		val queryParameters = buildMap<String, Any?>(3) {
			put("endPositionTicks", endPositionTicks)
			put("copyTimestamps", copyTimestamps)
			put("addVttTimeMap", addVttTimeMap)
		}
		val data = null
		val response = api.`get`<String>("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/{routeStartPositionTicks}/Stream.{routeFormat}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param request The request parameters
	 */
	public suspend fun getSubtitleWithTicks(request: GetSubtitleWithTicksRequest): Response<String> = getSubtitleWithTicks(
		routeItemId = request.routeItemId,
		routeMediaSourceId = request.routeMediaSourceId,
		routeIndex = request.routeIndex,
		routeStartPositionTicks = request.routeStartPositionTicks,
		routeFormat = request.routeFormat,
		endPositionTicks = request.endPositionTicks,
		copyTimestamps = request.copyTimestamps,
		addVttTimeMap = request.addVttTimeMap,
	)

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeStartPositionTicks The (route) start position of the subtitle in ticks.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 */
	public fun getSubtitleWithTicksUrl(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeStartPositionTicks: Long,
		routeFormat: String,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false,
	): String {
		val pathParameters = buildMap<String, Any?>(5) {
			put("routeItemId", routeItemId)
			put("routeMediaSourceId", routeMediaSourceId)
			put("routeIndex", routeIndex)
			put("routeStartPositionTicks", routeStartPositionTicks)
			put("routeFormat", routeFormat)
		}
		val queryParameters = buildMap<String, Any?>(3) {
			put("endPositionTicks", endPositionTicks)
			put("copyTimestamps", copyTimestamps)
			put("addVttTimeMap", addVttTimeMap)
		}
		return api.createUrl("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/{routeStartPositionTicks}/Stream.{routeFormat}", pathParameters, queryParameters)
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeStartPositionTicks The (route) start position of the subtitle in ticks.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param itemId The item id.
	 * @param mediaSourceId The media source id.
	 * @param index The subtitle stream index.
	 * @param startPositionTicks The start position of the subtitle in ticks.
	 * @param format The format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getSubtitleWithTicksDeprecated(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeStartPositionTicks: Long,
		routeFormat: String,
		itemId: UUID? = null,
		mediaSourceId: String? = null,
		index: Int? = null,
		startPositionTicks: Long? = null,
		format: String? = null,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false,
	): Response<String> {
		val pathParameters = buildMap<String, Any?>(5) {
			put("routeItemId", routeItemId)
			put("routeMediaSourceId", routeMediaSourceId)
			put("routeIndex", routeIndex)
			put("routeStartPositionTicks", routeStartPositionTicks)
			put("routeFormat", routeFormat)
		}
		val queryParameters = buildMap<String, Any?>(8) {
			put("itemId", itemId)
			put("mediaSourceId", mediaSourceId)
			put("index", index)
			put("startPositionTicks", startPositionTicks)
			put("format", format)
			put("endPositionTicks", endPositionTicks)
			put("copyTimestamps", copyTimestamps)
			put("addVttTimeMap", addVttTimeMap)
		}
		val data = null
		val response = api.`get`<String>("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/{routeStartPositionTicks}/Stream.{routeFormat}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param request The request parameters
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getSubtitleWithTicksDeprecated(request: GetSubtitleWithTicksDeprecatedRequest): Response<String> = getSubtitleWithTicksDeprecated(
		routeItemId = request.routeItemId,
		routeMediaSourceId = request.routeMediaSourceId,
		routeIndex = request.routeIndex,
		routeStartPositionTicks = request.routeStartPositionTicks,
		routeFormat = request.routeFormat,
		itemId = request.itemId,
		mediaSourceId = request.mediaSourceId,
		index = request.index,
		startPositionTicks = request.startPositionTicks,
		format = request.format,
		endPositionTicks = request.endPositionTicks,
		copyTimestamps = request.copyTimestamps,
		addVttTimeMap = request.addVttTimeMap,
	)

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeStartPositionTicks The (route) start position of the subtitle in ticks.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param itemId The item id.
	 * @param mediaSourceId The media source id.
	 * @param index The subtitle stream index.
	 * @param startPositionTicks The start position of the subtitle in ticks.
	 * @param format The format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public fun getSubtitleWithTicksDeprecatedUrl(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeStartPositionTicks: Long,
		routeFormat: String,
		itemId: UUID? = null,
		mediaSourceId: String? = null,
		index: Int? = null,
		startPositionTicks: Long? = null,
		format: String? = null,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false,
	): String {
		val pathParameters = buildMap<String, Any?>(5) {
			put("routeItemId", routeItemId)
			put("routeMediaSourceId", routeMediaSourceId)
			put("routeIndex", routeIndex)
			put("routeStartPositionTicks", routeStartPositionTicks)
			put("routeFormat", routeFormat)
		}
		val queryParameters = buildMap<String, Any?>(8) {
			put("itemId", itemId)
			put("mediaSourceId", mediaSourceId)
			put("index", index)
			put("startPositionTicks", startPositionTicks)
			put("format", format)
			put("endPositionTicks", endPositionTicks)
			put("copyTimestamps", copyTimestamps)
			put("addVttTimeMap", addVttTimeMap)
		}
		return api.createUrl("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/{routeStartPositionTicks}/Stream.{routeFormat}", pathParameters, queryParameters)
	}

	/**
	 * Search remote subtitles.
	 *
	 * @param itemId The item id.
	 * @param language The language of the subtitles.
	 * @param isPerfectMatch Optional. Only show subtitles which are a perfect match.
	 */
	public suspend fun searchRemoteSubtitles(
		itemId: UUID,
		language: String,
		isPerfectMatch: Boolean? = null,
	): Response<List<RemoteSubtitleInfo>> {
		val pathParameters = buildMap<String, Any?>(2) {
			put("itemId", itemId)
			put("language", language)
		}
		val queryParameters = buildMap<String, Any?>(1) {
			put("isPerfectMatch", isPerfectMatch)
		}
		val data = null
		val response = api.`get`<List<RemoteSubtitleInfo>>("/Items/{itemId}/RemoteSearch/Subtitles/{language}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Upload an external subtitle file.
	 *
	 * @param itemId The item the subtitle belongs to.
	 */
	public suspend fun uploadSubtitle(itemId: UUID, `data`: UploadSubtitleDto): Response<Unit> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("itemId", itemId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/Videos/{itemId}/Subtitles", pathParameters, queryParameters, data)
		return response
	}
}
