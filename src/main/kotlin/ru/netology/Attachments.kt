package ru.netology


private var attachments = emptyArray<Attachment>()

interface Attachment {
    val type: String
}

data class Audio(
    val id: Int = 0,
    val ownerId: Int = 0,
    val artist: String = "artist",
    val title: String = "title",
    val duration: Int = 0
)

data class Video(
    val id: Int = 0,
    val ownerId: Int = 0,
    val description: String = "description",
    val title: String = "title",
    val duration: Int = 0
)

data class Photo(
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val text: String = "text"
)

data class File(
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String = "title",
    val size: Int = 0,
    val ext: String = "ext"
)

data class Event(
    val id: Int = 0,
    val time: Int = 0,
    val memberStatus: Int = 1,
    val address: String = "address",
)

data class AudioAttachment(override val type: String = "audio", val audio: Audio = Audio()) : Attachment {

}

data class VideoAttachment(override val type: String = "video", val video: Video = Video()) : Attachment {

}

data class PhotoAttachment(override val type: String = "photo",val photo: Photo = Photo()) : Attachment {

}

data class FileAttachment(override val type: String = "file", val file: File = File()) : Attachment {

}

data class EventAttachment(override val type: String = "event", val event: Event = Event()) : Attachment {

}





