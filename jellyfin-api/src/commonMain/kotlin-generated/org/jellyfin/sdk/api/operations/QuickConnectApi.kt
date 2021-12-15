// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.emptyMap
import kotlin.collections.mutableMapOf
import org.jellyfin.sdk.api.client.ApiClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.extensions.`get`
import org.jellyfin.sdk.api.client.extensions.post
import org.jellyfin.sdk.model.api.QuickConnectResult

public class QuickConnectApi(
	private val api: ApiClient
) : Api {
	/**
	 * Authorizes a pending quick connect request.
	 *
	 * @param code Quick connect code to authorize.
	 */
	public suspend fun authorize(code: String): Response<Boolean> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["code"] = code
		val data = null
		val response = api.post<Boolean>("/QuickConnect/Authorize", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Attempts to retrieve authentication information.
	 *
	 * @param secret Secret previously returned from the Initiate endpoint.
	 */
	public suspend fun connect(secret: String): Response<QuickConnectResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["secret"] = secret
		val data = null
		val response = api.`get`<QuickConnectResult>("/QuickConnect/Connect", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets the current quick connect state.
	 */
	public suspend fun getEnabled(): Response<Boolean> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<Boolean>("/QuickConnect/Enabled", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Initiate a new quick connect request.
	 */
	public suspend fun initiate(): Response<QuickConnectResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<QuickConnectResult>("/QuickConnect/Initiate", pathParameters,
				queryParameters, data)
		return response
	}
}
