package com.service_kluch.objects

enum class ReasonType(val code : Int, val value : String) {
    SPAM                (0, "спам"),
    CHILD_PORNOGRAPHY   (1, "детская порнография"),
    EXTREMISM           (2, "экстремизм"),
    VIOLENCE            (3, "насилие"),
    PROPAGANDA_DRUG     (4, "пропаганда наркотиков"),
    ADULT_MATERIAL      (5, "материал для взрослых"),
    INSULT              (6, "оскорбление"),
    SUICIDE_CALLS       (8, "призывы к суициду")
}