package com.service_kluch

import com.service_kluch.objects.ReasonType
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

    @Test
    fun createComment() {
        val wallService = WallService()
        val addpost = wallService.add(Post())
        val result = wallService.createComment(Comment(), addpost.id)

        assertNotNull(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouIdTrow() {
        val wallService = WallService()

        wallService.createComment(Comment(),-1)
    }
    @Test
    fun reportComment() {
        val wallService = WallService()
        val addPost = wallService.add(Post())
        val comment = Comment()
        wallService.createComment(comment,addPost.id)
        wallService.createComment(comment,addPost.id)
        val lastComment = wallService.createComment(comment, addPost.id)
        val report = Report(ownerId = lastComment.fromId, commentId = lastComment.id, reportReason = ReasonType.SPAM)
        val result = wallService.reportComment(report)
        assertTrue(result)
    }

    @Test(expected = CommentNotFoundException::class)
    fun reportComment_commentNotFoundException() {
        val wallService = WallService()
        val addPost = wallService.add(Post())
        val comment = Comment()
        wallService.createComment(comment,addPost.id)
        val report = Report(ownerId = comment.fromId, commentId = comment.id + 1, reportReason = ReasonType.CHILD_PORNOGRAPHY)
        wallService.reportComment(report)
    }

    @Test(expected = CommentMyNotFoundException::class)
    fun reportComment_commentMyNotFoundException() {
        val wallService = WallService()
        val addPost = wallService.add(Post())
        val comment = Comment()
        wallService.createComment(comment,addPost.id)
        val report = Report(ownerId = comment.fromId + 1, commentId = comment.id, reportReason = ReasonType.EXTREMISM)
        wallService.reportComment(report)
    }
}