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

/**
 * Class UtcTimeResponse.
 */
@Serializable
public data class UtcTimeResponse(
	/**
	 * Gets the UTC time when request has been received.
	 */
	@SerialName("RequestReceptionTime")
	public val requestReceptionTime: DateTime,
	/**
	 * Gets the UTC time when response has been sent.
	 */
	@SerialName("ResponseTransmissionTime")
	public val responseTransmissionTime: DateTime,
)
