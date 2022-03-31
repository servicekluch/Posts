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
        wallService.add(post.copy(text="Hello VK on Java", date = 2021))
        wallService.add(post.copy(text="Hello VK on Kotlin", date = 2022))
        val result = wallService.update(post.copy(id = 1, text="Hello VK on Kotlin 2023", date = 2023))
        assertTrue(result)
    }

    @Test
    fun update_false() {
        val wallService = WallService()
        val post = Post()
        wallService.add(post.copy(text="Hello VK on Java", date = 2021))
        wallService.add(post.copy(text="Hello VK on Kotlin", date = 2022))
        val result = wallService.update(post.copy(id = 7, text="Hello VK on Kotlin 2023", date = 2023))
        assertFalse(result)
    }

    @Test
    fun createComment() {
        val wallService = WallService()
        val post = Post()
        wallService.add(post.copy(text="Hello VK on Java", date = 2021))
        wallService.add(post.copy(text="Hello VK on Kotlin", date = 2022))
        wallService.createComment(Comment(postId = 1, text="Hello new comments"))
    }

    @Test(expected = PostNotFoundException::class)
    fun shouIdTrow(){
        val wallService = WallService()
        val post = Post()
        wallService.add(post.copy(text="Hello VK on Java", date = 2021))
        wallService.add(post.copy(text="Hello VK on Kotlin", date = 2022))
        wallService.createComment(Comment(postId = 7, text="Hello not found post"))
    }
}
