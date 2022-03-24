// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(
	UUIDSerializer::class,
	DateTimeSerializer::class,
)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.DateTime
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.DateTimeSerializer
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Class SeriesTimerInfoDto.
 */
@Serializable
public data class SeriesTimerInfoDto(
	/**
	 * Id of the recording.
	 */
	@SerialName("Id")
	public val id: String? = null,
	@SerialName("Type")
	public val type: String? = null,
	/**
	 * Gets or sets the server identifier.
	 */
	@SerialName("ServerId")
	public val serverId: String? = null,
	/**
	 * Gets or sets the external identifier.
	 */
	@SerialName("ExternalId")
	public val externalId: String? = null,
	/**
	 * ChannelId of the recording.
	 */
	@SerialName("ChannelId")
	public val channelId: UUID,
	/**
	 * Gets or sets the external channel identifier.
	 */
	@SerialName("ExternalChannelId")
	public val externalChannelId: String? = null,
	/**
	 * ChannelName of the recording.
	 */
	@SerialName("ChannelName")
	public val channelName: String? = null,
	@SerialName("ChannelPrimaryImageTag")
	public val channelPrimaryImageTag: String? = null,
	/**
	 * Gets or sets the program identifier.
	 */
	@SerialName("ProgramId")
	public val programId: String? = null,
	/**
	 * Gets or sets the external program identifier.
	 */
	@SerialName("ExternalProgramId")
	public val externalProgramId: String? = null,
	/**
	 * Name of the recording.
	 */
	@SerialName("Name")
	public val name: String? = null,
	/**
	 * Description of the recording.
	 */
	@SerialName("Overview")
	public val overview: String? = null,
	/**
	 * The start date of the recording, in UTC.
	 */
	@SerialName("StartDate")
	public val startDate: DateTime,
	/**
	 * The end date of the recording, in UTC.
	 */
	@SerialName("EndDate")
	public val endDate: DateTime,
	/**
	 * Gets or sets the name of the service.
	 */
	@SerialName("ServiceName")
	public val serviceName: String? = null,
	/**
	 * Gets or sets the priority.
	 */
	@SerialName("Priority")
	public val priority: Int,
	/**
	 * Gets or sets the pre padding seconds.
	 */
	@SerialName("PrePaddingSeconds")
	public val prePaddingSeconds: Int,
	/**
	 * Gets or sets the post padding seconds.
	 */
	@SerialName("PostPaddingSeconds")
	public val postPaddingSeconds: Int,
	/**
	 * Gets or sets a value indicating whether this instance is pre padding required.
	 */
	@SerialName("IsPrePaddingRequired")
	public val isPrePaddingRequired: Boolean,
	/**
	 * If the item does not have any backdrops, this will hold the Id of the Parent that has one.
	 */
	@SerialName("ParentBackdropItemId")
	public val parentBackdropItemId: String? = null,
	/**
	 * Gets or sets the parent backdrop image tags.
	 */
	@SerialName("ParentBackdropImageTags")
	public val parentBackdropImageTags: List<String>? = null,
	/**
	 * Gets or sets a value indicating whether this instance is post padding required.
	 */
	@SerialName("IsPostPaddingRequired")
	public val isPostPaddingRequired: Boolean,
	@SerialName("KeepUntil")
	public val keepUntil: KeepUntil,
	/**
	 * Gets or sets a value indicating whether [record any time].
	 */
	@SerialName("RecordAnyTime")
	public val recordAnyTime: Boolean,
	@SerialName("SkipEpisodesInLibrary")
	public val skipEpisodesInLibrary: Boolean,
	/**
	 * Gets or sets a value indicating whether [record any channel].
	 */
	@SerialName("RecordAnyChannel")
	public val recordAnyChannel: Boolean,
	@SerialName("KeepUpTo")
	public val keepUpTo: Int,
	/**
	 * Gets or sets a value indicating whether [record new only].
	 */
	@SerialName("RecordNewOnly")
	public val recordNewOnly: Boolean,
	/**
	 * Gets or sets the days.
	 */
	@SerialName("Days")
	public val days: List<DayOfWeek>? = null,
	/**
	 * Gets or sets the day pattern.
	 */
	@SerialName("DayPattern")
	public val dayPattern: DayPattern? = null,
	/**
	 * Gets or sets the image tags.
	 */
	@SerialName("ImageTags")
	public val imageTags: Map<ImageType, String>? = null,
	/**
	 * Gets or sets the parent thumb item id.
	 */
	@SerialName("ParentThumbItemId")
	public val parentThumbItemId: String? = null,
	/**
	 * Gets or sets the parent thumb image tag.
	 */
	@SerialName("ParentThumbImageTag")
	public val parentThumbImageTag: String? = null,
	/**
	 * Gets or sets the parent primary image item identifier.
	 */
	@SerialName("ParentPrimaryImageItemId")
	public val parentPrimaryImageItemId: String? = null,
	/**
	 * Gets or sets the parent primary image tag.
	 */
	@SerialName("ParentPrimaryImageTag")
	public val parentPrimaryImageTag: String? = null,
)
