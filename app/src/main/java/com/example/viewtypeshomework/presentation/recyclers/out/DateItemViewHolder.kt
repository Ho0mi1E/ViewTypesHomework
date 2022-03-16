package com.example.viewtypeshomework.presentation.recyclers.out

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewtypeshomework.R
import com.example.viewtypeshomework.domain.model.server.BasicItem
import com.example.viewtypeshomework.domain.model.server.Date
import kotlinx.android.synthetic.main.item_date.view.*

class DateItemViewHolder(view: View) : BasicItemViewHolder(view) {
    companion object {
        const val VIEW_TYPE = 2
        fun newInstance(parent: ViewGroup) = DateItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_date, parent, false
            )
        )
    }

    override fun bindItem(item: BasicItem) {
        (item as Date).apply {
            itemView.date.text = date
            itemView.time.text = time
        }
    }
}