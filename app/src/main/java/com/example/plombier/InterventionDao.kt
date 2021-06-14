package com.example.plombier

import androidx.room.*

@Dao
interface InterventionDao {

    @Insert
    fun addIntervention(intervention: Intervention)

    @Query("Select * from Intervention")
    fun getIntervention():List<Intervention>

    @Delete
    fun delete(intervention: Intervention)

    @Query("SELECT * FROM Intervention WHERE date LIKE :date")
    fun findInterventionByDate(date: String): List<Intervention>

    @Update
    fun update(intervention: Intervention)
}