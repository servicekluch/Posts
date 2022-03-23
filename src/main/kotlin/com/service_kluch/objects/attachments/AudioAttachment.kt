package com.service_kluch.objects.attachments

class AudioAttachment (
    override val type: AttachmentTypeEnum = AttachmentTypeEnum.AUDIO,
    val attachment : Audio
) : Attachment