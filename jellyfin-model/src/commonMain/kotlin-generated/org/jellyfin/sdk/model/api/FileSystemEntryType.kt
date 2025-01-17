// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Enum FileSystemEntryType.
 */
@Serializable
public enum class FileSystemEntryType(
	public val serialName: String,
) {
	@SerialName("File")
	FILE("File"),
	@SerialName("Directory")
	DIRECTORY("Directory"),
	@SerialName("NetworkComputer")
	NETWORK_COMPUTER("NetworkComputer"),
	@SerialName("NetworkShare")
	NETWORK_SHARE("NetworkShare"),
	;

	public override fun toString(): String = serialName
}
