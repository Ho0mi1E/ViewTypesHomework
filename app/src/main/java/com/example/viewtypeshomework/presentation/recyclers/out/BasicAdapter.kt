package com.example.viewtypeshomework.presentation.recyclers.out

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewtypeshomework.MainActivity
import com.example.viewtypeshomework.domain.model.server.*
import com.example.viewtypeshomework.domain.showInfo.LoadAndClickListener
import java.lang.IllegalStateException

class BasicAdapter(private val clickListener: LoadAndClickListener) : RecyclerView.Adapter<BasicItemViewHolder>() {

    private var list = emptyList<BasicItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicItemViewHolder {
        return when (viewType) {
            TaskItemViewHolder.VIEW_TYPE -> TaskItemViewHolder.newInstance(parent)
            AttachmentsItemViewHolder.VIEW_TYPE -> AttachmentsItemViewHolder.newInstance(parent)
            DateItemViewHolder.VIEW_TYPE -> DateItemViewHolder.newInstance(parent)
            DescriptionItemViewHolder.VIEW_TYPE -> DescriptionItemViewHolder.newInstance(parent)
            UserItemViewHolder.VIEW_TYPE -> UserItemViewHolder.newInstance(parent,clickListener)
            ToDoItemViewHolder.VIEW_TYPE -> ToDoItemViewHolder.newInstance(parent)
            else -> {
                throw IllegalStateException("Wrong view holder type")
            }
        }
    }

    override fun onBindViewHolder(holderItem: BasicItemViewHolder, position: Int) {
        holderItem.bindItem(list[position])

    }

    override fun getItemViewType(position: Int): Int {
        return when (list[position]) {
            is Task -> TaskItemViewHolder.VIEW_TYPE
            is Attachments -> AttachmentsItemViewHolder.VIEW_TYPE
            is Date -> DateItemViewHolder.VIEW_TYPE
            is Description -> DescriptionItemViewHolder.VIEW_TYPE
            ListOfUser -> UserItemViewHolder.VIEW_TYPE
            ToDo -> ToDoItemViewHolder.VIEW_TYPE
        }
    }

    override fun getItemCount(): Int = list.size

    fun submitList(list1: List<BasicItem>) {
        list = list1
        notifyDataSetChanged()
    }
}