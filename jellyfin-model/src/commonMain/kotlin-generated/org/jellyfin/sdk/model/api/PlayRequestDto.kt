// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.Int
import kotlin.Long
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Class PlayRequestDto.
 */
@Serializable
public data class PlayRequestDto(
	/**
	 * Gets or sets the playing queue.
	 */
	@SerialName("PlayingQueue")
	public val playingQueue: List<UUID>,
	/**
	 * Gets or sets the position of the playing item in the queue.
	 */
	@SerialName("PlayingItemPosition")
	public val playingItemPosition: Int,
	/**
	 * Gets or sets the start position ticks.
	 */
	@SerialName("StartPositionTicks")
	public val startPositionTicks: Long
)
