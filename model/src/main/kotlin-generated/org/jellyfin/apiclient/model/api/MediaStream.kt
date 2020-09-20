// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Class MediaStream.
 */
@Serializable
data class MediaStream(
	/**
	 * Gets or sets the codec.
	 */
	@SerialName("Codec")
	val codec: String? = null,
	/**
	 * Gets or sets the codec tag.
	 */
	@SerialName("CodecTag")
	val codecTag: String? = null,
	/**
	 * Gets or sets the language.
	 */
	@SerialName("Language")
	val language: String? = null,
	/**
	 * Gets or sets the color range.
	 */
	@SerialName("ColorRange")
	val colorRange: String? = null,
	/**
	 * Gets or sets the color space.
	 */
	@SerialName("ColorSpace")
	val colorSpace: String? = null,
	/**
	 * Gets or sets the color transfer.
	 */
	@SerialName("ColorTransfer")
	val colorTransfer: String? = null,
	/**
	 * Gets or sets the color primaries.
	 */
	@SerialName("ColorPrimaries")
	val colorPrimaries: String? = null,
	/**
	 * Gets or sets the comment.
	 */
	@SerialName("Comment")
	val comment: String? = null,
	/**
	 * Gets or sets the time base.
	 */
	@SerialName("TimeBase")
	val timeBase: String? = null,
	/**
	 * Gets or sets the codec time base.
	 */
	@SerialName("CodecTimeBase")
	val codecTimeBase: String? = null,
	/**
	 * Gets or sets the title.
	 */
	@SerialName("Title")
	val title: String? = null,
	/**
	 * Gets or sets the video range.
	 */
	@SerialName("VideoRange")
	val videoRange: String? = null,
	@SerialName("localizedUndefined")
	val localizedUndefined: String? = null,
	@SerialName("localizedDefault")
	val localizedDefault: String? = null,
	@SerialName("localizedForced")
	val localizedForced: String? = null,
	@SerialName("DisplayTitle")
	val displayTitle: String? = null,
	@SerialName("NalLengthSize")
	val nalLengthSize: String? = null,
	/**
	 * Gets or sets a value indicating whether this instance is interlaced.
	 */
	@SerialName("IsInterlaced")
	val isInterlaced: Boolean,
	@SerialName("IsAVC")
	val isAvc: Boolean? = null,
	/**
	 * Gets or sets the channel layout.
	 */
	@SerialName("ChannelLayout")
	val channelLayout: String? = null,
	/**
	 * Gets or sets the bit rate.
	 */
	@SerialName("BitRate")
	val bitRate: Int? = null,
	/**
	 * Gets or sets the bit depth.
	 */
	@SerialName("BitDepth")
	val bitDepth: Int? = null,
	/**
	 * Gets or sets the reference frames.
	 */
	@SerialName("RefFrames")
	val refFrames: Int? = null,
	/**
	 * Gets or sets the length of the packet.
	 */
	@SerialName("PacketLength")
	val packetLength: Int? = null,
	/**
	 * Gets or sets the channels.
	 */
	@SerialName("Channels")
	val channels: Int? = null,
	/**
	 * Gets or sets the sample rate.
	 */
	@SerialName("SampleRate")
	val sampleRate: Int? = null,
	/**
	 * Gets or sets a value indicating whether this instance is default.
	 */
	@SerialName("IsDefault")
	val isDefault: Boolean,
	/**
	 * Gets or sets a value indicating whether this instance is forced.
	 */
	@SerialName("IsForced")
	val isForced: Boolean,
	/**
	 * Gets or sets the height.
	 */
	@SerialName("Height")
	val height: Int? = null,
	/**
	 * Gets or sets the width.
	 */
	@SerialName("Width")
	val width: Int? = null,
	/**
	 * Gets or sets the average frame rate.
	 */
	@SerialName("AverageFrameRate")
	val averageFrameRate: Float? = null,
	/**
	 * Gets or sets the real frame rate.
	 */
	@SerialName("RealFrameRate")
	val realFrameRate: Float? = null,
	/**
	 * Gets or sets the profile.
	 */
	@SerialName("Profile")
	val profile: String? = null,
	@SerialName("Type")
	val type: MediaStreamType? = null,
	/**
	 * Gets or sets the aspect ratio.
	 */
	@SerialName("AspectRatio")
	val aspectRatio: String? = null,
	/**
	 * Gets or sets the index.
	 */
	@SerialName("Index")
	val index: Int,
	/**
	 * Gets or sets the score.
	 */
	@SerialName("Score")
	val score: Int? = null,
	/**
	 * Gets or sets a value indicating whether this instance is external.
	 */
	@SerialName("IsExternal")
	val isExternal: Boolean,
	@SerialName("DeliveryMethod")
	val deliveryMethod: SubtitleDeliveryMethod? = null,
	/**
	 * Gets or sets the delivery URL.
	 */
	@SerialName("DeliveryUrl")
	val deliveryUrl: String? = null,
	/**
	 * Gets or sets a value indicating whether this instance is external URL.
	 */
	@SerialName("IsExternalUrl")
	val isExternalUrl: Boolean? = null,
	@SerialName("IsTextSubtitleStream")
	val isTextSubtitleStream: Boolean,
	/**
	 * Gets or sets a value indicating whether [supports external stream].
	 */
	@SerialName("SupportsExternalStream")
	val supportsExternalStream: Boolean,
	/**
	 * Gets or sets the filename.
	 */
	@SerialName("Path")
	val path: String? = null,
	/**
	 * Gets or sets the pixel format.
	 */
	@SerialName("PixelFormat")
	val pixelFormat: String? = null,
	/**
	 * Gets or sets the level.
	 */
	@SerialName("Level")
	val level: Double? = null,
	/**
	 * Gets a value indicating whether this instance is anamorphic.
	 */
	@SerialName("IsAnamorphic")
	val isAnamorphic: Boolean? = null
)
