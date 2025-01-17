// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Library option info dto.
 */
@Serializable
public data class LibraryOptionInfoDto(
	/**
	 * Gets or sets name.
	 */
	@SerialName("Name")
	public val name: String? = null,
	/**
	 * Gets or sets a value indicating whether default enabled.
	 */
	@SerialName("DefaultEnabled")
	public val defaultEnabled: Boolean,
)
