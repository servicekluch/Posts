package com.service_kluch.objects.attachments

data class AttachmentDoc(val doc: Doc) : Attachment {
    override val type: AttachmentType
        get() = AttachmentType.DOC
}
