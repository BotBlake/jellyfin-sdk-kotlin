// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A class for transcoding profile information.
 * Note for client developers: Conditions defined in MediaBrowser.Model.Dlna.CodecProfile has higher priority and can override values defined here.
 */
@Serializable
public data class TranscodingProfile(
	/**
	 * The container.
	 */
	@SerialName("Container")
	public val container: String,
	/**
	 * The DLNA profile type.
	 */
	@SerialName("Type")
	public val type: DlnaProfileType,
	/**
	 * The video codec.
	 */
	@SerialName("VideoCodec")
	public val videoCodec: String,
	/**
	 * The audio codec.
	 */
	@SerialName("AudioCodec")
	public val audioCodec: String,
	/**
	 * The protocol.
	 */
	@SerialName("Protocol")
	public val protocol: MediaStreamProtocol,
	/**
	 * A value indicating whether the content length should be estimated.
	 */
	@SerialName("EstimateContentLength")
	public val estimateContentLength: Boolean = false,
	/**
	 * A value indicating whether M2TS mode is enabled.
	 */
	@SerialName("EnableMpegtsM2TsMode")
	public val enableMpegtsM2TsMode: Boolean = false,
	/**
	 * The transcoding seek info mode.
	 */
	@SerialName("TranscodeSeekInfo")
	public val transcodeSeekInfo: TranscodeSeekInfo = TranscodeSeekInfo.AUTO,
	/**
	 * A value indicating whether timestamps should be copied.
	 */
	@SerialName("CopyTimestamps")
	public val copyTimestamps: Boolean = false,
	/**
	 * The encoding context.
	 */
	@SerialName("Context")
	public val context: EncodingContext = EncodingContext.STREAMING,
	/**
	 * A value indicating whether subtitles are allowed in the manifest.
	 */
	@SerialName("EnableSubtitlesInManifest")
	public val enableSubtitlesInManifest: Boolean = false,
	/**
	 * The maximum audio channels.
	 */
	@SerialName("MaxAudioChannels")
	public val maxAudioChannels: String? = null,
	/**
	 * The minimum amount of segments.
	 */
	@SerialName("MinSegments")
	public val minSegments: Int = 0,
	/**
	 * The segment length.
	 */
	@SerialName("SegmentLength")
	public val segmentLength: Int = 0,
	/**
	 * A value indicating whether breaking the video stream on non-keyframes is supported.
	 */
	@SerialName("BreakOnNonKeyFrames")
	public val breakOnNonKeyFrames: Boolean = false,
	/**
	 * The profile conditions.
	 */
	@SerialName("Conditions")
	public val conditions: List<ProfileCondition>,
	/**
	 * A value indicating whether variable bitrate encoding is supported.
	 */
	@SerialName("EnableAudioVbrEncoding")
	public val enableAudioVbrEncoding: Boolean = true,
)
