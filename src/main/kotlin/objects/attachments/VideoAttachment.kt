package objects.attachments

import Attachment
import AttachmentTypeEnum

class VideoAttachment (
    override val type: AttachmentTypeEnum = AttachmentTypeEnum.VIDEO,
    val attachment: Video
) : Attachment