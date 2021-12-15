// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(
	UUIDSerializer::class,
	DateTimeSerializer::class
)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
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
 * This is strictly used as a data transfer object from the api layer.
 * This holds information about a BaseItem in a format that is convenient for the client.
 */
@Serializable
public data class BaseItemDto(
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	public val name: String? = null,
	@SerialName("OriginalTitle")
	public val originalTitle: String? = null,
	/**
	 * Gets or sets the server identifier.
	 */
	@SerialName("ServerId")
	public val serverId: String? = null,
	/**
	 * Gets or sets the id.
	 */
	@SerialName("Id")
	public val id: UUID,
	/**
	 * Gets or sets the etag.
	 */
	@SerialName("Etag")
	public val etag: String? = null,
	/**
	 * Gets or sets the type of the source.
	 */
	@SerialName("SourceType")
	public val sourceType: String? = null,
	/**
	 * Gets or sets the playlist item identifier.
	 */
	@SerialName("PlaylistItemId")
	public val playlistItemId: String? = null,
	/**
	 * Gets or sets the date created.
	 */
	@SerialName("DateCreated")
	public val dateCreated: DateTime? = null,
	@SerialName("DateLastMediaAdded")
	public val dateLastMediaAdded: DateTime? = null,
	@SerialName("ExtraType")
	public val extraType: String? = null,
	@SerialName("AirsBeforeSeasonNumber")
	public val airsBeforeSeasonNumber: Int? = null,
	@SerialName("AirsAfterSeasonNumber")
	public val airsAfterSeasonNumber: Int? = null,
	@SerialName("AirsBeforeEpisodeNumber")
	public val airsBeforeEpisodeNumber: Int? = null,
	@SerialName("CanDelete")
	public val canDelete: Boolean? = null,
	@SerialName("CanDownload")
	public val canDownload: Boolean? = null,
	@SerialName("HasSubtitles")
	public val hasSubtitles: Boolean? = null,
	@SerialName("PreferredMetadataLanguage")
	public val preferredMetadataLanguage: String? = null,
	@SerialName("PreferredMetadataCountryCode")
	public val preferredMetadataCountryCode: String? = null,
	/**
	 * Gets or sets a value indicating whether [supports synchronize].
	 */
	@SerialName("SupportsSync")
	public val supportsSync: Boolean? = null,
	@SerialName("Container")
	public val container: String? = null,
	/**
	 * Gets or sets the name of the sort.
	 */
	@SerialName("SortName")
	public val sortName: String? = null,
	@SerialName("ForcedSortName")
	public val forcedSortName: String? = null,
	/**
	 * Gets or sets the video3 D format.
	 */
	@SerialName("Video3DFormat")
	public val video3dFormat: Video3dFormat? = null,
	/**
	 * Gets or sets the premiere date.
	 */
	@SerialName("PremiereDate")
	public val premiereDate: DateTime? = null,
	/**
	 * Gets or sets the external urls.
	 */
	@SerialName("ExternalUrls")
	public val externalUrls: List<ExternalUrl>? = null,
	/**
	 * Gets or sets the media versions.
	 */
	@SerialName("MediaSources")
	public val mediaSources: List<MediaSourceInfo>? = null,
	/**
	 * Gets or sets the critic rating.
	 */
	@SerialName("CriticRating")
	public val criticRating: Float? = null,
	@SerialName("ProductionLocations")
	public val productionLocations: List<String>? = null,
	/**
	 * Gets or sets the path.
	 */
	@SerialName("Path")
	public val path: String? = null,
	@SerialName("EnableMediaSourceDisplay")
	public val enableMediaSourceDisplay: Boolean? = null,
	/**
	 * Gets or sets the official rating.
	 */
	@SerialName("OfficialRating")
	public val officialRating: String? = null,
	/**
	 * Gets or sets the custom rating.
	 */
	@SerialName("CustomRating")
	public val customRating: String? = null,
	/**
	 * Gets or sets the channel identifier.
	 */
	@SerialName("ChannelId")
	public val channelId: UUID? = null,
	@SerialName("ChannelName")
	public val channelName: String? = null,
	/**
	 * Gets or sets the overview.
	 */
	@SerialName("Overview")
	public val overview: String? = null,
	/**
	 * Gets or sets the taglines.
	 */
	@SerialName("Taglines")
	public val taglines: List<String>? = null,
	/**
	 * Gets or sets the genres.
	 */
	@SerialName("Genres")
	public val genres: List<String>? = null,
	/**
	 * Gets or sets the community rating.
	 */
	@SerialName("CommunityRating")
	public val communityRating: Float? = null,
	/**
	 * Gets or sets the cumulative run time ticks.
	 */
	@SerialName("CumulativeRunTimeTicks")
	public val cumulativeRunTimeTicks: Long? = null,
	/**
	 * Gets or sets the run time ticks.
	 */
	@SerialName("RunTimeTicks")
	public val runTimeTicks: Long? = null,
	/**
	 * Gets or sets the play access.
	 */
	@SerialName("PlayAccess")
	public val playAccess: PlayAccess? = null,
	/**
	 * Gets or sets the aspect ratio.
	 */
	@SerialName("AspectRatio")
	public val aspectRatio: String? = null,
	/**
	 * Gets or sets the production year.
	 */
	@SerialName("ProductionYear")
	public val productionYear: Int? = null,
	/**
	 * Gets or sets a value indicating whether this instance is place holder.
	 */
	@SerialName("IsPlaceHolder")
	public val isPlaceHolder: Boolean? = null,
	/**
	 * Gets or sets the number.
	 */
	@SerialName("Number")
	public val number: String? = null,
	@SerialName("ChannelNumber")
	public val channelNumber: String? = null,
	/**
	 * Gets or sets the index number.
	 */
	@SerialName("IndexNumber")
	public val indexNumber: Int? = null,
	/**
	 * Gets or sets the index number end.
	 */
	@SerialName("IndexNumberEnd")
	public val indexNumberEnd: Int? = null,
	/**
	 * Gets or sets the parent index number.
	 */
	@SerialName("ParentIndexNumber")
	public val parentIndexNumber: Int? = null,
	/**
	 * Gets or sets the trailer urls.
	 */
	@SerialName("RemoteTrailers")
	public val remoteTrailers: List<MediaUrl>? = null,
	/**
	 * Gets or sets the provider ids.
	 */
	@SerialName("ProviderIds")
	public val providerIds: Map<String, String?>? = null,
	/**
	 * Gets or sets a value indicating whether this instance is HD.
	 */
	@SerialName("IsHD")
	public val isHd: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether this instance is folder.
	 */
	@SerialName("IsFolder")
	public val isFolder: Boolean? = null,
	/**
	 * Gets or sets the parent id.
	 */
	@SerialName("ParentId")
	public val parentId: UUID? = null,
	/**
	 * The base item kind.
	 */
	@SerialName("Type")
	public val type: BaseItemKind,
	/**
	 * Gets or sets the people.
	 */
	@SerialName("People")
	public val people: List<BaseItemPerson>? = null,
	/**
	 * Gets or sets the studios.
	 */
	@SerialName("Studios")
	public val studios: List<NameGuidPair>? = null,
	@SerialName("GenreItems")
	public val genreItems: List<NameGuidPair>? = null,
	/**
	 * Gets or sets wether the item has a logo, this will hold the Id of the Parent that has one.
	 */
	@SerialName("ParentLogoItemId")
	public val parentLogoItemId: String? = null,
	/**
	 * Gets or sets wether the item has any backdrops, this will hold the Id of the Parent that has
	 * one.
	 */
	@SerialName("ParentBackdropItemId")
	public val parentBackdropItemId: String? = null,
	/**
	 * Gets or sets the parent backdrop image tags.
	 */
	@SerialName("ParentBackdropImageTags")
	public val parentBackdropImageTags: List<String>? = null,
	/**
	 * Gets or sets the local trailer count.
	 */
	@SerialName("LocalTrailerCount")
	public val localTrailerCount: Int? = null,
	/**
	 * Gets or sets the user data for this item based on the user it's being requested for.
	 */
	@SerialName("UserData")
	public val userData: UserItemDataDto? = null,
	/**
	 * Gets or sets the recursive item count.
	 */
	@SerialName("RecursiveItemCount")
	public val recursiveItemCount: Int? = null,
	/**
	 * Gets or sets the child count.
	 */
	@SerialName("ChildCount")
	public val childCount: Int? = null,
	/**
	 * Gets or sets the name of the series.
	 */
	@SerialName("SeriesName")
	public val seriesName: String? = null,
	/**
	 * Gets or sets the series id.
	 */
	@SerialName("SeriesId")
	public val seriesId: UUID? = null,
	/**
	 * Gets or sets the season identifier.
	 */
	@SerialName("SeasonId")
	public val seasonId: UUID? = null,
	/**
	 * Gets or sets the special feature count.
	 */
	@SerialName("SpecialFeatureCount")
	public val specialFeatureCount: Int? = null,
	/**
	 * Gets or sets the display preferences id.
	 */
	@SerialName("DisplayPreferencesId")
	public val displayPreferencesId: String? = null,
	/**
	 * Gets or sets the status.
	 */
	@SerialName("Status")
	public val status: String? = null,
	/**
	 * Gets or sets the air time.
	 */
	@SerialName("AirTime")
	public val airTime: String? = null,
	/**
	 * Gets or sets the air days.
	 */
	@SerialName("AirDays")
	public val airDays: List<DayOfWeek>? = null,
	/**
	 * Gets or sets the tags.
	 */
	@SerialName("Tags")
	public val tags: List<String>? = null,
	/**
	 * Gets or sets the primary image aspect ratio, after image enhancements.
	 */
	@SerialName("PrimaryImageAspectRatio")
	public val primaryImageAspectRatio: Double? = null,
	/**
	 * Gets or sets the artists.
	 */
	@SerialName("Artists")
	public val artists: List<String>? = null,
	/**
	 * Gets or sets the artist items.
	 */
	@SerialName("ArtistItems")
	public val artistItems: List<NameGuidPair>? = null,
	/**
	 * Gets or sets the album.
	 */
	@SerialName("Album")
	public val album: String? = null,
	/**
	 * Gets or sets the type of the collection.
	 */
	@SerialName("CollectionType")
	public val collectionType: String? = null,
	/**
	 * Gets or sets the display order.
	 */
	@SerialName("DisplayOrder")
	public val displayOrder: String? = null,
	/**
	 * Gets or sets the album id.
	 */
	@SerialName("AlbumId")
	public val albumId: UUID? = null,
	/**
	 * Gets or sets the album image tag.
	 */
	@SerialName("AlbumPrimaryImageTag")
	public val albumPrimaryImageTag: String? = null,
	/**
	 * Gets or sets the series primary image tag.
	 */
	@SerialName("SeriesPrimaryImageTag")
	public val seriesPrimaryImageTag: String? = null,
	/**
	 * Gets or sets the album artist.
	 */
	@SerialName("AlbumArtist")
	public val albumArtist: String? = null,
	/**
	 * Gets or sets the album artists.
	 */
	@SerialName("AlbumArtists")
	public val albumArtists: List<NameGuidPair>? = null,
	/**
	 * Gets or sets the name of the season.
	 */
	@SerialName("SeasonName")
	public val seasonName: String? = null,
	/**
	 * Gets or sets the media streams.
	 */
	@SerialName("MediaStreams")
	public val mediaStreams: List<MediaStream>? = null,
	/**
	 * Gets or sets the type of the video.
	 */
	@SerialName("VideoType")
	public val videoType: VideoType? = null,
	/**
	 * Gets or sets the part count.
	 */
	@SerialName("PartCount")
	public val partCount: Int? = null,
	@SerialName("MediaSourceCount")
	public val mediaSourceCount: Int? = null,
	/**
	 * Gets or sets the image tags.
	 */
	@SerialName("ImageTags")
	public val imageTags: Map<ImageType, String>? = null,
	/**
	 * Gets or sets the backdrop image tags.
	 */
	@SerialName("BackdropImageTags")
	public val backdropImageTags: List<String>? = null,
	/**
	 * Gets or sets the screenshot image tags.
	 */
	@SerialName("ScreenshotImageTags")
	public val screenshotImageTags: List<String>? = null,
	/**
	 * Gets or sets the parent logo image tag.
	 */
	@SerialName("ParentLogoImageTag")
	public val parentLogoImageTag: String? = null,
	/**
	 * Gets or sets wether the item has fan art, this will hold the Id of the Parent that has one.
	 */
	@SerialName("ParentArtItemId")
	public val parentArtItemId: String? = null,
	/**
	 * Gets or sets the parent art image tag.
	 */
	@SerialName("ParentArtImageTag")
	public val parentArtImageTag: String? = null,
	/**
	 * Gets or sets the series thumb image tag.
	 */
	@SerialName("SeriesThumbImageTag")
	public val seriesThumbImageTag: String? = null,
	/**
	 * Gets or sets the blurhashes for the image tags.
	 * Maps image type to dictionary mapping image tag to blurhash value.
	 */
	@SerialName("ImageBlurHashes")
	public val imageBlurHashes: Map<ImageType, Map<String, String>>? = null,
	/**
	 * Gets or sets the series studio.
	 */
	@SerialName("SeriesStudio")
	public val seriesStudio: String? = null,
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
	/**
	 * Gets or sets the chapters.
	 */
	@SerialName("Chapters")
	public val chapters: List<ChapterInfo>? = null,
	/**
	 * Gets or sets the type of the location.
	 */
	@SerialName("LocationType")
	public val locationType: LocationType? = null,
	/**
	 * Gets or sets the type of the iso.
	 */
	@SerialName("IsoType")
	public val isoType: IsoType? = null,
	/**
	 * Gets or sets the type of the media.
	 */
	@SerialName("MediaType")
	public val mediaType: String? = null,
	/**
	 * Gets or sets the end date.
	 */
	@SerialName("EndDate")
	public val endDate: DateTime? = null,
	/**
	 * Gets or sets the locked fields.
	 */
	@SerialName("LockedFields")
	public val lockedFields: List<MetadataField>? = null,
	/**
	 * Gets or sets the trailer count.
	 */
	@SerialName("TrailerCount")
	public val trailerCount: Int? = null,
	/**
	 * Gets or sets the movie count.
	 */
	@SerialName("MovieCount")
	public val movieCount: Int? = null,
	/**
	 * Gets or sets the series count.
	 */
	@SerialName("SeriesCount")
	public val seriesCount: Int? = null,
	@SerialName("ProgramCount")
	public val programCount: Int? = null,
	/**
	 * Gets or sets the episode count.
	 */
	@SerialName("EpisodeCount")
	public val episodeCount: Int? = null,
	/**
	 * Gets or sets the song count.
	 */
	@SerialName("SongCount")
	public val songCount: Int? = null,
	/**
	 * Gets or sets the album count.
	 */
	@SerialName("AlbumCount")
	public val albumCount: Int? = null,
	@SerialName("ArtistCount")
	public val artistCount: Int? = null,
	/**
	 * Gets or sets the music video count.
	 */
	@SerialName("MusicVideoCount")
	public val musicVideoCount: Int? = null,
	/**
	 * Gets or sets a value indicating whether [enable internet providers].
	 */
	@SerialName("LockData")
	public val lockData: Boolean? = null,
	@SerialName("Width")
	public val width: Int? = null,
	@SerialName("Height")
	public val height: Int? = null,
	@SerialName("CameraMake")
	public val cameraMake: String? = null,
	@SerialName("CameraModel")
	public val cameraModel: String? = null,
	@SerialName("Software")
	public val software: String? = null,
	@SerialName("ExposureTime")
	public val exposureTime: Double? = null,
	@SerialName("FocalLength")
	public val focalLength: Double? = null,
	@SerialName("ImageOrientation")
	public val imageOrientation: ImageOrientation? = null,
	@SerialName("Aperture")
	public val aperture: Double? = null,
	@SerialName("ShutterSpeed")
	public val shutterSpeed: Double? = null,
	@SerialName("Latitude")
	public val latitude: Double? = null,
	@SerialName("Longitude")
	public val longitude: Double? = null,
	@SerialName("Altitude")
	public val altitude: Double? = null,
	@SerialName("IsoSpeedRating")
	public val isoSpeedRating: Int? = null,
	/**
	 * Gets or sets the series timer identifier.
	 */
	@SerialName("SeriesTimerId")
	public val seriesTimerId: String? = null,
	/**
	 * Gets or sets the program identifier.
	 */
	@SerialName("ProgramId")
	public val programId: String? = null,
	/**
	 * Gets or sets the channel primary image tag.
	 */
	@SerialName("ChannelPrimaryImageTag")
	public val channelPrimaryImageTag: String? = null,
	/**
	 * Gets or sets the start date of the recording, in UTC.
	 */
	@SerialName("StartDate")
	public val startDate: DateTime? = null,
	/**
	 * Gets or sets the completion percentage.
	 */
	@SerialName("CompletionPercentage")
	public val completionPercentage: Double? = null,
	/**
	 * Gets or sets a value indicating whether this instance is repeat.
	 */
	@SerialName("IsRepeat")
	public val isRepeat: Boolean? = null,
	/**
	 * Gets or sets the episode title.
	 */
	@SerialName("EpisodeTitle")
	public val episodeTitle: String? = null,
	/**
	 * Gets or sets the type of the channel.
	 */
	@SerialName("ChannelType")
	public val channelType: ChannelType? = null,
	/**
	 * Gets or sets the audio.
	 */
	@SerialName("Audio")
	public val audio: ProgramAudio? = null,
	/**
	 * Gets or sets a value indicating whether this instance is movie.
	 */
	@SerialName("IsMovie")
	public val isMovie: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether this instance is sports.
	 */
	@SerialName("IsSports")
	public val isSports: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether this instance is series.
	 */
	@SerialName("IsSeries")
	public val isSeries: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether this instance is live.
	 */
	@SerialName("IsLive")
	public val isLive: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether this instance is news.
	 */
	@SerialName("IsNews")
	public val isNews: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether this instance is kids.
	 */
	@SerialName("IsKids")
	public val isKids: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether this instance is premiere.
	 */
	@SerialName("IsPremiere")
	public val isPremiere: Boolean? = null,
	/**
	 * Gets or sets the timer identifier.
	 */
	@SerialName("TimerId")
	public val timerId: String? = null,
	/**
	 * Gets or sets the current program.
	 */
	@SerialName("CurrentProgram")
	public val currentProgram: BaseItemDto? = null
)
