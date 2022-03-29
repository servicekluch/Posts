package com.service_kluch

/**
 * Информация о репостах записи («Рассказать друзьям»)
 */
class Reposts (
    /**
     * число пользователей, скопировавших запись;
     * */
    val count: Int = 0,
    /**
     * наличие репоста от текущего пользователя (true — есть, false — нет).
     * */
    val userReposted: Boolean = false
)