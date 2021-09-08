// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.Map
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defines the display preferences for any item that supports them (usually Folders).
 */
@Serializable
public data class DisplayPreferencesDto(
	/**
	 * Gets or sets the user id.
	 */
	@SerialName("Id")
	public val id: String? = null,
	/**
	 * Gets or sets the type of the view.
	 */
	@SerialName("ViewType")
	public val viewType: String? = null,
	/**
	 * Gets or sets the sort by.
	 */
	@SerialName("SortBy")
	public val sortBy: String? = null,
	/**
	 * Gets or sets the index by.
	 */
	@SerialName("IndexBy")
	public val indexBy: String? = null,
	/**
	 * Gets or sets a value indicating whether [remember indexing].
	 */
	@SerialName("RememberIndexing")
	public val rememberIndexing: Boolean,
	/**
	 * Gets or sets the height of the primary image.
	 */
	@SerialName("PrimaryImageHeight")
	public val primaryImageHeight: Int,
	/**
	 * Gets or sets the width of the primary image.
	 */
	@SerialName("PrimaryImageWidth")
	public val primaryImageWidth: Int,
	/**
	 * Gets or sets the custom prefs.
	 */
	@SerialName("CustomPrefs")
	public val customPrefs: Map<String, String>? = null,
	/**
	 * Gets or sets the scroll direction.
	 */
	@SerialName("ScrollDirection")
	public val scrollDirection: ScrollDirection,
	/**
	 * Gets or sets a value indicating whether to show backdrops on this item.
	 */
	@SerialName("ShowBackdrop")
	public val showBackdrop: Boolean,
	/**
	 * Gets or sets a value indicating whether [remember sorting].
	 */
	@SerialName("RememberSorting")
	public val rememberSorting: Boolean,
	/**
	 * Gets or sets the sort order.
	 */
	@SerialName("SortOrder")
	public val sortOrder: SortOrder,
	/**
	 * Gets or sets a value indicating whether [show sidebar].
	 */
	@SerialName("ShowSidebar")
	public val showSidebar: Boolean,
	/**
	 * Gets or sets the client.
	 */
	@SerialName("Client")
	public val client: String? = null
)
