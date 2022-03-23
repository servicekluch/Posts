package com.service_kluch.objects.attachments

data class DocAttachment(
    override val type: AttachmentTypeEnum = AttachmentTypeEnum.DOC,
    val attachment: Doc
) : Attachment