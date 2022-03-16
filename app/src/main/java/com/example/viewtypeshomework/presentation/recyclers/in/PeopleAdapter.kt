package com.example.viewtypeshomework.presentation.recyclers.`in`

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewtypeshomework.domain.model.server.User


class PeopleAdapter : RecyclerView.Adapter<CommonViewHolder>() {
    var list = emptyList<User>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
        return (if (viewType == 2) PeopleViewHolder.newInstance(parent) else ButtonViewHolder.newInstance(
            parent
        ))
    }

    override fun onBindViewHolder(holder: CommonViewHolder, position: Int) {
        if (position == list.size) {
            holder.btn.setOnClickListener {
                addUser()
                notifyDataSetChanged()
            }
        } else {
            holder.bindItem(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size + 1
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == list.size) 1 else 2
    }

    private fun addUser() {
        val list1 = list.toMutableList()
        list1.add(User("dsd"))
        list = list1
    }

    fun submitList(lis: List<User>) {
        list = lis
        notifyDataSetChanged()
    }
}