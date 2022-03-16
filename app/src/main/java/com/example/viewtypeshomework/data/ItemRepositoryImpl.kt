package com.example.viewtypeshomework.data

import com.example.viewtypeshomework.domain.model.server.*

object ItemRepositoryImpl {
    val list = listOf<BasicItem>(
        Task("Сделать что-то"),
        Date("12.04.22", "12.11 AM"),
        Description("То незнаю что"),
        ToDo,
        ListOfUser,
        Attachments("File 1.zip ", "Image2.jpg"),
        Task("Сделать что-то"),
        Date("12.04.22", "12.11 AM"),
        Description("То незнаю что"),
        ToDo,
        ListOfUser,
        Attachments("File 1.zip ", "Image2.jpg"), Task("Сделать что-то"),
        Date("12.04.22", "12.11 AM"),
        Description("То незнаю что"),
        ToDo,
        ListOfUser,
        Attachments("File 1.zip ", "Image2.jpg"),
    )
}