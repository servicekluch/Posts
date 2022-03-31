package com.service_kluch.objects.attachments

data class Note (
        /**
         * Идентификатор заметки
         */
        val id: Int = 0,
        /**
         * Идентификатор владельца заметки
         */
        val owner_id: Int = 0,
        /**
         * Заголовок заметки
         */
        val title: String = "",
        /**
         * Текст заметки
         */
        val text: String = "",
        /**
         * Дата создания заметки в формате Unixtime
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
        val read_comments: Int = 0,
        /**
         * URL страницы для отображения заметки
         */
        val view_url: String = "",
        /**
         * Настройки приватности комментирования заметки
         */
        val privacy_view: String = "",
        /**
         * Есть ли возможность оставлять комментарии
         */
        val can_comment: Boolean= false,
        /**
         * Тэги ссылок на wiki
         */
        val text_wiki: String = ""
)
