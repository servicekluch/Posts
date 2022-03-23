package com.service_kluch.objects.attachments

data class ImageCover (
    /*Содержит массив объектов с полями:*/
    val height: Int = 0,
    /*высота изображения.*/
    val url: String = "",
    /*ссылка на изображение.*/
    val width: Int = 0,
    /*цирина изображение.*/
    val with_padding: Int = 0
    /*поле возвращается, если изображение с отбивкой, всегда содержит 1.*/
)

data class ImageFirsFrame (
    /*Содержит массив объектов с полями:*/
    val height: Int = 0,
    /*высота изображения.*/
    val url: String = "",
    /*ссылка на изображение.*/
    val width: Int = 0
    /*ширина изображение.*/
)

enum class Type {
    VIDEO, MUSIC_VIDEO, MOVIE
}

enum class LiveStatus {
    WAITING, STARTED, FINISHED, FAILED, UPCOMING
}

data class LikesVideo (
    /*Содержит объект отметки «Мне нравится».*/
    val count: Int,
    /*количество лайков.*/
    val userLikes: Boolean
    /*добавлено ли видео в список «Мне нравится» текущего пользователя.
    0 — не добавлено.
    1 — добавлено.*/
)

data class RepostsVideo (
    /*Содержит объект репоста.*/
    val count: Int = 0,
    /* счетчик общего количества репостов. Содержит сумму репостов на стену и в личные сообщения.*/
    val wall_count: Int = 0,
    /*счетчик репостов на стену.*/
    val mail_count: Int = 0,
    /*счетчик репостов в личные сообщения.*/
    val user_reposted:Boolean = false
    /*информация о том, сделал ли текущий пользователь репост этого видео.*/
)