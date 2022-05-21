package com.example.slide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTop = findViewById<Button>(R.id.top)
        val btnBottom = findViewById<Button>(R.id.bottom)
        val btnLeft = findViewById<Button>(R.id.left)
        val btnRight = findViewById<Button>(R.id.right)

        btnTop.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.up)
            image.startAnimation(animation)
        }

        btnBottom.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.down)
            image.startAnimation(animation)
        }

        btnLeft.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.left)
            image.startAnimation(animation)
        }

        btnRight.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.right)
            image.startAnimation(animation)
        }
    }
}