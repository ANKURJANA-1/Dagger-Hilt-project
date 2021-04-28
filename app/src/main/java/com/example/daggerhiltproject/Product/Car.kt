package com.example.daggerhiltproject.Product

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val wheel: Wheel,private val engine: Engine,private val fuel: Fuel) {

    fun getCar(){
        Log.d("car", {wheel.getWheel()}.toString())
        Log.d("car", {engine.getEngine()}.toString())
        Log.d("car", {fuel.getFuelType()}.toString())
    }
}