package objects.attachments

data class Note (
    /*Объект, описывающий заметку, содержит следующие поля:*/
    val id: Int = 0,
    /*Идентификатор заметки.*/
    val owner_id: Int = 0,
    /*Идентификатор владельца заметки.*/
    val title: String = "",
    /*Заголовок заметки.*/
    val text: String = "",
    /*Текст заметки.*/
    val date: Int = 0,
    /*Дата создания заметки в формате Unixtime.*/
    val comments: Int = 0,
    /*Количество комментариев.*/
    val read_comments: Int = 0,
    /*Количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя).*/
    val view_url: String = "",
    /*URL страницы для отображения заметки.*/
    val privacy_view: String = "",
    /*Настройки приватности комментирования заметки*/
    val can_comment: Boolean= false,
    /*Есть ли возможность оставлять комментарии*/
    val text_wiki: String = ""
    /*Тэги ссылок на wiki*/
)