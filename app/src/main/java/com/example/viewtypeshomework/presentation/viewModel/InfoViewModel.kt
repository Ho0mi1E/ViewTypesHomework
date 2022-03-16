package com.example.viewtypeshomework.presentation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewtypeshomework.data.ItemRepositoryImpl
import com.example.viewtypeshomework.domain.model.server.BasicItem

class InfoViewModel : ViewModel() {

    private val _list = MutableLiveData<List<BasicItem>>()
    val list: LiveData<List<BasicItem>> get() = _list

    init {
        loadList()
    }

   private fun loadList() {
        _list.value = ItemRepositoryImpl.list
    }

}