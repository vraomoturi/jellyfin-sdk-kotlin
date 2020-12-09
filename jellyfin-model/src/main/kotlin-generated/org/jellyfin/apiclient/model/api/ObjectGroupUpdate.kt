// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.apiclient.model.api

import java.util.UUID
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import kotlinx.serialization.json.JsonElement
import org.jellyfin.apiclient.model.serializer.UUIDSerializer

/**
 * Class GroupUpdate.
 */
@Serializable
public data class ObjectGroupUpdate(
	/**
	 * Gets the group identifier.
	 */
	@SerialName("GroupId")
	public val groupId: UUID,
	@SerialName("Type")
	public val type: GroupUpdateType? = null,
	/**
	 * Gets the update data.
	 */
	@SerialName("Data")
	public val `data`: JsonElement
)
