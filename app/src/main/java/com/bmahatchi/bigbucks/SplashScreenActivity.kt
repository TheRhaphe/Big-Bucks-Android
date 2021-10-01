package com.bmahatchi.bigbucks

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bmahatchi.bigbucks.R
import android.content.Intent
import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed
import com.bmahatchi.bigbucks.MainActivity

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(applicationContext, MainActivity::class.java))
        },2000)
    }
}