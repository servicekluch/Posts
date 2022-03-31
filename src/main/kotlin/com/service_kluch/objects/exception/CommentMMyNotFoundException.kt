package com.service_kluch

class CommentMyNotFoundException (message: String = "Моего комментария нет"): RuntimeException(message) {
}