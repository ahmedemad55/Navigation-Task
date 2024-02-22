package com.example.runproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter_fav (private val fav_list:ArrayList<item_data_class> ):
    RecyclerView.Adapter<adapter_fav.item_view_holder_fav>() {

    private var mOnClickListener: OnClickListener?= null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): item_view_holder_fav {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_fav,parent,false)
        return item_view_holder_fav(view)

    }

    override fun getItemCount(): Int {
        return fav_list.size
    }

    override fun onBindViewHolder(holder: item_view_holder_fav, position: Int) {

       val current_item = fav_list[position]
       holder.holder_image.setImageResource(current_item.data_class_image)
       holder.holder_name.text = current_item.data_class_name
       holder.holder_description.text = current_item.data_class_description


        holder.itemView.setOnClickListener {
            if (mOnClickListener!= null){
                mOnClickListener!!.onClick(position,current_item)
            }

        }

    }

    inner class item_view_holder_fav(itemview:View) :RecyclerView.ViewHolder(itemview){
        val holder_image :ImageView = itemView.findViewById(R.id.card_image)
        val holder_name : TextView = itemView.findViewById(R.id.card_name)
        val holder_description : TextView = itemView.findViewById(R.id.card_description)

    }
    interface OnClickListener{
        fun onClick(position: Int, model: item_data_class)
    }
    fun setOnClickListener(onClickListener: OnClickListener){
        this.mOnClickListener = onClickListener
    }



}



