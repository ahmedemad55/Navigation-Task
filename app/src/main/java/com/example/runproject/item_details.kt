package com.example.runproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class item_details : AppCompatActivity() {

//     var image: ImageView = findViewById(R.id.item_details_image)
//     var name: TextView = findViewById(R.id.item_details_name)
//     var description: TextView = findViewById(R.id.item_details_description)

    lateinit var image: ImageView
    lateinit var name: TextView
    lateinit var description: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_details)



         image = findViewById(R.id.item_details_image)
         name = findViewById(R.id.item_details_name)
         description = findViewById(R.id.item_details_description)

        getData()

//        image = intent.getIntExtra("itemimage")
//        name = intent.getStringExtra("itemname")
//        name = intent.getStringExtra("itemdescription")

//        val bundle : Bundle?
//        bundle = intent.extras
//         image = bundle!!.getInt("itemimage")
//         name = bundle.getString("itemname")
//         description = bundle.getString("itemdescription")





//

//        image = intent.getInt("itemimage")
//        name = intent.getStringExtra("itemname")
//        description = intent.getString("itemdescription")


    }

    private fun getData() {
        val Name = intent.getStringExtra("itemname")
        name.text = "Name: " + Name

       val Image = intent.getIntExtra("itemimage",R.drawable.chicken)
        image.setImageResource(Image)

        val Description = intent.getStringExtra("itemdescription")
        description.text = "Description: " + Description


    }
}