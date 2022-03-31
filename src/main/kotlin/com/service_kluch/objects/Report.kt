package com.service_kluch

import com.service_kluch.objects.ReasonType

/**
 * Позволяет пожаловаться на комментарий к записи.
 */
data class Report (
    /**
     * идентификатор пользователя или сообщества, которому принадлежит комментарий
     */
    val ownerId: Int,
    /**
     * идентификатор комментария
     */
    val commentId: Int,
    /**
     * причина жалобы:
       */
    val reportReason: ReasonType
)