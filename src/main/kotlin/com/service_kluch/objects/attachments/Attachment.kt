package com.service_kluch.objects.attachments

interface Attachment {
    val type : AttachmentTypeEnum
}

enum class AttachmentTypeEnum {
    /*Фотография (type = photo)
    Видеозапись (type = video)
    Аудиозапись (type = audio)
    Документ (type = doc)
    Граффити (type = graffiti)
    Ссылка (type = link)
    Заметка (type = note)
    Контент приложения (type = app)
    Опрос (type = poll)
    Вики-страница (type = page)
    Альбом с фотографиями (type=album)
    Список фотографий (type=photos_list)
    Товар (type = market)
    Подборка товаров (type = market_album)
    Стикер (type = sticker)
    Карточки (type = pretty_cards)
    Встреча (type = event)*/

    PHOTO, VIDEO, AUDIO, DOC, GRAFFITI,
    LINK, NOTE, APP, POLL, PAGE,
    ALBUM, PHOTOS_LIST, MARKET, MARKET_ALBUM,
    STICKER, PRETTY_CARDS, EVENT
}