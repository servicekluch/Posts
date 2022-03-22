package objects.attachments

import Attachment
import AttachmentTypeEnum

class AudioAttachment (
    override val type: AttachmentTypeEnum = AttachmentTypeEnum.AUDIO,
    val attachment : Audio
) : Attachment