package com.example.viewtypeshomework.presentation.recyclers.out

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewtypeshomework.R
import com.example.viewtypeshomework.domain.model.server.BasicItem
import com.example.viewtypeshomework.domain.model.server.ListOfUser
import com.example.viewtypeshomework.presentation.recyclers.`in`.PeopleAdapter
import kotlinx.android.synthetic.main.item_list.view.*

class UserItemViewHolder(view: View) : BasicItemViewHolder(view) {
    companion object {
        const val VIEW_TYPE = 5
        fun newInstance(parent: ViewGroup) = UserItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_list, parent, false
            )
        )
    }

    private val adapter by lazy { PeopleAdapter() }

    override fun bindItem(item: BasicItem) {
        (item as ListOfUser).apply {
            adapter.submitList(list)
            itemView.recyclerUser.adapter = adapter
        }
    }
}