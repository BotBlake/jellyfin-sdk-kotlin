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

@Serializable
public enum class ProgramAudio(
	public val serialName: String,
) {
	@SerialName("Mono")
	MONO("Mono"),
	@SerialName("Stereo")
	STEREO("Stereo"),
	@SerialName("Dolby")
	DOLBY("Dolby"),
	@SerialName("DolbyDigital")
	DOLBY_DIGITAL("DolbyDigital"),
	@SerialName("Thx")
	THX("Thx"),
	@SerialName("Atmos")
	ATMOS("Atmos"),
	;

	/**
	 * Get the serial name of the enum member.
	 */
	override fun toString(): String = serialName

	public companion object {
		/**
		 * Find the enum member by the serial name or return null.
		 */
		public fun fromNameOrNull(serialName: String): ProgramAudio? = when (serialName) {
			"Mono" -> MONO
			"Stereo" -> STEREO
			"Dolby" -> DOLBY
			"DolbyDigital" -> DOLBY_DIGITAL
			"Thx" -> THX
			"Atmos" -> ATMOS
			else -> null
		}

		/**
		 * Find the enum member by the serial name or throw.
		 */
		public fun fromName(serialName: String): ProgramAudio = requireNotNull(fromNameOrNull(serialName)) { """Unknown value $serialName""" }
	}
}
