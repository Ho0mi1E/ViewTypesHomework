package com.example.viewtypeshomework.presentation.recyclers.`in`

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewtypeshomework.R
import com.example.viewtypeshomework.domain.model.server.ListOfUser
import com.example.viewtypeshomework.domain.model.server.User
import com.example.viewtypeshomework.domain.showInfo.LoadAndClickListener
import com.example.viewtypeshomework.presentation.viewModel.InfoViewModel
import kotlinx.android.synthetic.main.button_recycler.view.*

class ButtonViewHolder(view: View,val clickListener: LoadAndClickListener) : CommonViewHolder(view) {
    companion object {
        fun newInstance(parent: ViewGroup,clickListener: LoadAndClickListener) = ButtonViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.button_recycler, parent, false
            ),clickListener
        )
    }






    override fun bindItem(item: User) {
        itemView.button.setOnClickListener {
        clickListener.click(item)

    }
}}