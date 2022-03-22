package objects.attachments

import Attachment
import AttachmentTypeEnum

data class NoteAttachment(
    override val type: AttachmentTypeEnum = AttachmentTypeEnum.NOTE,
    val attachment: Note
) : Attachment