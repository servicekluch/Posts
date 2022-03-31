package com.service_kluch.objects.attachments

sealed class Attachment{
    abstract val attachmentType: AttachmentType

    data class AttachmentAudio (val audio: Audio): Attachment() {
        override val attachmentType = AttachmentType.AUDIO
    }
    
    data class AttachmentDoc (val doc: Doc): Attachment(){
        override val attachmentType = AttachmentType.DOC
    }
    
    data class AttachmentLink (val note: Note): Attachment(){
        override val attachmentType = AttachmentType.NOTE
    }
    
    data class AttachmentPhoto (val photo: Photo): Attachment(){
        override val attachmentType = AttachmentType.PHOTO
    }
    
    data class AttachmentVideo (val video: Video): Attachment(){
        override val attachmentType = AttachmentType.VIDEO
    }
}
