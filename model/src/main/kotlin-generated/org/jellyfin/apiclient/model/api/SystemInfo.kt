// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Class SystemInfo.
 */
@Serializable
data class SystemInfo(
	/**
	 * Gets or sets the display name of the operating system.
	 */
	@SerialName("OperatingSystemDisplayName")
	val operatingSystemDisplayName: String? = null,
	/**
	 * Get or sets the package name.
	 */
	@SerialName("PackageName")
	val packageName: String? = null,
	/**
	 * Gets or sets a value indicating whether this instance has pending restart.
	 */
	@SerialName("HasPendingRestart")
	val hasPendingRestart: Boolean,
	@SerialName("IsShuttingDown")
	val isShuttingDown: Boolean,
	/**
	 * Gets or sets a value indicating whether [supports library monitor].
	 */
	@SerialName("SupportsLibraryMonitor")
	val supportsLibraryMonitor: Boolean,
	/**
	 * Gets or sets the web socket port number.
	 */
	@SerialName("WebSocketPortNumber")
	val webSocketPortNumber: Int,
	/**
	 * Gets or sets the completed installations.
	 */
	@SerialName("CompletedInstallations")
	val completedInstallations: List<InstallationInfo>? = null,
	/**
	 * Gets or sets a value indicating whether this instance can self restart.
	 */
	@SerialName("CanSelfRestart")
	val canSelfRestart: Boolean,
	@SerialName("CanLaunchWebBrowser")
	val canLaunchWebBrowser: Boolean,
	/**
	 * Gets or sets the program data path.
	 */
	@SerialName("ProgramDataPath")
	val programDataPath: String? = null,
	/**
	 * Gets or sets the web UI resources path.
	 */
	@SerialName("WebPath")
	val webPath: String? = null,
	/**
	 * Gets or sets the items by name path.
	 */
	@SerialName("ItemsByNamePath")
	val itemsByNamePath: String? = null,
	/**
	 * Gets or sets the cache path.
	 */
	@SerialName("CachePath")
	val cachePath: String? = null,
	/**
	 * Gets or sets the log path.
	 */
	@SerialName("LogPath")
	val logPath: String? = null,
	/**
	 * Gets or sets the internal metadata path.
	 */
	@SerialName("InternalMetadataPath")
	val internalMetadataPath: String? = null,
	/**
	 * Gets or sets the transcode path.
	 */
	@SerialName("TranscodingTempPath")
	val transcodingTempPath: String? = null,
	/**
	 * Gets or sets a value indicating whether this instance has update available.
	 */
	@SerialName("HasUpdateAvailable")
	val hasUpdateAvailable: Boolean,
	@SerialName("EncoderLocation")
	val encoderLocation: FFmpegLocation? = null,
	@SerialName("SystemArchitecture")
	val systemArchitecture: Architecture? = null,
	/**
	 * Gets or sets the local address.
	 */
	@SerialName("LocalAddress")
	val localAddress: String? = null,
	/**
	 * Gets or sets the name of the server.
	 */
	@SerialName("ServerName")
	val serverName: String? = null,
	/**
	 * Gets or sets the server version.
	 */
	@SerialName("Version")
	val version: String? = null,
	/**
	 * Gets or sets the product name. This is the AssemblyProduct name.
	 */
	@SerialName("ProductName")
	val productName: String? = null,
	/**
	 * Gets or sets the operating system.
	 */
	@SerialName("OperatingSystem")
	val operatingSystem: String? = null,
	/**
	 * Gets or sets the id.
	 */
	@SerialName("Id")
	val id: String? = null,
	/**
	 * Gets or sets a value indicating whether the startup wizard is completed.
	 */
	@SerialName("StartupWizardCompleted")
	val startupWizardCompleted: Boolean
)
