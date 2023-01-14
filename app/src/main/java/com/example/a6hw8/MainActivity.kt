package com.example.a6hw8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(), OnClick {
    private lateinit var animals: ArrayList<Animal>


    //2:Open-closed Principle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animals = arrayListOf(Lion(), Mouse(), Horse(), Snake(), Dog(), Cow())
        makeAnimalSound()
        animalLegCount()
        animalColor()
    }

    private fun makeAnimalSound() {
        for (i in animals) {
            Log.e("ololo", "makeAnimalSound: " + i.makeVoice())
        }
    }

    private fun animalColor() {
        for (i in animals) {
            Log.e("ololo", "animalColor: " + i.getAnimalColor())
        }
    }

    //3:Liskov Substitution Principle
    private fun animalLegCount() {
        for (i in animals) {
            Log.e("ololo", "legCount: " + i.legCount().toString())
        }
    }

    override fun onClick() {
        TODO("Not yet implemented")
    }

}