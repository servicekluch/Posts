package com.service_kluch.objects.attachments

data class NoteAttachment(
    override val type: AttachmentTypeEnum = AttachmentTypeEnum.NOTE,
    val attachment: Note
) : Attachment