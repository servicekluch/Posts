package com.service_kluch.objects.attachments

data class CopyImage (
    /*Каждый объект массива содержит следующие поля:*/
    val type: String = "",
    /*тип копии. См. Формат описания размеров фотографии.*/
    val url: String = "",
    /*URL копии.*/
    val width: Int = 0,
    /*высота в px.*/
    val height: Int = 0
    /*ширина в px.*/
)
