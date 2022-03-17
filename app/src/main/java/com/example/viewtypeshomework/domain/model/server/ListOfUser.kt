package com.example.viewtypeshomework.domain.model.server

object ListOfUser: BasicItem() {
    var list = listOf(
        User("лул"),
        User("лул"),
        User("лул"),
        User("лул"),
        User("лул"),
        User("лул"),
        User("лул"),
        User("лул"),
        User("лул"),
        User("лул"),
    )

    fun addUser(user: User){
        val list1 = list.toMutableList()
        list1.add(user)
        list = list1
    }

}