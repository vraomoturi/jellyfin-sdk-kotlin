// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(DateTimeSerializer::class)

package org.jellyfin.sdk.model.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.DateTime
import org.jellyfin.sdk.model.serializer.DateTimeSerializer

@Serializable
public data class GuideInfo(
	/**
	 * Gets or sets the start date.
	 */
	@SerialName("StartDate")
	public val startDate: DateTime,
	/**
	 * Gets or sets the end date.
	 */
	@SerialName("EndDate")
	public val endDate: DateTime,
)
