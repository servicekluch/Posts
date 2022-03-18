fun main() {

    val wallService = WallService()
    val firstPost = wallService.add(Post(text="Hello VK on Java", date = 2022))
    val updateFirstPost = wallService.update(firstPost.copy(text = "Hello VK on Kotlin"))

    print(firstPost)
    print(updateFirstPost)

}



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
data class Comments (
    /*количество комментариев;*/
    val canPost: Boolean = false,
    /*информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);*/
    val groupsCanPost: Boolean = false,
    /*информация о том, могут ли сообщества комментировать запись;*/
    val canClose: Boolean = false,
    /*может ли текущий пользователь закрыть комментарии к записи;*/
    val canOpen: Boolean = false
    /*может ли текущий пользователь открыть комментарии к записи.*/
)

data class Copyright (
    val id: Int = 0,
    val link: String = "",
    val name: String = "",
    val type: String = ""
)

class Likes (
   /*Информация о лайках к записи*/
   val count: Int = 0,
   /*число пользователей, которым понравилась запись;*/
   val userLikes: Boolean = false,
   /*наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет);*/
   val canLike: Boolean = false,
   /*информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);*/
   val canPublish: Boolean = false
   /*информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может).*/
)

class Reports (
    /*Информация о репостах записи («Рассказать друзьям»)*/
    val count: Int = 0,
    /*число пользователей, скопировавших запись;*/
    val userReposted: Boolean = false
    /*наличие репоста от текущего пользователя (1 — есть, 0 — нет).*/
)

class Views (
     /*Информация о просмотрах записи*/
     val count: Int = 0
     /*число просмотров записи.*/
)

data class Donut (
   /*Информация о записи VK Donut:*/
   val isDonut: Boolean = false,
   /*запись доступна только платным подписчикам VK Donut;*/
   val paidDuration: Int = 0,
   /*время, в течение которого запись будет доступна только платным подписчикам VK Donut;*/
   val placeholder: Placeholder? = null,
   /*заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи.*/
   val canPublishFreeCopy: Boolean = false,
   /*можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;*/
   val editMode: EditMode = EditMode.all
   /*информация о том, какие значения VK Donut можно изменить в записи*/
)

class Placeholder
/*заглушка для пользователей*/

enum class EditMode {
    /*all — всю информацию о VK Donut.*/
    /*duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.*/
    all,
    duration}

class WallService {
    private var postsArray = emptyArray<Post>()
    private var newPostId = 1

    fun add(post: Post): Post {
        val postIdNow = post.copy(id = newPostId)
        newPostId++
        postsArray += postIdNow
        return postsArray.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postInArray) in postsArray.withIndex()) {
            if (post.id == postInArray.id) {
                postsArray[index] = post.copy(id = postInArray.id, date = postInArray.date)
                return true
            }
        }
        return false
    }
}