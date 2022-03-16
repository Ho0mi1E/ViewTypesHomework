package com.example.viewtypeshomework.presentation.recyclers.`in`

import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.viewtypeshomework.R
import com.example.viewtypeshomework.domain.model.server.User

sealed class CommonViewHolder(val item: View) : RecyclerView.ViewHolder(item){

    abstract fun bindItem(item: User)

    val btn by lazy { item.findViewById<ImageButton>(R.id.button) }
}