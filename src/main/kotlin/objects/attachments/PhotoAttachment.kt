package objects.attachments

import Attachment
import AttachmentTypeEnum

data class PhotoAttachment(
    override val type: AttachmentTypeEnum = AttachmentTypeEnum.PHOTO,
    val attachment : Photo
) : Attachment