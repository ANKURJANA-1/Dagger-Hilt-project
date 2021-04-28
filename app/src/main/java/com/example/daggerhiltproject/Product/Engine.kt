package com.example.daggerhiltproject.Product

import android.util.Log
import javax.inject.Inject

class Engine {
    @Inject
    constructor()

    fun getEngine():String
    {
        return "BS6 4 Stoke 500 HP"
    }
}