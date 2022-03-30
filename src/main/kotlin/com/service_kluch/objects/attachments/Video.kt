package com.service_kluch.objects.attachments

/**
 * Изображение обложки
 */
data class ImageCover (
    /**
     * высота изображения.
     */
    val height: Int = 0,
    /**
     * ссылка на изображение.
     */
    val url: String = "",
    /**
     * ширина изображение.
     */
    val width: Int = 0,
    /**
     * поле возвращается, если изображение с отбивкой, всегда содержит 1.
     */
    val with_padding: Int = 0
)

/**
 * Изображение первого кадра
 */
data class ImageFirsFrame (
    /**
     * высота изображения.
     */
    val height: Int = 0,
    /**
     * ссылка на изображение.
     */
    val url: String = "",
    /**
     * ширина изображение.
     */
    val width: Int = 0
)

/**
 * Тип видеозаписи. Может принимать значения: video, music_video, movie
 */
enum class Type {
    VIDEO, MUSIC_VIDEO, MOVIE
}

/**
 * Статус прямой трансляции. Может принимать значения: waiting, started, finished, failed, upcoming
 */
enum class LiveStatus {
    WAITING, STARTED, FINISHED, FAILED, UPCOMING
}

/**
 * Содержит объект отметки «Мне нравится»
 */
data class LikesVideo (
    /**
     * количество лайков
     */
    val count: Int,
    /**
     * добавлено ли видео в список «Мне нравится» текущего пользователя.
     * false — не добавлено.
     * true — добавлено.
     */
    val userLikes: Boolean
)

/**
 * Содержит объект репоста
 */
data class RepostsVideo (
    /**
     * счетчик общего количества репостов. Содержит сумму репостов на стену и в личные сообщения.
     */
    val count: Int = 0,
    /**
     * счетчик репостов на стену.
     */
    val wall_count: Int = 0,
    /**
     * счетчик репостов в личные сообщения.
     */
    val mail_count: Int = 0,
    /**
     * информация о том, сделал ли текущий пользователь репост этого видео.
     */
    val user_reposted:Boolean = false
)