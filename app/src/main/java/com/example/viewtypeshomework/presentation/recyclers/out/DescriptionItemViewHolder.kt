package com.example.viewtypeshomework.presentation.recyclers.out

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewtypeshomework.BasicItemViewHolder
import com.example.viewtypeshomework.R
import com.example.viewtypeshomework.domain.model.server.BasicItem
import com.example.viewtypeshomework.domain.model.server.Description
import kotlinx.android.synthetic.main.item_description.view.*

class DescriptionItemViewHolder(view: View) : BasicItemViewHolder(view) {
    companion object {
        const val VIEW_TYPE = 3
        fun newInstance(parent: ViewGroup) = DescriptionItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_description, parent, false
            )
        )
    }

    override fun bindItem(item: BasicItem) {
        (item as Description).apply {
            itemView.description.text = description
        }
    }
}