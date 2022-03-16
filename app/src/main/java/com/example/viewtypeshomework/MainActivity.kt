package com.example.viewtypeshomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewtypeshomework.presentation.recyclers.out.BasicAdapter
import com.example.viewtypeshomework.presentation.viewModel.InfoViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private val adapter by lazy { BasicAdapter() }
    private val viewModel by lazy { InfoViewModel() }

    override fun onStart() {
        super.onStart()
        viewModel.list.observe(this) {
            adapter.submitList(it)
        }

        recycler.adapter = adapter

    }
}