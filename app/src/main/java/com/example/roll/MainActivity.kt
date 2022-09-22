package com.example.roll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var rollIv : ImageView
    lateinit var rollBn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollIv = findViewById(R.id.RollIv)
        rollBn = findViewById(R.id.RollBn)
        rollBn.setOnClickListener {
            val result = when(Random.nextInt(6)+1){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }
            rollIv.setImageResource(result)
        }
    }
}