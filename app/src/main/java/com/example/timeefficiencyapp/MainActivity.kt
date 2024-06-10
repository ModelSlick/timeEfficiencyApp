package com.example.timeefficiencyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backBtn = findViewById<Button>(R.id.backBtn)
        val nextBtn = findViewById<Button>(R.id.nextBtn)

        backBtn.setOnClickListener {
            finishAffinity()

        }

        nextBtn.setOnClickListener {
            val intent = intent (this, secondScreenTimeEfficiency::class.java)
            startActivity(intent)
        }
    }

    private fun intent(
        mainActivity: MainActivity,
        java: Class<secondScreenTimeEfficiency<Any?>>
    ): Intent? {
        TODO("go to secondScreenEfficiency")
    }
}

