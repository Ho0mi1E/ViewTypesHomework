package com.example.viewtypeshomework.presentation.recyclers.out

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.viewtypeshomework.BasicItemViewHolder
import com.example.viewtypeshomework.R
import com.example.viewtypeshomework.domain.model.server.BasicItem
import com.example.viewtypeshomework.domain.model.server.ToDo
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.item_todo.view.*

class ToDoItemViewHolder(view: View) : BasicItemViewHolder(view) {
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
                Toast
                    .makeText(it.context, RESEARCH, Toast.LENGTH_LONG)
                    .show()
            }
            itemView.radioDeffine.setOnClickListener {
                Snackbar
                    .make(it, DEFFINE, Snackbar.LENGTH_LONG)
                    .setAction("Snackbar", null)
                    .show()
            }
        }
    }
}