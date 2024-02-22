package com.example.runproject

import android.os.Parcel
import android.os.Parcelable

data class item_data_class(
    var data_class_image:Int,
    var data_class_name:String,
    var data_class_description:String):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(data_class_image)
        parcel.writeString(data_class_name)
        parcel.writeString(data_class_description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<item_data_class> {
        override fun createFromParcel(parcel: Parcel): item_data_class {
            return item_data_class(parcel)
        }

        override fun newArray(size: Int): Array<item_data_class?> {
            return arrayOfNulls(size)
        }
    }
}
