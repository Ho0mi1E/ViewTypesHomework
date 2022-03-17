package com.example.viewtypeshomework.presentation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewtypeshomework.data.ItemRepositoryImpl
import com.example.viewtypeshomework.domain.model.server.BasicItem
import com.example.viewtypeshomework.domain.model.server.ListOfUser
import com.example.viewtypeshomework.domain.model.server.User

class InfoViewModel : ViewModel() {

    private val _list = MutableLiveData<List<BasicItem>>()
    val list: LiveData<List<BasicItem>> get() = _list


    private val _user = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> get() = _user

    init {
        loadList()
    }

   private fun loadList() {
        _list.value = ItemRepositoryImpl.list
       _user.value = ListOfUser.list
    }


     fun addUser(user: User){
        val list1 = _user.value?.toMutableList()
        list1?.add(user)
        _user.value = list1
    }

    fun UpdateUser(){
        _user.value = ListOfUser.list
    }

}