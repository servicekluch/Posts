package com.service_kluch.objects.attachments

data class Video (
    /**
     * Идентификатор видеозаписи
     */
    val id: Int = 0,
    /**
     * Идентификатор владельца видеозаписи
     */
    val owner_id: Int = 0,
    /**
     * Название видеозаписи
     */
    val title: String = "",
    /**
     * Текст описания видеозаписи
     */
    val description: String = "",
    /**
     * Длительность ролика в секундах
     */
    val duration: Int = 0,
    /**
     * Изображение обложки
     */
    val image: Array<ImageCover>,
    /**
     * Изображение первого кадра
     */
    val first_frame: Array<ImageFirsFrame>,
    /**
     * Дата создания видеозаписи в формате Unixtime
     */
    val date: Int = 0,
    /**
     * Дата добавления видеозаписи пользователем или группой в формате Unixtime
     */
    val adding_date: Int = 0,
    /**
     * Количество просмотров видеозаписи
     */
    val views: Int = 0,
    /**
     * Если видео внешнее, количество просмотров ВКонтакте
     */
    val local_views: Int = 0,
    /**
     * Количество комментариев к видеозаписи
     */
    val comments: Int = 0,
    /**
     * URL страницы с плеером, который можно использовать для воспроизведения ролика в браузере.
     * Поддерживается flash и HTML5, плеер всегда масштабируется по размеру окн
     */
    val player: String = "",
    /**
     * Название платформы (для видеозаписей, добавленных с внешних сайтов)
     */
    val platform: String = "",
    /**
     * Может ли пользователь добавить видеозапись к себе.
     * false — не может добавить.
     * true — может добавить
     */
    val can_add: Boolean = true,
    /**
     * Поле возвращается, если видеозапись приватная
     * (например, была загружена в личное сообщение), всегда содержит true
     */
    val is_private: Boolean = true,
    /**
     * Ключ доступа к объекту. Подробнее см. Ключ доступа к данным access_key
     */
    val access_key: String = "",
    /**
     * Поле возвращается в том случае, если видеоролик
     * находится в процессе обработки, всегда содержит 1
     */
    val processing: Boolean = true,
    /**
     * true, если объект добавлен в закладки у текущего пользователя
     */
    val is_favorite: Boolean = true,
    /**
     * Может ли пользователь комментировать видео
     * false - не может комментировать
     * true — может комментировать
     */
    val can_comment: Boolean = false,
    /**
     * Может ли пользователь редактировать видео.
     * false — не может редактировать.
     * true — может редактировать
     */
    val can_edit: Boolean = false,
    /**
     * Может ли пользователь добавить видео в список <<Мне нравится>>.
     * false — не может добавить.
     * true — может добавить
     */
    val can_like: Boolean = false,
    /**
     * Может ли пользователь сделать репост видео.
     * false — не может сделать репост.
     * true — может сделать репост
     */
    val can_repost: Boolean = false,
    /**
     * Может ли пользователь подписаться на автора видео.
     * false — не может подписаться.
     * true — может подписаться
     */
    val can_subscribe: Boolean= false,
    /**
     * Может ли пользователь добавить видео в избранное.
     * false — не может добавить.
     * true — может добавить
     */
    val can_add_to_faves: Boolean = false,
    /**
     * Может ли пользователь прикрепить кнопку действия к видео.
     * false — не может прикрепить.
     * true — может прикрепить
     */
    val can_attach_link: Boolean = false,
    /**
     * Ширина видео
     */
    val width: Int = 0,
    /**
     * Высота видео
     */
    val height: Int = 0,
    /**
     * Идентификатор пользователя, загрузившего видео,
     * если оно было загружено в группу одним из участников
     */
    val user_id: Int = 0,
    /**
     * Конвертируется ли видео.
     * false — не конвертируется.
     * true — конвертируется
     */
    val converting: Boolean = false,
    /**
     * Добавлено ли видео в альбомы пользователя.
     * false — не добавлено.
     * true — добавлено
     */
    val added: Boolean = false,
    /**
     * Подписан ли пользователь на автора видео.
     * false — не подписан.
     * true — подписан.
     */
    val is_subscribed:Boolean = true,
    /**
     * Поле возвращается в том случае, если видео зациклено, всегда содержит true
     */
    val repeat: Boolean = true,
    /**
     * Тип видеозаписи. Может принимать значения: video, music_video, movie
     */
    val type: Type = Type.VIDEO,
    /**
     * Баланс донатов в прямой трансляции
     */
    val balance: Int = 0,
    /**
     * Статус прямой трансляции. Может принимать значения: waiting, started, finished, failed, upcoming
     */
    val live_status: LiveStatus = LiveStatus.WAITING,
    /**
     * Поле возвращается в том случае, если видеозапись является прямой трансляцией,
     * всегда содержит true.
     * Обратите внимание, в этом случае в поле duration содержится значение false
     */
    val live: Boolean = true,
    /**
     * Поле свидетельствует о том, что трансляция скоро начнётся. Для live = true
     */
    val upcoming: Boolean = false,
    /**
     * Количество зрителей прямой трансляции
     */
    val spectators: Int = 0,
    /**
     * Содержит объект отметки «Мне нравится»
     */
    val likes: LikesVideo? = null,
    /**
     * Содержит объект репоста
     */
    val reposts: RepostsVideo? = null
)

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
