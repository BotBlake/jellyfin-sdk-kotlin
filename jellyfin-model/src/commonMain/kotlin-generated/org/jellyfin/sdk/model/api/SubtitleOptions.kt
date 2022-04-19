// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class SubtitleOptions(
	@SerialName("SkipIfEmbeddedSubtitlesPresent")
	public val skipIfEmbeddedSubtitlesPresent: Boolean,
	@SerialName("SkipIfAudioTrackMatches")
	public val skipIfAudioTrackMatches: Boolean,
	@SerialName("DownloadLanguages")
	public val downloadLanguages: List<String>? = null,
	@SerialName("DownloadMovieSubtitles")
	public val downloadMovieSubtitles: Boolean,
	@SerialName("DownloadEpisodeSubtitles")
	public val downloadEpisodeSubtitles: Boolean,
	@SerialName("OpenSubtitlesUsername")
	public val openSubtitlesUsername: String? = null,
	@SerialName("OpenSubtitlesPasswordHash")
	public val openSubtitlesPasswordHash: String? = null,
	@SerialName("IsOpenSubtitleVipAccount")
	public val isOpenSubtitleVipAccount: Boolean,
	@SerialName("RequirePerfectMatch")
	public val requirePerfectMatch: Boolean,
)
