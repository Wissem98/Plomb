package com.example.plombier

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [(Intervention::class)],version = 1)
abstract class DBIntervention: RoomDatabase(){

    abstract fun interventionDao():InterventionDao
}