package com.service_kluch

class WallService {
    private var postsArray = emptyArray<Post>()
    private var commentsArray = emptyArray<Comment>()
    private var newPostId = 1

    fun add(post: Post): Post {
        val postIdNow = post.copy(id = newPostId)
        newPostId++
        postsArray += postIdNow
        return postsArray.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postInArray) in postsArray.withIndex()) {
            if (index == post.id) {
                postsArray[index] = post.copy(ownerId = postInArray.ownerId, date = postInArray.date)
                return true
            }
        }
        return false
    }
    fun createComment(comment: Comment) : Boolean {
        for (post in postsArray ){
            if (post.id == comment.reply_to_comment){
                commentsArray += comment
                return true
            }
        }
        throw PostNotFoundException()
    }
}