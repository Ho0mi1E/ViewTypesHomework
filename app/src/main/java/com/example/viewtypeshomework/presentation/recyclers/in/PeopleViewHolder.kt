package com.example.viewtypeshomework.presentation.recyclers.`in`

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewtypeshomework.R
import com.example.viewtypeshomework.domain.model.server.User
import com.example.viewtypeshomework.domain.showInfo.LoadAndClickListener
import kotlinx.android.synthetic.main.user_recycler.view.*

class PeopleViewHolder(view: View) : CommonViewHolder(view) {
    companion object {
        fun newInstance(parent: ViewGroup) = PeopleViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.user_recycler, parent, false)
        )
    }

    override fun bindItem(item: User) {
        itemView.userName.text = item.name
    }

}