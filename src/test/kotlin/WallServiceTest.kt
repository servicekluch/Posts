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
        val result = wallService.update(firstPost.copy(text = "Hello VK on Kotlin"))
        assertTrue(result)
    }

    @Test
    fun update_false() {
        val wallService = WallService()
        val firstPost = wallService.add(Post(id=7,text="Hello VK on Java", date = 2022))
        val result = wallService.update(firstPost.copy(id=7,text = "Hello VK on Kotlin"))
        assertFalse(result)
    }
}