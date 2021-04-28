package com.example.daggerhiltproject.Product

import android.util.Log
import javax.inject.Inject

class Wheel {

    @Inject
    constructor()

    fun getWheel():String{
        return "BridgeStone"
    }
}