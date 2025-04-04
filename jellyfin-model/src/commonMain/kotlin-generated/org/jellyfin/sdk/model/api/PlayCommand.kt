// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlin.requireNotNull
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Enum PlayCommand.
 */
@Serializable
public enum class PlayCommand(
	public val serialName: String,
) {
	@SerialName("PlayNow")
	PLAY_NOW("PlayNow"),
	@SerialName("PlayNext")
	PLAY_NEXT("PlayNext"),
	@SerialName("PlayLast")
	PLAY_LAST("PlayLast"),
	@SerialName("PlayInstantMix")
	PLAY_INSTANT_MIX("PlayInstantMix"),
	@SerialName("PlayShuffle")
	PLAY_SHUFFLE("PlayShuffle"),
	;

	/**
	 * Get the serial name of the enum member.
	 */
	override fun toString(): String = serialName

	public companion object {
		/**
		 * Find the enum member by the serial name or return null.
		 */
		public fun fromNameOrNull(serialName: String): PlayCommand? = when (serialName) {
			"PlayNow" -> PLAY_NOW
			"PlayNext" -> PLAY_NEXT
			"PlayLast" -> PLAY_LAST
			"PlayInstantMix" -> PLAY_INSTANT_MIX
			"PlayShuffle" -> PLAY_SHUFFLE
			else -> null
		}

		/**
		 * Find the enum member by the serial name or throw.
		 */
		public fun fromName(serialName: String): PlayCommand = requireNotNull(fromNameOrNull(serialName)) { """Unknown value $serialName""" }
	}
}
