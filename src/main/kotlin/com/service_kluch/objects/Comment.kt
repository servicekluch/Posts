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
     * Идентификатор автора комментария
     */
    val from_id: Int = 0,
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
    val reply_to_user: Int = 0,
    /**
     * Идентификатор комментария, в ответ на который оставлен текущий (если применимо).
     */
    val reply_to_comment: Int = 0,
    /**
     * Медиавложения комментария (фотографии, ссылки и т.п.).
     */
    val attachments: Attachment.Video? = null,
    /**
     * Массив идентификаторов родительских комментариев.
      */
    val parents_stack:Array<CommentpParentsStack>? = null,
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
    val is_don: Boolean = false,

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
    val can_post: Boolean = false,
    /**
     * нужно ли отображать кнопку «ответить» в ветке.
     */
    val show_reply_button: Boolean = false,
    /**
     * могут ли сообщества оставлять комментарии в ветке.
     */
    val groups_can_post: Boolean = false
)
/**
 * массив объектов комментариев к записи (только для метода wall.getComments).
 */
class CommentArray ()

/**
 * Массив идентификаторов родительских комментариев.
 */
class CommentpParentsStack ()

