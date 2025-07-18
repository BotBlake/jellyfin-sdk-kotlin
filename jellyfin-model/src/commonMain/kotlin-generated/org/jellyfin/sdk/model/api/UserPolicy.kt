// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.UUIDSerializer

@Serializable
public data class UserPolicy(
	/**
	 * A value indicating whether this instance is administrator.
	 */
	@SerialName("IsAdministrator")
	public val isAdministrator: Boolean,
	/**
	 * A value indicating whether this instance is hidden.
	 */
	@SerialName("IsHidden")
	public val isHidden: Boolean,
	/**
	 * A value indicating whether this instance can manage collections.
	 */
	@SerialName("EnableCollectionManagement")
	public val enableCollectionManagement: Boolean = false,
	/**
	 * A value indicating whether this instance can manage subtitles.
	 */
	@SerialName("EnableSubtitleManagement")
	public val enableSubtitleManagement: Boolean = false,
	/**
	 * A value indicating whether this user can manage lyrics.
	 */
	@SerialName("EnableLyricManagement")
	public val enableLyricManagement: Boolean = false,
	/**
	 * A value indicating whether this instance is disabled.
	 */
	@SerialName("IsDisabled")
	public val isDisabled: Boolean,
	/**
	 * The max parental rating.
	 */
	@SerialName("MaxParentalRating")
	public val maxParentalRating: Int? = null,
	@SerialName("MaxParentalSubRating")
	public val maxParentalSubRating: Int? = null,
	@SerialName("BlockedTags")
	public val blockedTags: List<String>? = null,
	@SerialName("AllowedTags")
	public val allowedTags: List<String>? = null,
	@SerialName("EnableUserPreferenceAccess")
	public val enableUserPreferenceAccess: Boolean,
	@SerialName("AccessSchedules")
	public val accessSchedules: List<AccessSchedule>? = null,
	@SerialName("BlockUnratedItems")
	public val blockUnratedItems: List<UnratedItem>? = null,
	@SerialName("EnableRemoteControlOfOtherUsers")
	public val enableRemoteControlOfOtherUsers: Boolean,
	@SerialName("EnableSharedDeviceControl")
	public val enableSharedDeviceControl: Boolean,
	@SerialName("EnableRemoteAccess")
	public val enableRemoteAccess: Boolean,
	@SerialName("EnableLiveTvManagement")
	public val enableLiveTvManagement: Boolean,
	@SerialName("EnableLiveTvAccess")
	public val enableLiveTvAccess: Boolean,
	@SerialName("EnableMediaPlayback")
	public val enableMediaPlayback: Boolean,
	@SerialName("EnableAudioPlaybackTranscoding")
	public val enableAudioPlaybackTranscoding: Boolean,
	@SerialName("EnableVideoPlaybackTranscoding")
	public val enableVideoPlaybackTranscoding: Boolean,
	@SerialName("EnablePlaybackRemuxing")
	public val enablePlaybackRemuxing: Boolean,
	@SerialName("ForceRemoteSourceTranscoding")
	public val forceRemoteSourceTranscoding: Boolean,
	@SerialName("EnableContentDeletion")
	public val enableContentDeletion: Boolean,
	@SerialName("EnableContentDeletionFromFolders")
	public val enableContentDeletionFromFolders: List<String>? = null,
	@SerialName("EnableContentDownloading")
	public val enableContentDownloading: Boolean,
	/**
	 * A value indicating whether [enable synchronize].
	 */
	@SerialName("EnableSyncTranscoding")
	public val enableSyncTranscoding: Boolean,
	@SerialName("EnableMediaConversion")
	public val enableMediaConversion: Boolean,
	@SerialName("EnabledDevices")
	public val enabledDevices: List<String>? = null,
	@SerialName("EnableAllDevices")
	public val enableAllDevices: Boolean,
	@SerialName("EnabledChannels")
	public val enabledChannels: List<UUID>? = null,
	@SerialName("EnableAllChannels")
	public val enableAllChannels: Boolean,
	@SerialName("EnabledFolders")
	public val enabledFolders: List<UUID>? = null,
	@SerialName("EnableAllFolders")
	public val enableAllFolders: Boolean,
	@SerialName("InvalidLoginAttemptCount")
	public val invalidLoginAttemptCount: Int,
	@SerialName("LoginAttemptsBeforeLockout")
	public val loginAttemptsBeforeLockout: Int,
	@SerialName("MaxActiveSessions")
	public val maxActiveSessions: Int,
	@SerialName("EnablePublicSharing")
	public val enablePublicSharing: Boolean,
	@SerialName("BlockedMediaFolders")
	public val blockedMediaFolders: List<UUID>? = null,
	@SerialName("BlockedChannels")
	public val blockedChannels: List<UUID>? = null,
	@SerialName("RemoteClientBitrateLimit")
	public val remoteClientBitrateLimit: Int,
	@SerialName("AuthenticationProviderId")
	public val authenticationProviderId: String,
	@SerialName("PasswordResetProviderId")
	public val passwordResetProviderId: String,
	/**
	 * Enum SyncPlayUserAccessType.
	 */
	@SerialName("SyncPlayAccess")
	public val syncPlayAccess: SyncPlayUserAccessType,
)
