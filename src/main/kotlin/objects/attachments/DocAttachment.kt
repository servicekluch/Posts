package objects.attachments

import Attachment
import AttachmentTypeEnum

data class DocAttachment(
    override val type: AttachmentTypeEnum = AttachmentTypeEnum.DOC,
    val attachment: Doc
) : Attachment