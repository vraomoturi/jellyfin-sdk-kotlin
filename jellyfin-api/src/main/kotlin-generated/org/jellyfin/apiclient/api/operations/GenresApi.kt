// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.BaseItemDto
import org.jellyfin.apiclient.model.api.BaseItemDtoQueryResult
import org.jellyfin.apiclient.model.api.ImageType
import org.jellyfin.apiclient.model.api.ItemFields

public class GenresApi(
	private val api: KtorClient
) {
	/**
	 * Gets all genres from a given item, folder, or the entire library.
	 *
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param searchTerm The search term.
	 * @param parentId Specify this to localize the search to a specific item or folder. Omit to use
	 * the root.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param excludeItemTypes Optional. If specified, results will be filtered out based on item type.
	 * This allows multiple, comma delimited.
	 * @param includeItemTypes Optional. If specified, results will be filtered in based on item type.
	 * This allows multiple, comma delimited.
	 * @param isFavorite Optional filter by items that are marked as favorite, or not.
	 * @param imageTypeLimit Optional, the max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 * @param userId User id.
	 * @param nameStartsWithOrGreater Optional filter by items whose name is sorted equally or greater
	 * than a given input string.
	 * @param nameStartsWith Optional filter by items whose name is sorted equally than a given input
	 * string.
	 * @param nameLessThan Optional filter by items whose name is equally or lesser than a given input
	 * string.
	 * @param enableImages Optional, include image information in output.
	 * @param enableTotalRecordCount Optional. Include total record count.
	 */
	public suspend fun getGenres(
		startIndex: Int? = null,
		limit: Int? = null,
		searchTerm: String? = null,
		parentId: UUID? = null,
		fields: List<ItemFields>? = emptyList(),
		excludeItemTypes: List<String>? = emptyList(),
		includeItemTypes: List<String>? = emptyList(),
		isFavorite: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList(),
		userId: UUID? = null,
		nameStartsWithOrGreater: String? = null,
		nameStartsWith: String? = null,
		nameLessThan: String? = null,
		enableImages: Boolean? = true,
		enableTotalRecordCount: Boolean = true
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["startIndex"] = startIndex
		queryParameters["limit"] = limit
		queryParameters["searchTerm"] = searchTerm
		queryParameters["parentId"] = parentId
		queryParameters["fields"] = fields
		queryParameters["excludeItemTypes"] = excludeItemTypes
		queryParameters["includeItemTypes"] = includeItemTypes
		queryParameters["isFavorite"] = isFavorite
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		queryParameters["userId"] = userId
		queryParameters["nameStartsWithOrGreater"] = nameStartsWithOrGreater
		queryParameters["nameStartsWith"] = nameStartsWith
		queryParameters["nameLessThan"] = nameLessThan
		queryParameters["enableImages"] = enableImages
		queryParameters["enableTotalRecordCount"] = enableTotalRecordCount
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Genres", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets a genre, by name.
	 *
	 * @param genreName The genre name.
	 * @param userId The user id.
	 */
	public suspend fun getGenre(genreName: String, userId: UUID? = null): Response<BaseItemDto> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["genreName"] = genreName
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		val data = null
		val response = api.`get`<BaseItemDto>("/Genres/{genreName}", pathParameters, queryParameters,
				data)
		return response
	}
}
