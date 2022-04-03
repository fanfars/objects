package ru.netology.objects

class Comments(
    val id: Int = 10,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean  = true,
    val canClose: Boolean  = true,
    val canOpen: Boolean  = true
)