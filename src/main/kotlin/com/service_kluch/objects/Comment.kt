package com.service_kluch

import com.service_kluch.objects.attachments.Attachment

/**
 * Комментарий на стене
 * Объект, описывающий комментарии на стене
 */
data class Comment (
    /**
     *  Идентификатор комментария.
     */
    val id: Int = 0,
    /**
     *  Идентификатор поста на который сделан комментарий.
     */
    val postId: Int = 0,
    /**
     * Идентификатор автора комментария
     */
    val fromId: Int = 0,
    /**
     * Дата создания комментария в формате Unixtime
     */
    val date: Int = 0,
    /**
     * Текст комментария.
     */
    val text: String = "",
    /**
     * Информация о VK Donut
     */
    val donut:DonutComment? = null,
    /**
     * Идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо)
     */
    val replyToUser: Int = 0,
    /**
     * Идентификатор комментария, в ответ на который оставлен текущий (если применимо).
     */
    val replyToComment: Int = 0,
    /**
     * Медиавложения комментария (фотографии, ссылки и т.п.).
     */
    val attachments: Attachment? = null,
    /**
     * Массив идентификаторов родительских комментариев.
      */
    val parentsStack:Array<CommentpParentsStack>? = null,
    /**
     * Информация о вложенной ветке комментариев
     */
    val thread: CommentThread? = null
)
/**
 * Информация о VK Donut
 */
class DonutComment (
    /**
     * является ли комментатор подписчиком VK Donut
     */
    val isDon: Boolean = false,

    /**
     * заглушка для пользователей, которые не оформили подписку VK Donut.
     */
    val placeholder: String = ""
)
/**
 * Информация о вложенной ветке комментариев
 */
class CommentThread (
    /**
     * количество комментариев в ветке.
     */
    val count: Int = 0,
    /**
     * массив объектов комментариев к записи (только для метода wall.getComments).
     */
    val items: Array<CommentArray>? = null,
    /**
     * может ли текущий пользователь оставлять комментарии в этой ветке.
     */
    val canPost: Boolean = false,
    /**
     * нужно ли отображать кнопку «ответить» в ветке.
     */
    val showReplyButton: Boolean = false,
    /**
     * могут ли сообщества оставлять комментарии в ветке.
     */
    val groupsCanPost: Boolean = false
)
/**
 * массив объектов комментариев к записи (только для метода wall.getComments).
 */
class CommentArray ()

/**
 * Массив идентификаторов родительских комментариев.
 */
class CommentpParentsStack ()
