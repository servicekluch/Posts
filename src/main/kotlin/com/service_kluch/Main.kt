package com.service_kluch
import com.service_kluch.objects.Post
import com.service_kluch.service.WallService

fun main() {

    val wallService = WallService()
    val firstPost = wallService.add(Post(text="Hello VK on Java", date = 2022))
    val updateFirstPost = wallService.update(firstPost.copy(text = "Hello VK on Kotlin"))

    print(firstPost)
    print(updateFirstPost)

}
