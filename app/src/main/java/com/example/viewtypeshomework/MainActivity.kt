package com.example.viewtypeshomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewtypeshomework.domain.model.server.ListOfUser
import com.example.viewtypeshomework.domain.model.server.User
import com.example.viewtypeshomework.domain.showInfo.LoadAndClickListener
import com.example.viewtypeshomework.presentation.recyclers.`in`.UserAdapter
import com.example.viewtypeshomework.presentation.recyclers.out.BasicAdapter
import com.example.viewtypeshomework.presentation.viewModel.InfoViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.button_recycler.*
import kotlinx.android.synthetic.main.item_list.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private val loadAndClick = object : LoadAndClickListener {

        override fun click(user: User) {
            ListOfUser.addUser(user)


        }
    }
    private val adapter by lazy { BasicAdapter(loadAndClick) }
    private val viewModel by lazy { InfoViewModel() }


    override fun onStart() {
        super.onStart()
        viewModel.list.observe(this) {
            adapter.submitList(it)
        }
        recycler.adapter = adapter
    }


}