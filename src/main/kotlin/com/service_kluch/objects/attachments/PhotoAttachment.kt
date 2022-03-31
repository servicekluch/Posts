package com.service_kluch.objects.attachments

data class AttachmentPhoto(val photo: Photo) : Attachment {
    override val type: AttachmentType
        get() = AttachmentType.PHOTO
}
