package objects

data class Post(
    val id: Int = 0,
    /*Идентификатор записи*/
    val ownerId: Int = 0,
    /*Идентификатор владельца стены, на которой размещена запись. В версиях API ниже 5.7 это поле называется to_id.*/
    val fromId: Int = 0,
    /*Идентификатор автора записи (от чьего имени опубликована запись).*/
    val createdBy: Int = 0,
    /*Идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.*/
    val date: Int = 0,
    /*Время публикации записи в формате unixtime.*/
    val text: String = "",
    /*Текст записи.*/
    val replyOwnerId: Int = 0,
    /*Идентификатор владельца записи, в ответ на которую была оставлена текущая.*/
    val replyPostId: Int = 0,
    /*Идентификатор записи, в ответ на которую была оставлена текущая.*/
    val friendsOnly: Boolean = false,
    /*1, если запись была создана с опцией «Только для друзей».*/
    val comments: Comments? = null,
    /*Информация о комментариях к записи*/
    val copyright: Copyright? = null,
    /*Источник материала*/
    val likes: Likes? = null,
    /*Информация о лайках к записи*/
    val reposts: Reports? = null,
    /*Информация о репостах записи («Рассказать друзьям»)*/
    val views: Views? = null,
    /*Информация о просмотрах записи*/
    val postType: String = "",
    /*Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.*/
    val signerId: Int = 0,
    /*Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;*/
    val canPin: Boolean = false,
    /*Информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).*/
    val canDelete: Boolean = false,
    /*Информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).*/
    val canEdit: Boolean = false,
    /*Информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).*/
    val isPinned: Boolean = false,
    /*Информация о том, что запись закреплена.*/
    val markedAsAds: Boolean = false,
    /*Информация о том, содержит ли запись отметку «реклама» (1 — да, 0 — нет).*/
    val isFavorite: Boolean = false,
    /*true, если объект добавлен в закладки у текущего пользователя.*/
    val donut: Donut? = null,
    /*Информация о записи VK Donut:*/
    val postponedId: Int = 0
    /*Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.*/
) {
    override fun toString(): String {
        return "Пост: $text: Дата: $date"
    }
}