// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(DateTimeSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.DateTime
import org.jellyfin.sdk.model.serializer.DateTimeSerializer

/**
 * Class ChapterInfo.
 */
@Serializable
public data class ChapterInfo(
	/**
	 * Gets or sets the start position ticks.
	 */
	@SerialName("StartPositionTicks")
	public val startPositionTicks: Long,
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	public val name: String? = null,
	/**
	 * Gets or sets the image path.
	 */
	@SerialName("ImagePath")
	public val imagePath: String? = null,
	@SerialName("ImageDateModified")
	public val imageDateModified: DateTime,
	@SerialName("ImageTag")
	public val imageTag: String? = null,
)
