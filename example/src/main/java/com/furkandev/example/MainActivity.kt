package com.furkandev.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.furkandev.createuniquerandom.CreateUniqueRandom

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createUniqueRandomIntArray(view: View){

        print("---------- Int ----------\n")

        val array = CreateUniqueRandom().int(0,10,5)

        for (i in array){
            println(i)
        }

    }

    fun createUniqueRandomDoubleArray(view: View){

        print("---------- Double ----------\n")

        val array = CreateUniqueRandom().double(0.0,10.0,5)

        for (i in array){
            println(i)
        }

    }

}