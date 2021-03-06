package com.example.viewtypeshomework.presentation.recyclers.out

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.viewtypeshomework.R
import com.example.viewtypeshomework.domain.model.server.BasicItem
import com.example.viewtypeshomework.domain.model.server.ToDo
import com.example.viewtypeshomework.domain.showInfo.ShowInfo
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.item_todo.view.*

class ToDoItemViewHolder(view: View) : BasicItemViewHolder(view), ShowInfo {
    companion object {
        const val VIEW_TYPE = 4
        fun newInstance(parent: ViewGroup) = ToDoItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo, parent, false
            )
        )
    }

    override fun bindItem(item: BasicItem) {
        (item as ToDo).apply {
            itemView.radioResearch.setOnClickListener {
                showToast()
            }
            itemView.radioDeffine.setOnClickListener {
                showSnack()
            }
        }
    }

    override fun showToast() {
        Toast
            .makeText(itemView.context, ToDo.RESEARCH, Toast.LENGTH_LONG)
            .show()
    }

    override fun showSnack() {
        Snackbar
            .make(itemView, ToDo.DEFFINE, Snackbar.LENGTH_LONG)
            .setAction("Snackbar", null)
            .show()
    }
}