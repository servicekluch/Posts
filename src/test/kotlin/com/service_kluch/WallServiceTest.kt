package com.service_kluch.service

import com.service_kluch.Comment
import com.service_kluch.Post
import com.service_kluch.PostNotFoundException
import com.service_kluch.WallService
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val wallService = WallService()
        val result = wallService.add(Post(text="Hello VK on Java", date = 2022))
        assertNotEquals(0, result)
    }

    @Test
    fun update_true() {
        val wallService = WallService()
        val firstPost = wallService.add(Post(text="Hello VK on Java", date = 2022))
        val result = wallService.update(firstPost.copy(ownerId = 7,text = "Hello VK on Kotlin"))
        assertFalse(result)
    }

    @Test
    fun update_false() {
        val wallService = WallService()
        val firstPost = wallService.add(Post(text="Hello VK on Java", date = 2022))
        val result = wallService.update(firstPost.copy(text = "Hello VK on Kotlin"))
        assertFalse(result)
    }

    @Test (expected = PostNotFoundException::class)
    fun createComment() {
        val wallService = WallService()
        wallService.createComment(Comment(3, 5))
        wallService.add(Post(3))
        val create = Comment(7, 5)
        val result = wallService.createComment(create)

        assertTrue(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouIdTrow(){
        val wallService = WallService()
        wallService.createComment(Comment(3, 5))
        wallService.add(Post(3))
        val create = Comment(7, 15)
        val result = wallService.createComment(create)

        assertFalse(result)
    }
}