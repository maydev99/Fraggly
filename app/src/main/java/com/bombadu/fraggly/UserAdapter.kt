package com.bombadu.fraggly

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bombadu.fraggly.Model.Users
import kotlinx.android.synthetic.main.container_card.view.*

class UserAdapter(val listData: List<Users>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.container_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(listData[position])

    }

    override fun getItemCount(): Int {
        return listData.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: Users) {
            itemView.nameTextView.text = user.name
            itemView.ageTextView.text = user.age
        }

    }

}