package com.service_kluch.objects

class Reports (
    /*Информация о репостах записи («Рассказать друзьям»)*/
    val count: Int = 0,
    /*число пользователей, скопировавших запись;*/
    val userReposted: Boolean = false
    /*наличие репоста от текущего пользователя (1 — есть, 0 — нет).*/
)