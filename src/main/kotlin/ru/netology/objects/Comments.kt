package ru.netology.objects

class Comments(
    val count: Int = 1,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean  = true,
    val canClose: Boolean  = true,
    val canOpen: Boolean  = true
)