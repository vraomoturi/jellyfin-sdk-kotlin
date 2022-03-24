// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(
	DateTimeSerializer::class,
	UUIDSerializer::class,
)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Long
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.DateTime
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.DateTimeSerializer
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Class ReadyRequest.
 */
@Serializable
public data class ReadyRequestDto(
	/**
	 * Gets or sets when the request has been made by the client.
	 */
	@SerialName("When")
	public val `when`: DateTime,
	/**
	 * Gets or sets the position ticks.
	 */
	@SerialName("PositionTicks")
	public val positionTicks: Long,
	/**
	 * Gets or sets a value indicating whether the client playback is unpaused.
	 */
	@SerialName("IsPlaying")
	public val isPlaying: Boolean,
	/**
	 * Gets or sets the playlist item identifier of the playing item.
	 */
	@SerialName("PlaylistItemId")
	public val playlistItemId: UUID,
)
