package com.example.mydicegame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice_imgs = arrayOf(R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6)
        val r = java.util.Random()
        var x = 0
        btn_random.setOnClickListener {
            x = r.nextInt(6)
            iv_dice.setImageResource(dice_imgs[x])
        }
    }
}
