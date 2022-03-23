package com.service_kluch.objects.attachments


data class PhotoAttachment(
    override val type: AttachmentTypeEnum = AttachmentTypeEnum.PHOTO,
    val attachment : Photo
) : Attachment