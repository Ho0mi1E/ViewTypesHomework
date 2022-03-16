package com.example.viewtypeshomework.presentation.recyclers.out

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewtypeshomework.R
import com.example.viewtypeshomework.domain.model.server.Attachments
import com.example.viewtypeshomework.domain.model.server.BasicItem
import kotlinx.android.synthetic.main.item_attachmants.view.*

class AttachmentsItemViewHolder(view: View) : BasicItemViewHolder(view) {
    companion object {
        const val VIEW_TYPE = 6
        fun newInstance(parent: ViewGroup) = AttachmentsItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_attachmants, parent, false
            )
        )
    }

    override fun bindItem(item: BasicItem) {
        (item as Attachments).apply {
            itemView.info1.text = info
            itemView.info2.text = info1
        }
    }
}