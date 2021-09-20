package org.jellyfin.sdk.api.client.util

import io.ktor.utils.io.*
import kotlinx.serialization.*
import kotlinx.serialization.json.Json

@OptIn(ExperimentalSerializationApi::class, InternalSerializationApi::class)
public object ApiSerializer {
	public val json: Json = Json {
		isLenient = false
		ignoreUnknownKeys = true
		allowSpecialFloatingPointValues = true
		useArrayPolymorphism = false
	}

	public fun encodeRequestBody(requestBody: Any? = null): String? {
		if (requestBody == null) return null

		return json.encodeToString(requestBody::class.serializer() as KSerializer<Any>, requestBody)
	}

	public suspend inline fun <reified T : Any> decodeResponseBody(responseBody: ByteReadChannel): T = when (T::class) {
		is ByteReadChannel -> responseBody as T
		else -> json.decodeFromString(responseBody.readRemaining().readText())
	}
}