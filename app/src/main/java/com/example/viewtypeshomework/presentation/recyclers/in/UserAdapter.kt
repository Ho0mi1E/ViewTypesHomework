package com.example.viewtypeshomework.presentation.recyclers.`in`

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewtypeshomework.MainActivity
import com.example.viewtypeshomework.domain.model.server.ListOfUser
import com.example.viewtypeshomework.domain.model.server.User
import com.example.viewtypeshomework.domain.showInfo.LoadAndClickListener
import com.example.viewtypeshomework.presentation.viewModel.InfoViewModel


class UserAdapter(val clickListener: LoadAndClickListener) : RecyclerView.Adapter<CommonViewHolder>() {


    var list = emptyList<User>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
        return (if (viewType == 2) PeopleViewHolder.newInstance(parent)
        else ButtonViewHolder.newInstance(
            parent
        ,clickListener))
    }

    override fun onBindViewHolder(holder: CommonViewHolder, position: Int) {
        if (position == list.size) {
            holder.bindItem(User("ffdfd"))
            notifyDataSetChanged()

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

     fun submitList(list1: List<User>) {
            list = list1

        notifyDataSetChanged()
    }
}