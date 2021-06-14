package com.example.plombier


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Intervention{

    @PrimaryKey(autoGenerate = true)
    var num:Int = 0
    var date = ""

    var plombier:String =""

    var type:String = ""
}