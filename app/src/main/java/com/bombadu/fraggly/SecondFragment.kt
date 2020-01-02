package com.bombadu.fraggly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bombadu.fraggly.Model.Users
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.second_fragment.*
import com.bombadu.fraggly.UserAdapter


class SecondFragment : Fragment() {
    lateinit var textView: TextView



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.second_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.second_fragment_text)
        textView.text = "2nd Fragment"
        val recView = view.findViewById<RecyclerView>(R.id.rec_view)
        recView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        //var userAdapter = UserAdapter()


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val listData = listOf(
            Users("Mike", "49"),
            Users("Cate", "65"),
            Users("Bob", "79"),
            Users("Mary", "78")
        )
        val userAdapter = UserAdapter(listData)
        rec_view.adapter = userAdapter
    }


}