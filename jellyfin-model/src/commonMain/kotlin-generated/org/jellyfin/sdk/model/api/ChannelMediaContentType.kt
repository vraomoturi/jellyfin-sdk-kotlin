// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public enum class ChannelMediaContentType(
	public val serialName: String,
) {
	@SerialName("Clip")
	CLIP("Clip"),
	@SerialName("Podcast")
	PODCAST("Podcast"),
	@SerialName("Trailer")
	TRAILER("Trailer"),
	@SerialName("Movie")
	MOVIE("Movie"),
	@SerialName("Episode")
	EPISODE("Episode"),
	@SerialName("Song")
	SONG("Song"),
	@SerialName("MovieExtra")
	MOVIE_EXTRA("MovieExtra"),
	@SerialName("TvExtra")
	TV_EXTRA("TvExtra"),
	;

	public override fun toString(): String = serialName
}
