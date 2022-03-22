package service
import objects.Post

class WallService {
    private var postsArray = emptyArray<Post>()
    private var newPostId = 1

    fun add(post: Post): Post {
        val postIdNow = post.copy(id = newPostId)
        newPostId++
        postsArray += postIdNow
        return postsArray.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postInArray) in postsArray.withIndex()) {
            if (post.id == postInArray.id) {
                postsArray[index] = post.copy(id = postInArray.id, date = postInArray.date)
                return true
            }
        }
        return false
    }
}