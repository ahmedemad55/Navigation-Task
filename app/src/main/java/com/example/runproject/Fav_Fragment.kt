package com.example.runproject

import android.content.Intent
import android.os.Bundle
import android.service.autofill.UserData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class Fav_Fragment : Fragment() {
    private lateinit var recyclerview :RecyclerView
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
        val view = inflater.inflate(R.layout.fragment_fav_, container, false)

        recyclerview = view.findViewById(R.id.fav_fragment_rv)
        recyclerview.setHasFixedSize(true)

        favlist = ArrayList()
        initRecyclerView()


//
//        itemimage = arrayOf(
//            R.drawable.camel,
//            R.drawable.cat,
//            R.drawable.cow,
//            R.drawable.fox,
//            R.drawable.crocodile,
//            R.drawable.dog,
//            R.drawable.goat,
//            R.drawable.horse,
//            R.drawable.lion,
//            R.drawable.rat,
//            R.drawable.sloth,
//            R.drawable.chicken,
//            R.drawable.camel,
//            R.drawable.cat,
//            R.drawable.cow,
//            R.drawable.fox,
//            R.drawable.crocodile,
//            R.drawable.dog,
//            R.drawable.goat,
//            R.drawable.horse,
//            R.drawable.lion,
//            R.drawable.rat,
//            R.drawable.sloth,
//            R.drawable.chicken
//        )
//
//        itemname = arrayOf(
//            "Camel",
//            "Cat",
//            "Cow",
//            "Fox",
//            "Crocodile",
//            "Dog",
//            "Goat",
//            "Horse",
//            "Lion",
//            "Rat",
//            "Sloth",
//            "Chicken",
//            "Camel",
//            "Cat",
//            "Cow",
//            "Fox",
//            "Crocodile",
//            "Dog",
//            "Goat",
//            "Horse",
//            "Lion",
//            "Rat",
//            "Sloth",
//            "Chicken"
//        )
//
//        itemdecsribtion = arrayOf(
//            "The ship of the desert",
//            "Is a beautiful pet animal",
//            "We benefit from it on the farm",
//            "A cunning and deceitful animal",
//            "Is a ferocious and terrifying animal",
//            "Is a loyal animal",
//            "We benefit from it on the farm",
//            "A very fast animal",
//            "Is the king of the jungle",
//            "A small and scary animal",
//            "A very lazy animal",
//            "We benefit from it on the farm",
//            "The ship of the desert",
//            "Is a beautiful pet animal",
//            "We benefit from it on the farm",
//            "A cunning and deceitful animal",
//            "Is a ferocious and terrifying animal",
//            "Is a loyal animal",
//            "We benefit from it on the farm",
//            "A very fast animal",
//            "Is the king of the jungle",
//            "A small and scary animal",
//            "A very lazy animal",
//            "We benefit from it on the farm",
//        )
//
//
        favlist.add(item_data_class(R.drawable.camel,        "Camel",     "The ship of the desert"                      ))
        favlist.add(item_data_class(R.drawable.cat,          "Cat",       "Is a beautiful pet animal"                   ))
        favlist.add(item_data_class(R.drawable.cow,          "Cow",       "We benefit from it on the farm"              ))
        favlist.add(item_data_class(R.drawable.fox,          "Fox",       "A cunning and deceitful animal"              ))
        favlist.add(item_data_class(R.drawable.crocodile,    "Crocodile", "Is a ferocious and terrifying animal"        ))
        favlist.add(item_data_class(R.drawable.dog,          "Dog",       "Is a loyal animal"                           ))
        favlist.add(item_data_class(R.drawable.goat,         "Goat",      "We benefit from it on the farm"              ))
        favlist.add(item_data_class(R.drawable.horse,        "Horse",     "A very fast animal"                          ))
        favlist.add(item_data_class(R.drawable.lion,         "Lion",      "Is the king of the jungle"                   ))
        favlist.add(item_data_class(R.drawable.rat,          "Rat",       "A small and scary animal"                    ))
        favlist.add(item_data_class(R.drawable.sloth,        "Sloth",     "A very lazy animal"                          ))
        favlist.add(item_data_class(R.drawable.chicken,      "Chicken",   "We benefit from it on the farm"              ))
        favlist.add(item_data_class(R.drawable.camel,        "Camel",     "The ship of the desert"                      ))
        favlist.add(item_data_class(R.drawable.cat,          "Cat",       "Is a beautiful pet animal"                   ))
        favlist.add(item_data_class(R.drawable.cow,          "Cow",       "We benefit from it on the farm"              ))
        favlist.add(item_data_class(R.drawable.fox,          "Fox",       "A cunning and deceitful animal"              ))
        favlist.add(item_data_class(R.drawable.crocodile,    "Crocodile", "Is a ferocious and terrifying animal"        ))
        favlist.add(item_data_class(R.drawable.dog,          "Dog",       "Is a loyal animal"                           ))
        favlist.add(item_data_class(R.drawable.goat,         "Goat",      "We benefit from it on the farm"              ))
        favlist.add(item_data_class(R.drawable.horse,        "Horse",     "A very fast animal"                          ))
        favlist.add(item_data_class(R.drawable.lion,         "Lion",      "Is the king of the jungle"                   ))
        favlist.add(item_data_class(R.drawable.rat,          "Rat",       "A small and scary animal"                    ))
        favlist.add(item_data_class(R.drawable.sloth,        "Sloth",     "A very lazy animal"                          ))
        favlist.add(item_data_class(R.drawable.chicken,      "Chicken",   "We benefit from it on the farm"             ))


//        private fun getUser() {
//            for (i in itemimage.indices) {
//                val data = UserData(itemimage[i], itemname[i])
//                favlist.add(data)
//
//            }
//        adapter = adapter_fav(favlist)
//        recyclerview.adapter = adapter
//            favadapter = adapter_fav(favlist)
//            recyclerview.adapter = favadapter
//
//        favadapter.onItemClickListener(object :adapter_fav.onItemClickListener){
//            override fun onItemClick(position:Int){
//                val intent = Intent(this@Fav_Fragment,fragment_item_details::class.java)
//                intent.putExtra("itemimage",favlist[position].data_class_image)
//                intent.putExtra("itemname",favlist[position].data_class_name)
//                intent.putExtra("itemdescription",favlist[position].data_class_description)
//                startActivity(intent)
//            }
//
//        }
 //       }
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


