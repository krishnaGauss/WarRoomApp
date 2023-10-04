package com.example.firebaseauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val mDeelay: Long=3000
        Handler(Looper.getMainLooper()).postDelayed({
          startActivity((Intent(this, MainActivity::class.java)))
        }, mDeelay)
//        Handler(Looper.getMainLooper()).postDelayed(3000){
//            startActivity(Intent(this, MainActivity::class.java))
//        }
    }
}