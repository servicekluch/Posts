package com.service_kluch

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
        val post = Post()
        val newPost = wallService.add(post.copy(text="Hello VK on Java", date = 2021))
        wallService.add(post.copy(text="Hello VK on Kotlin", date = 2022))
        val result = wallService.update(newPost)
        assertTrue(result)
    }

    @Test
    fun update_false() {
        val wallService = WallService()
        val post = Post()
        val result = wallService.update(post)
        assertFalse(result)
    }
}
