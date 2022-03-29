package com.service_kluch

/**
 * Информация о записи VK Donut
 */
data class Donut (
    /**
     * запись доступна только платным подписчикам VK Donut;
     * */
    val isDonut: Boolean = false,
    /**
     * время, в течение которого запись будет доступна только платным подписчикам VK Donut;
     * */
    val paidDuration: Int = 0,
    /**
     * заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи.
     * */
    val placeholder: Placeholder? = null,
    /**
     * можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
     * */
    val canPublishFreeCopy: Boolean = false,
    /**
     * информация о том, какие значения VK Donut можно изменить в записи
     * */
    val editMode: EditMode = EditMode.all
)

/**
 * заглушка для пользователей, которые не оформили подписку VK Donut.
 * Отображается вместо содержимого записи
 */
class Placeholder

/**
 * информация о том, какие значения VK Donut можно изменить в записи
 */
enum class EditMode {
    /**
     * all — всю информацию о VK Donut.
     * duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.
     */
    all,
    duration}