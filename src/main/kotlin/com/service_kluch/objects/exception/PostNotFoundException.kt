package com.service_kluch

class PostNotFoundException(message: String = "Пост не существует"): RuntimeException(message) {
}