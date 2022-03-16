package com.example.viewtypeshomework

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.viewtypeshomework.domain.model.server.BasicItem

abstract class BasicItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    abstract fun bindItem(item: BasicItem)

}