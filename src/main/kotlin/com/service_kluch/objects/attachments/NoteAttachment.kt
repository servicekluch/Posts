package com.service_kluch.objects.attachments

data class AttachmentNote(val note: Note) : Attachment {
    override val type: AttachmentType
        get() = AttachmentType.NOTE
}
