// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Channel mapping options dto.
 */
@Serializable
public data class ChannelMappingOptionsDto(
	/**
	 * Gets or sets list of tuner channels.
	 */
	@SerialName("TunerChannels")
	public val tunerChannels: List<TunerChannelMapping>? = null,
	/**
	 * Gets or sets list of provider channels.
	 */
	@SerialName("ProviderChannels")
	public val providerChannels: List<NameIdPair>? = null,
	/**
	 * Gets or sets list of mappings.
	 */
	@SerialName("Mappings")
	public val mappings: List<NameValuePair>? = null,
	/**
	 * Gets or sets provider name.
	 */
	@SerialName("ProviderName")
	public val providerName: String? = null,
)
