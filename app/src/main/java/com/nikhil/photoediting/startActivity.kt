package com.nikhil.photoediting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import com.airbnb.lottie.LottieAnimationView
import com.nikhil.photoediting.R

class startActivity : AppCompatActivity() {

    private lateinit var lottieanimation1 : LottieAnimationView
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        lottieanimation1 = findViewById(R.id.lottieanimationview1)

        android.os.Handler().postDelayed({
            lottieanimation1.playAnimation()
            startActivity(Intent(this, nextactivity::class.java))
            finish()
        }, 5000)


    }
}
