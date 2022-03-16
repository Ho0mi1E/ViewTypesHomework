package com.example.viewtypeshomework.presentation.recyclers.out

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewtypeshomework.R
import com.example.viewtypeshomework.domain.model.server.BasicItem
import com.example.viewtypeshomework.domain.model.server.Task
import kotlinx.android.synthetic.main.item_task.view.*

class TaskItemViewHolder(view: View) : BasicItemViewHolder(view) {
    companion object {
        const val VIEW_TYPE = 1
        fun newInstance(parent: ViewGroup) = TaskItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_task, parent, false
            )
        )
    }

    override fun bindItem(item: BasicItem) {
        (item as Task).apply {
            itemView.task.text = info
        }
    }
}