package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainTest {

    @Test
    fun addTest() {
        val post1 = Post(
            id = 10,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 280322,
            text = "Hello",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = "canOpen",
            copyright = "56894",
            likes = "canLike",
            reposts = "userReposted",
            views = "count",
            postType = "reply",
            signerId = 654698,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            donut = "placeholder"
        )
        val expectedId = 0

        val actualId = WallService.add(post1).id

        assertEquals(expectedId, actualId)
    }

    @Test
    fun updateWithExistingId() {
        val post2 = Post(
            id = 43678,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 280322,
            text = "Hello",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = "canOpen",
            copyright = "56894",
            likes = "canLike",
            reposts = "userReposted",
            views = "count",
            postType = "reply",
            signerId = 654698,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            donut = "placeholder"
        )
        val post3 = Post(
            id = 234,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 280322,
            text = "Hello",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = "canOpen",
            copyright = "56894",
            likes = "canLike",
            reposts = "userReposted",
            views = "count",
            postType = "reply",
            signerId = 654698,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            donut = "placeholder"
        )
        val post4 = Post(
            id = 2,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 280322,
            text = "Hello",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = "canOpen",
            copyright = "56894",
            likes = "canLike",
            reposts = "userReposted",
            views = "count",
            postType = "reply",
            signerId = 654698,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            donut = "placeholder"
        )
        val expectedValue = true

        WallService.add(post2)
        WallService.add(post3)
        val actualValue = WallService.update(post4)

        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun updateWithNotExistingId() {
        val post5 = Post(
            id = 10,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 280322,
            text = "Hello",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = "canOpen",
            copyright = "56894",
            likes = "canLike",
            reposts = "userReposted",
            views = "count",
            postType = "reply",
            signerId = 654698,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            donut = "placeholder"
        )
        val expectedValue = false

        val actualValue = WallService.update(post5)

        assertEquals(expectedValue, actualValue)
    }
}