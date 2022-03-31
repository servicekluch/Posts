package com.service_kluch.objects.attachments

sealed class Attachment{
    abstract val attachmentType: AttachmentType

    data class AttachmentAudio (val audio: Audio): Attachment() {
        override val attachmentType = AttachmentType.AUDIO
    }

    data class AttachmentDoc (val doc: Doc): Attachment(){
        override val attachmentType = AttachmentType.DOC
    }

    data class AttachmentLink (val note: Note): Attachment(){
        override val attachmentType = AttachmentType.NOTE
    }

    data class AttachmentPhoto (val photo: Photo): Attachment(){
        override val attachmentType = AttachmentType.PHOTO
    }

    data class AttachmentVideo (val video: Video): Attachment(){
        override val attachmentType = AttachmentType.VIDEO
    }
}

enum class AttachmentType {
    /**Фотография (type = photo)
     * Видеозапись (type = video)
     * Аудиозапись (type = audio)
     * Документ (type = doc)
     * Граффити (type = graffiti)
     * Ссылка (type = link)
     * Заметка (type = note)
     * Контент приложения (type = app)
     * Опрос (type = poll)
     * Вики-страница (type = page)
     * Альбом с фотографиями (type=album)
     * Список фотографий (type=photos_list)
     * Товар (type = market)
     * Подборка товаров (type = market_album)
     * Стикер (type = sticker)
     * Карточки (type = pretty_cards)
     * Встреча (type = event)
     */
    PHOTO, VIDEO, AUDIO, DOC, GRAFFITI,
    LINK, NOTE, APP, POLL, PAGE,
    ALBUM, PHOTOS_LIST, MARKET, MARKET_ALBUM,
    STICKER, PRETTY_CARDS, EVENT
}
