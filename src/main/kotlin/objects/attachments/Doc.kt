package objects.attachments

data class Doc (
    /*Объект, описывающий файл, содержит следующие поля:*/
    val id: Int = 0,
    /*Идентификатор файла.*/
    val owner_id: Int = 0,
    /*Идентификатор пользователя, загрузившего файл.*/
    val title: String = "",
    /*Название файла.*/
    val size: Int = 0,
    /*Размер файла в байтах.*/
    val ext: String = "",
    /*Расширение файла.*/
    val url: String = "",
    /*Адрес файла, по которому его можно загрузить.*/
    val date: Int = 0,
    /*Дата добавления в формате Unixtime.*/
    val type: Int = 0,
    /*Тип файла.  Возможные значения:
    1 — текстовые документы;
    2 — архивы;
    3 — gif;
    4 — изображения;
    5 — аудио;
    6 — видео;
    7 — электронные книги;
    8 — неизвестно.*/
    val preview: Preview? = null
    /*Информация для предварительного просмотра файла.*/
)

data class Preview (
    /*Информация для предварительного просмотра файла. Может содержать следующие поля:*/
    val photo: PhotoPreview? = null,
    /*изображения для предпросмотра. Содержит единственное поле:
    sizes (array) —
    массив копий изображения в разных размерах*/
    val graffiti: GraffitiPreview? = null,
    /*данные о граффити.*/
    val audioMessage: AudioMessagePreview? = null
)

data class PhotoPreview (
    /*Формат описания размеров фотографии
    При использовании параметра photo_sizes = 1 в методах для работы с фотографиями,
    в ответе возвращается информация о копиях исходного изображения разных размеров,
    представленная в виде массива sizes, содержащего объекты со следующими полями:*/
    val url: String = "",
    /*URL копии изображения.*/
    val width: Int = 0,
    /*Ширина копии в пикселах.*/
    val height: Int = 0,
    /*Высота копии в пикселах.*/
    val type: String = ""
    /*бозначение размера и пропорций копии.
    Значения type для документов (поле preview)
    s — Пропорциональная копия изображения с максимальной стороной 100px;
    m — Пропорциональная копия изображения с максимальной стороной 130px;
    x — Пропорциональная копия изображения с максимальной стороной 604px;
    y — Пропорциональная копия изображения с максимальной стороной 807px;
    z — Пропорциональная копия изображения с максимальным размером 1080x1024px;
    o — Копия изображения с размерами оригинала.*/
)

data class GraffitiPreview (
    /*данные о граффити.
    Содержит следующие поля:*/
    val src: String = "",
    /*URL файла с граффити;*/
    val width: Int = 0,
    /*ширина изображения в px;*/
    val height: Int = 0
    /*высота изображения в px.*/
)

data class AudioMessagePreview (
    /*данные об аудиосообщении. Объект, который содержит следующие поля:*/
    val duration: Int = 0,
    /* длительность аудиосообщения в секундах;*/
    val waveform: Array<DocWaveForm>,
    /* массив значений (integer) для визуального отображения звука;*/
    val link_ogg: String = "",
    /* URL .ogg-файла;*/
    val link_mp3: String = ""
    /* URL .mp3-файла.*/
) {
    class DocWaveForm {

    }
}