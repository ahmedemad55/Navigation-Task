package com.example.runproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Music_Fragment : Fragment() {
    private lateinit var recyclerview : RecyclerView
    private lateinit var favlist:ArrayList<item_data_class>
    private lateinit var musicadapter : adapter_music
    lateinit var itemimage:Array<Int>
    lateinit var itemname :Array<String>
    lateinit var itemdecsribtion :Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_music_, container, false)

        recyclerview = view.findViewById(R.id.music_fragment_rv)
        recyclerview.layoutManager = LinearLayoutManager(activity)
        recyclerview.setHasFixedSize(true)

        favlist = ArrayList()


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

        musicadapter = adapter_music(favlist)
        recyclerview.adapter = musicadapter

        return view
    }


}