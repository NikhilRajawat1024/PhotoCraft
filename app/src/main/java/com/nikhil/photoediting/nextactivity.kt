package com.nikhil.photoediting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.airbnb.lottie.LottieAnimationView

class nextactivity : AppCompatActivity() {
    private lateinit var lottieanimation : LottieAnimationView
    private lateinit var getstartedbutton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_nextactivity)

            getstartedbutton = findViewById(R.id.button)
        lottieanimation = findViewById(R.id.lottieanimationnext)
        lottieanimation.playAnimation()
        getstartedbutton.setOnClickListener{
            startActivity(Intent(this, EditImageActivity::class.java))
        }

    }
}