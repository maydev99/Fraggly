package com.bombadu.fraggly

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class FirstFragment : Fragment(){
    lateinit var  textView : TextView
    lateinit var listView: ListView
    lateinit var myAdapter: ArrayAdapter<String>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_fragment, container, false)
    }

    val mylist = listOf("Mike", "Cate", "Steve", "Gwen", "Bob", "Mary")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.first_fragment_text)
        textView.text = "1st Fragment"
        listView = view.findViewById(R.id.list_view)
        myAdapter = ArrayAdapter(view.context, R.layout.text_list_item, R.id.text_list_item_item, mylist)
        listView.adapter = myAdapter

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        listView.setOnItemClickListener { parent, view, position, id ->
            var myName = listView.getItemAtPosition(position)
            Toast.makeText(view.context, ""+myName,Toast.LENGTH_SHORT).show()
        }


    }


}