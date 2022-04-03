package ru.netology

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Any,
    val copyright: Any,
    val likes: Any,
    val reposts: Any,
    val views: Any,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Any
)

object WallService {
    private var posts = emptyArray<Post>()
    fun add(post: Post): Post {
        val propertyId = posts.size
        val postWithId = post.copy(id = propertyId)
        posts += postWithId
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var isIdFound : Boolean = false
        for ((index, postCount) in posts.withIndex()) {
            if (postCount.id == post.id) {
                val newPost = post.copy(ownerId = postCount.ownerId, date = postCount.date)
                posts[index] = newPost
                isIdFound = true
            }            
        }
        return if(isIdFound) return isIdFound else false
    }

}

fun main() {

}
