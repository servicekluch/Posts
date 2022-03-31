package com.service_kluch

/**
 * Объект, описывающий заметку
 */
data class Note(
    /**
     * Идентификатор заметки
     */
    val id: Int = 0,
    /**
     * Идентификатор владельца заметки
     */
    val ownerId: Int = 0,
    /**
     * Заголовок заметки
     */
    val title: String = "",
    /**
     * Текст заметки
     */
    val text: String = "text",
    /**
     * Дата создания заметки в формате Unixtime.
     */
    val date: Int = 0,
    /**
     * Количество комментариев
     */
    val comments: Int = 0,
    /**
     * Количество прочитанных комментариев
     * (только при запросе информации о заметке текущего пользователя)
     */
    val readComments: Int = 0,
    /**
     * URL страницы для отображения заметки
     */
    val viewUrl: String = "",
    /**
     * Настройки приватности комментирования заметки
     */
    val privacy_view: String = "",
    /**
     * Есть ли возможность оставлять комментарии
     */
    val can_comment: Int = 0,
    /**
     * Тэги ссылок на wiki
     */
    val text_wiki: String = ""
)