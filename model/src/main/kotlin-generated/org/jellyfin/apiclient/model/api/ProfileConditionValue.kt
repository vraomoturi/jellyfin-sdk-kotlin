// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ProfileConditionValue {
	@SerialName("AudioChannels")
	AUDIO_CHANNELS,

	@SerialName("AudioBitrate")
	AUDIO_BITRATE,

	@SerialName("AudioProfile")
	AUDIO_PROFILE,

	@SerialName("Width")
	WIDTH,

	@SerialName("Height")
	HEIGHT,

	@SerialName("Has64BitOffsets")
	HAS_64_BIT_OFFSETS,

	@SerialName("PacketLength")
	PACKET_LENGTH,

	@SerialName("VideoBitDepth")
	VIDEO_BIT_DEPTH,

	@SerialName("VideoBitrate")
	VIDEO_BITRATE,

	@SerialName("VideoFramerate")
	VIDEO_FRAMERATE,

	@SerialName("VideoLevel")
	VIDEO_LEVEL,

	@SerialName("VideoProfile")
	VIDEO_PROFILE,

	@SerialName("VideoTimestamp")
	VIDEO_TIMESTAMP,

	@SerialName("IsAnamorphic")
	IS_ANAMORPHIC,

	@SerialName("RefFrames")
	REF_FRAMES,

	@SerialName("NumAudioStreams")
	NUM_AUDIO_STREAMS,

	@SerialName("NumVideoStreams")
	NUM_VIDEO_STREAMS,

	@SerialName("IsSecondaryAudio")
	IS_SECONDARY_AUDIO,

	@SerialName("VideoCodecTag")
	VIDEO_CODEC_TAG,

	@SerialName("IsAvc")
	IS_AVC,

	@SerialName("IsInterlaced")
	IS_INTERLACED,

	@SerialName("AudioSampleRate")
	AUDIO_SAMPLE_RATE,

	@SerialName("AudioBitDepth")
	AUDIO_BIT_DEPTH
}