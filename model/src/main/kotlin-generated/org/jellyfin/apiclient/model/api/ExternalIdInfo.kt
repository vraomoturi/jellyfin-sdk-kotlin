// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents the external id information for serialization to the client.
 */
@Serializable
data class ExternalIdInfo(
	/**
	 * Gets or sets the display name of the external id provider (IE: IMDB, MusicBrainz, etc).
	 */
	@SerialName("Name")
	val name: String? = null,
	/**
	 * Gets or sets the unique key for this id. This key should be unique across all providers.
	 */
	@SerialName("Key")
	val key: String? = null,
	@SerialName("Type")
	val type: ExternalIdMediaType? = null,
	/**
	 * Gets or sets the URL format string.
	 */
	@SerialName("UrlFormatString")
	val urlFormatString: String? = null
)
