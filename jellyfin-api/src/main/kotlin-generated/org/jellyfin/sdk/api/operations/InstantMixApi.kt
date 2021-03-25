// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import org.jellyfin.sdk.api.client.KtorClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.model.api.BaseItemDtoQueryResult
import org.jellyfin.sdk.model.api.ImageType
import org.jellyfin.sdk.model.api.ItemFields

public class InstantMixApi(
	private val api: KtorClient
) {
	/**
	 * Creates an instant playlist based on a given album.
	 *
	 * @param id The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param enableImages Optional. Include image information in output.
	 * @param enableUserData Optional. Include user data.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 */
	public suspend fun getInstantMixFromAlbum(
		id: UUID,
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		enableImages: Boolean? = null,
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["id"] = id
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["enableImages"] = enableImages
		queryParameters["enableUserData"] = enableUserData
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Albums/{id}/InstantMix", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Creates an instant playlist based on a given artist.
	 *
	 * @param id The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param enableImages Optional. Include image information in output.
	 * @param enableUserData Optional. Include user data.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 */
	public suspend fun getInstantMixFromArtists(
		id: UUID,
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		enableImages: Boolean? = null,
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["id"] = id
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["enableImages"] = enableImages
		queryParameters["enableUserData"] = enableUserData
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Artists/{id}/InstantMix", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Creates an instant playlist based on a given artist.
	 *
	 * @param id The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param enableImages Optional. Include image information in output.
	 * @param enableUserData Optional. Include user data.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getInstantMixFromArtists2(
		id: UUID,
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		enableImages: Boolean? = null,
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["id"] = id
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["enableImages"] = enableImages
		queryParameters["enableUserData"] = enableUserData
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Artists/InstantMix", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Creates an instant playlist based on a given item.
	 *
	 * @param id The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param enableImages Optional. Include image information in output.
	 * @param enableUserData Optional. Include user data.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 */
	public suspend fun getInstantMixFromItem(
		id: UUID,
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		enableImages: Boolean? = null,
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["id"] = id
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["enableImages"] = enableImages
		queryParameters["enableUserData"] = enableUserData
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Items/{id}/InstantMix", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Creates an instant playlist based on a given genre.
	 *
	 * @param id The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param enableImages Optional. Include image information in output.
	 * @param enableUserData Optional. Include user data.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 */
	public suspend fun getInstantMixFromMusicGenreById(
		id: UUID,
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		enableImages: Boolean? = null,
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["id"] = id
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["enableImages"] = enableImages
		queryParameters["enableUserData"] = enableUserData
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/MusicGenres/{id}/InstantMix", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Creates an instant playlist based on a given genre.
	 *
	 * @param name The genre name.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param enableImages Optional. Include image information in output.
	 * @param enableUserData Optional. Include user data.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 */
	public suspend fun getInstantMixFromMusicGenreByName(
		name: String,
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		enableImages: Boolean? = null,
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["name"] = name
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["enableImages"] = enableImages
		queryParameters["enableUserData"] = enableUserData
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/MusicGenres/{name}/InstantMix", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Creates an instant playlist based on a given genre.
	 *
	 * @param id The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param enableImages Optional. Include image information in output.
	 * @param enableUserData Optional. Include user data.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getInstantMixFromMusicGenreById2(
		id: UUID,
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		enableImages: Boolean? = null,
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["id"] = id
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["enableImages"] = enableImages
		queryParameters["enableUserData"] = enableUserData
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/MusicGenres/InstantMix", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Creates an instant playlist based on a given playlist.
	 *
	 * @param id The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param enableImages Optional. Include image information in output.
	 * @param enableUserData Optional. Include user data.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 */
	public suspend fun getInstantMixFromPlaylist(
		id: UUID,
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		enableImages: Boolean? = null,
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["id"] = id
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["enableImages"] = enableImages
		queryParameters["enableUserData"] = enableUserData
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Playlists/{id}/InstantMix", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Creates an instant playlist based on a given song.
	 *
	 * @param id The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param enableImages Optional. Include image information in output.
	 * @param enableUserData Optional. Include user data.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 */
	public suspend fun getInstantMixFromSong(
		id: UUID,
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		enableImages: Boolean? = null,
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["id"] = id
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["enableImages"] = enableImages
		queryParameters["enableUserData"] = enableUserData
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Songs/{id}/InstantMix", pathParameters,
				queryParameters, data)
		return response
	}
}
