package com.example.runproject

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Places_Fragment : Fragment() {

    private lateinit var recyclerview : RecyclerView
    private lateinit var favlist:ArrayList<item_data_class>
    private lateinit var favadapter : adapter_fav
    lateinit var itemimage:Array<Int>
    lateinit var itemname :Array<String>
    lateinit var itemdecsribtion :Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_places_, container, false)
        recyclerview = view.findViewById(R.id.places_fragment_rv)
        recyclerview.layoutManager = LinearLayoutManager(activity)
        recyclerview.setHasFixedSize(true)

        favlist = ArrayList()
        //        initRecyclerView()



        favlist.add(item_data_class(R.drawable.camel, "Camel", "The ship of the desert"))
        favlist.add(item_data_class(R.drawable.cat, "Cat", "Is a beautiful pet animal"))
        favlist.add(item_data_class(R.drawable.cow, "Cow", "We benefit from it on the farm"))
        favlist.add(item_data_class(R.drawable.fox, "Fox", "A cunning and deceitful animal"))
        favlist.add(item_data_class(R.drawable.crocodile,"Crocodile", "Is a ferocious and terrifying animal"))
        favlist.add(item_data_class(R.drawable.dog, "Dog", "Is a loyal animal"))
        favlist.add(item_data_class(R.drawable.goat, "Goat", "We benefit from it on the farm"))
        favlist.add(item_data_class(R.drawable.horse, "Horse", "A very fast animal"))
        favlist.add(item_data_class(R.drawable.lion, "Lion", "Is the king of the jungle"))
        favlist.add(item_data_class(R.drawable.rat, "Rat", "A small and scary animal"))
        favlist.add(item_data_class(R.drawable.sloth, "Sloth", "A very lazy animal"))
        favlist.add(item_data_class(R.drawable.chicken, "Chicken", "We benefit from it on the farm"))
        favlist.add(item_data_class(R.drawable.camel, "Camel", "The ship of the desert"))
        favlist.add(item_data_class(R.drawable.cat, "Cat", "Is a beautiful pet animal"))
        favlist.add(item_data_class(R.drawable.cow, "Cow", "We benefit from it on the farm"))
        favlist.add(item_data_class(R.drawable.fox, "Fox", "A cunning and deceitful animal"))
        favlist.add(item_data_class(R.drawable.crocodile,"Crocodile", "Is a ferocious and terrifying animal"))
        favlist.add(item_data_class(R.drawable.dog, "Dog", "Is a loyal animal"))
        favlist.add(item_data_class(R.drawable.goat, "Goat", "We benefit from it on the farm"))
        favlist.add(item_data_class(R.drawable.horse, "Horse", "A very fast animal"))
        favlist.add(item_data_class(R.drawable.lion, "Lion", "Is the king of the jungle"))
        favlist.add(item_data_class(R.drawable.rat, "Rat", "A small and scary animal"))
        favlist.add(item_data_class(R.drawable.sloth, "Sloth", "A very lazy animal"))
        favlist.add(item_data_class(R.drawable.chicken, "Chicken", "We benefit from it on the farm"))

        favadapter = adapter_fav(favlist)
        recyclerview.adapter = favadapter



        return view
    }

    private fun initRecyclerView() {
        recyclerview.layoutManager = LinearLayoutManager(activity)
        val adapter = adapter_fav(favlist)
        recyclerview.adapter = adapter
        adapter.setOnClickListener(object :adapter_fav.OnClickListener{
            override fun onClick(position: Int, model: item_data_class) {
                val intent = Intent(context, item_details::class.java)
                intent.putExtra("itemimage",model.data_class_image)
                intent.putExtra("itemname",model.data_class_name)
                intent.putExtra("itemdescription",model.data_class_description)
                startActivity(intent)


            }
        })

    }

}