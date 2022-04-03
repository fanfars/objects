package ru.netology


private var attachments = emptyArray<Attachment>()

interface Attachment {
    val type: String
    val attachment: Any
}

class Audio(
    val id: Int = 0,
    val ownerId: Int = 0,
    val artist: String = "artist",
    val title: String = "title",
    val duration: Int = 0
)

class Video(
    val id: Int = 0,
    val ownerId: Int = 0,
    val description: String = "description",
    val title: String = "title",
    val duration: Int = 0
)

class Photo(
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val text: String = "text"
)

class File(
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String = "title",
    val size: Int = 0,
    val ext: String = "ext"
)

class Event(
    val id: Int = 0,
    val time: Int = 0,
    val memberStatus: Int = 1,
    val address: String = "address",
)

data class AudioAttachment(override val type: String = "audio", override val attachment: Audio) : Attachment {

}

data class VideoAttachment(override val type: String = "video", override val attachment: Video) : Attachment {

}

data class PhotoAttachment(override val type: String = "photo", override val attachment: Photo) : Attachment {

}

data class FileAttachment(override val type: String = "file", override val attachment: File) : Attachment {

}

data class EventAttachment(override val type: String = "event", override val attachment: Event) : Attachment {

}





