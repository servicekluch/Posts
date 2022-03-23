package com.service_kluch.objects.attachments

class VideoAttachment (
    override val type: AttachmentTypeEnum = AttachmentTypeEnum.VIDEO,
    val attachment: Video
) : Attachment