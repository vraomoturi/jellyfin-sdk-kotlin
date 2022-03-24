// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Class InstallationInfo.
 */
@Serializable
public data class InstallationInfo(
	/**
	 * Gets or sets the Id.
	 */
	@SerialName("Guid")
	public val guid: UUID,
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	public val name: String? = null,
	/**
	 * Gets or sets the version.
	 */
	@SerialName("Version")
	public val version: Version? = null,
	/**
	 * Gets or sets the changelog for this version.
	 */
	@SerialName("Changelog")
	public val changelog: String? = null,
	/**
	 * Gets or sets the source URL.
	 */
	@SerialName("SourceUrl")
	public val sourceUrl: String? = null,
	/**
	 * Gets or sets a checksum for the binary.
	 */
	@SerialName("Checksum")
	public val checksum: String? = null,
	/**
	 * Gets or sets package information for the installation.
	 */
	@SerialName("PackageInfo")
	public val packageInfo: PackageInfo? = null,
)
