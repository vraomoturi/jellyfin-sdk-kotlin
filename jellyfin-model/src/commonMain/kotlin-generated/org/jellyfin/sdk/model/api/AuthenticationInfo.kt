// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(
	UUIDSerializer::class,
	DateTimeSerializer::class,
)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.DateTime
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.DateTimeSerializer
import org.jellyfin.sdk.model.serializer.UUIDSerializer

@Serializable
public data class AuthenticationInfo(
	/**
	 * Gets or sets the identifier.
	 */
	@SerialName("Id")
	public val id: Long,
	/**
	 * Gets or sets the access token.
	 */
	@SerialName("AccessToken")
	public val accessToken: String? = null,
	/**
	 * Gets or sets the device identifier.
	 */
	@SerialName("DeviceId")
	public val deviceId: String? = null,
	/**
	 * Gets or sets the name of the application.
	 */
	@SerialName("AppName")
	public val appName: String? = null,
	/**
	 * Gets or sets the application version.
	 */
	@SerialName("AppVersion")
	public val appVersion: String? = null,
	/**
	 * Gets or sets the name of the device.
	 */
	@SerialName("DeviceName")
	public val deviceName: String? = null,
	/**
	 * Gets or sets the user identifier.
	 */
	@SerialName("UserId")
	public val userId: UUID,
	/**
	 * Gets or sets a value indicating whether this instance is active.
	 */
	@SerialName("IsActive")
	public val isActive: Boolean,
	/**
	 * Gets or sets the date created.
	 */
	@SerialName("DateCreated")
	public val dateCreated: DateTime,
	/**
	 * Gets or sets the date revoked.
	 */
	@SerialName("DateRevoked")
	public val dateRevoked: DateTime? = null,
	@SerialName("DateLastActivity")
	public val dateLastActivity: DateTime,
	@SerialName("UserName")
	public val userName: String? = null,
)
