package com.service_kluch

class CommentNotFoundException(message: String = "Комментарий не существует"): RuntimeException(message) {
}