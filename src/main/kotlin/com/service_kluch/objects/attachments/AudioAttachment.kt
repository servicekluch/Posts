package com.service_kluch.objects.attachments

data class AttachmentAudio(val audio: Audio) : Attachment {
    override val type: AttachmentType
        get() = AttachmentType.AUDIO
}
