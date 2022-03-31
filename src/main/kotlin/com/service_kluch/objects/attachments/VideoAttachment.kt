package com.service_kluch.objects.attachments

data class AttachmentVideo(val video: Video) : Attachment {
    override val type: AttachmentType
        get() = AttachmentType.VIDEO
}
