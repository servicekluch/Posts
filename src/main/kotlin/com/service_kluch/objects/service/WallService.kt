package com.service_kluch

class WallService {
    private var postsArray = emptyArray<Post>()
    private var reportsArray = emptyArray<Report>()
    private var commentsList = mutableListOf<Comment>()
    private var myComments = mutableListOf<Comment>()
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
    fun createComment(comment: Comment, id: Int): Comment {
        val post: Post = findPostById(id)

        val postComments = post.comments?.comments ?: mutableListOf()
        val newComment = comment.copy(id = commentsList.lastIndex + 1)

        commentsList += newComment
        postComments += newComment
        update(post.copy(comments = Comments(comments = postComments)))
        return newComment
    }

    private fun findPostById(id: Int): Post {
        for (post: Post in postsArray) {
            if (post.id == id) return post
        }
        throw PostNotFoundException()
    }
    fun reportComment(report: Report): Boolean {
        for (comment: Comment in commentsList) {
            if (comment.fromId == report.ownerId) {
                myComments += comment
            }
        }
        if (myComments.isNotEmpty()) {
            for (comment: Comment in myComments) {
                if (comment.id == report.commentId) {
                    reportsArray += report
                    return true
                }
            }
            throw CommentNotFoundException()
        }
        throw CommentMyNotFoundException()
    }
}

