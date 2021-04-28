package com.example.daggerhiltproject.Product

import android.util.Log
import javax.inject.Inject

class Fuel {
    @Inject
    constructor()

    private var fuelType:String="Disel"
    fun setFuel(fuelType:String)
    {
        this.fuelType=fuelType
    }
    fun getFuelType():String{
        return this.fuelType
    }

}