// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

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
public data class SystemInfo(
	/**
	 * Gets or sets the local address.
	 */
	@SerialName("LocalAddress")
	public val localAddress: String? = null,
	/**
	 * Gets or sets the name of the server.
	 */
	@SerialName("ServerName")
	public val serverName: String? = null,
	/**
	 * Gets or sets the server version.
	 */
	@SerialName("Version")
	public val version: String? = null,
	/**
	 * Gets or sets the product name. This is the AssemblyProduct name.
	 */
	@SerialName("ProductName")
	public val productName: String? = null,
	/**
	 * Gets or sets the operating system.
	 */
	@SerialName("OperatingSystem")
	public val operatingSystem: String? = null,
	/**
	 * Gets or sets the id.
	 */
	@SerialName("Id")
	public val id: String? = null,
	/**
	 * Gets or sets a value indicating whether the startup wizard is completed.
	 */
	@SerialName("StartupWizardCompleted")
	public val startupWizardCompleted: Boolean? = null,
	/**
	 * Gets or sets the display name of the operating system.
	 */
	@SerialName("OperatingSystemDisplayName")
	public val operatingSystemDisplayName: String? = null,
	/**
	 * Get or sets the package name.
	 */
	@SerialName("PackageName")
	public val packageName: String? = null,
	/**
	 * Gets or sets a value indicating whether this instance has pending restart.
	 */
	@SerialName("HasPendingRestart")
	public val hasPendingRestart: Boolean,
	@SerialName("IsShuttingDown")
	public val isShuttingDown: Boolean,
	/**
	 * Gets or sets a value indicating whether [supports library monitor].
	 */
	@SerialName("SupportsLibraryMonitor")
	public val supportsLibraryMonitor: Boolean,
	/**
	 * Gets or sets the web socket port number.
	 */
	@SerialName("WebSocketPortNumber")
	public val webSocketPortNumber: Int,
	/**
	 * Gets or sets the completed installations.
	 */
	@SerialName("CompletedInstallations")
	public val completedInstallations: List<InstallationInfo>? = null,
	/**
	 * Gets or sets a value indicating whether this instance can self restart.
	 */
	@SerialName("CanSelfRestart")
	public val canSelfRestart: Boolean,
	@SerialName("CanLaunchWebBrowser")
	public val canLaunchWebBrowser: Boolean,
	/**
	 * Gets or sets the program data path.
	 */
	@SerialName("ProgramDataPath")
	public val programDataPath: String? = null,
	/**
	 * Gets or sets the web UI resources path.
	 */
	@SerialName("WebPath")
	public val webPath: String? = null,
	/**
	 * Gets or sets the items by name path.
	 */
	@SerialName("ItemsByNamePath")
	public val itemsByNamePath: String? = null,
	/**
	 * Gets or sets the cache path.
	 */
	@SerialName("CachePath")
	public val cachePath: String? = null,
	/**
	 * Gets or sets the log path.
	 */
	@SerialName("LogPath")
	public val logPath: String? = null,
	/**
	 * Gets or sets the internal metadata path.
	 */
	@SerialName("InternalMetadataPath")
	public val internalMetadataPath: String? = null,
	/**
	 * Gets or sets the transcode path.
	 */
	@SerialName("TranscodingTempPath")
	public val transcodingTempPath: String? = null,
	/**
	 * Gets or sets a value indicating whether this instance has update available.
	 */
	@SerialName("HasUpdateAvailable")
	public val hasUpdateAvailable: Boolean,
	/**
	 * Enum describing the location of the FFmpeg tool.
	 */
	@SerialName("EncoderLocation")
	public val encoderLocation: FFmpegLocation,
	@SerialName("SystemArchitecture")
	public val systemArchitecture: Architecture,
)
