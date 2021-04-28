package com.example.daggerhiltproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerhiltproject.Product.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.getCar()
    }
}