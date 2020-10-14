// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Int
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Class MediaAttachment.
 */
@Serializable
data class MediaAttachment(
	/**
	 * Gets or sets the codec.
	 */
	@SerialName("Codec")
	val codec: String? = null,
	/**
	 * Gets or sets the codec tag.
	 */
	@SerialName("CodecTag")
	val codecTag: String? = null,
	/**
	 * Gets or sets the comment.
	 */
	@SerialName("Comment")
	val comment: String? = null,
	/**
	 * Gets or sets the index.
	 */
	@SerialName("Index")
	val index: Int,
	/**
	 * Gets or sets the filename.
	 */
	@SerialName("FileName")
	val fileName: String? = null,
	/**
	 * Gets or sets the MIME type.
	 */
	@SerialName("MimeType")
	val mimeType: String? = null,
	/**
	 * Gets or sets the delivery URL.
	 */
	@SerialName("DeliveryUrl")
	val deliveryUrl: String? = null
)