package com.example.plombier


class InterventionManager(build: DBIntervention) {
    var db:DBIntervention = build

    fun getInterventions():MutableList<Intervention>{
        db.interventionDao().getIntervention().toMutableList().forEach{
            println(" inter $it")
        }
        return db.interventionDao().getIntervention().toMutableList()
    }

    fun deleteInterventions(intervention: Intervention): MutableList<Intervention> {

        db.interventionDao().delete(intervention)
        return getInterventions()
    }

    fun editIntervention(intervention: Intervention): MutableList<Intervention> {
        db.interventionDao().update(intervention)
        return getInterventions()
    }
    fun addIntervention(intervention: Intervention): MutableList<Intervention> {

        db.interventionDao().addIntervention(intervention)
        getInterventions().forEach{
            println(" inter $it")
        }

        return getInterventions()

    }



    fun searchPerDate(calendar: String):MutableList<Intervention>{

        return db.interventionDao().findInterventionByDate(calendar).toMutableList()
    }
}


