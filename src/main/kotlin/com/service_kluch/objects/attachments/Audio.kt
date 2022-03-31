package com.service_kluch.objects.attachments

data class Audio (
    /**
     * Идентификатор аудиозаписи
     */
    val id: Int = 0,
    /**
     * Идентификатор владельца аудиозаписи
     */
    val owner_id: Int = 0,
    /**
     * Исполнитель
     */
    val artist: String = "",
    /**
     * Название композиции
     */
    val title: String = "",
    /**
     * Длительность аудиозаписи в секундах
     */
    val duration: Int = 0,
    /**
     * Ссылка на mp3
     */
    val url:String = "",
    /**
     * Идентификатор текста аудиозаписи (если доступно)
     */
    val lyrics_id: Int = 0,
    /**
     * Идентификатор альбома, в котором находится аудиозапись (если присвоен).
     */
    val album_id: Int = 0,
    /**
     * Идентификатор жанра из списка аудио жанров
     */
    val genre_id: Int = 0,
    /**
     * Дата добавления
     */
    val date: Int = 0,
    /**
     * true если включена опция «Не выводить при поиске»
     * Если опция отключена, поле не возвращается
     */
    val no_search: Boolean = true,
    /**
     * true если аудио в высоком качестве
     */
    val is_hq: Boolean = false
)
