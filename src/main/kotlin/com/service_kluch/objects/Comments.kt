package com.service_kluch

/**
 * Информация о комментариях к записи
 */
data class Comments (
    /**
     * количество комментариев;
     */
    val count: Int = 0,
    /**
     * информация о том, может ли текущий пользователь комментировать запись (true — может, false — не может);
     * */
    val canPost: Boolean = false,
    /**
     * информация о том, могут ли сообщества комментировать запись;
     * */
    val groupsCanPost: Boolean = false,
    /**
     * может ли текущий пользователь закрыть комментарии к записи;
     * */
    val canClose: Boolean = false,
    /**
     * может ли текущий пользователь открыть комментарии к записи..
     */
    val canOpen: Boolean = false,
    /**
     * Список комментарий к посту
     */
    val comments: MutableList<Comment> = mutableListOf()
)