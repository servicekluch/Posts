package com.service_kluch.objects.attachments

/**
 * Объект, описывающий фотографию
 */
data class Photo (
    /**
     * Идентификатор фотографии
     */
    val id: Int = 0,
    /**
     * Идентификатор альбома, в котором находится фотография
     */
    val album_id: Int = 0,
    /**
     * Идентификатор владельца фотографии
     */
    val owner_id: Int = 0,
    /**
     * Идентификатор пользователя, загрузившего фото
     * (если фотография размещена в сообществе)
     */
    val user_id: Int = 0,
    /**
     * Текст описания фотографии
     */
    val text: String = "",
    /**
     * Дата добавления в формате Unixtime
     */
    val date: Int = 0,
    /**
     * Массив с копиями изображения в разных размерах
     */
    val sizes: Array<CopyImage>,
    /**
     * Ширина оригинала фотографии в пикселах
     */
    val width: Int = 0,
    /**
     * Высота оригинала фотографии в пикселах
     */
    val height: Int = 0
)
/**
 * Массив с копиями изображения в разных размерах
 */
data class CopyImage (
    /**
     * s — Пропорциональная копия изображения с максимальной стороной 75px;
     * m — Пропорциональная копия изображения с максимальной стороной 130px;
     * x — Пропорциональная копия изображения с максимальной стороной 604px;
     * o — Если соотношение "ширина/высота" исходного изображения меньше или равно 3:2,
     * то пропорциональная копия с максимальной стороной 130px. Если соотношение "ширина/высота" больше 3:2,
     * то копия обрезанного слева изображения с максимальной стороной 130px и соотношением сторон 3:2.
     * p — Если соотношение "ширина/высота" исходного изображения меньше или равно 3:2,
     * то пропорциональная копия с максимальной стороной 200px. Если соотношение "ширина/высота" больше 3:2,
     * то копия обрезанного слева и справа изображения с максимальной стороной 200px и соотношением сторон 3:2.
     * q — Если соотношение "ширина/высота" исходного изображения меньше или равно 3:2,
     * то пропорциональная копия с максимальной стороной 320px. Если соотношение "ширина/высота" больше 3:2,
     * то копия обрезанного слева и справа изображения с максимальной стороной 320px и соотношением сторон 3:2.
     * r — Если соотношение "ширина/высота" исходного изображения меньше или равно 3:2,
     * то пропорциональная копия с максимальной стороной 510px. Если соотношение "ширина/высота" больше 3:2,
     * то копия обрезанного слева и справа изображения с максимальной стороной 510px и соотношением сторон 3:2
     * y — Пропорциональная копия изображения с максимальной стороной 807px;
     * z — Пропорциональная копия изображения с максимальным размером 1080x1024;
     * w* — Пропорциональная копия изображения с максимальным размером 2560x2048px.
     */
    val type: String = "",
    /**
     * URL копии
     */
    val url: String = "",
    /**
     * высота в px.
     */
    val width: Int = 0,
    /**
     * ширина в px.
     */
    val height: Int = 0
)
