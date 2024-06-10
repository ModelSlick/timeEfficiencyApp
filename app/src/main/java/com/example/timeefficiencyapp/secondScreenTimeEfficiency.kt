package com.example.timeefficiencyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class secondScreenTimeEfficiency<Intent> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen_time_efficiency)

        val mondayDetails = findViewById<EditText>(R.id.mondayDetails)
        val tuesdayDetails = findViewById<EditText>(R.id.tuesdayDetails)
        val wednesdayDetails = findViewById<EditText>(R.id.wednesdayDetails)
        val editextext4 = findViewById<EditText>(R.id.editTextText4)
        val fridayDetails = findViewById<EditText>(R.id.fridayDetails)
        val saterdayDetails = findViewById<EditText>(R.id.saterdayDetails)
        val sundayDetails= findViewById<EditText>(R.id.sundayDetails)

        val clearBtn = findViewById<Button>(R.id.clearBtn)
        val BackBtn = findViewById<Button>(R.id.BackBtn)
        val detailedViewBtn = findViewById<Button>(R.id.detailedViewBtn)

        mondayDetails.text.toString()
        tuesdayDetails.text.toString()
        wednesdayDetails.text.toString()
        editextext4.text.toString()
        fridayDetails.text.toString()
        saterdayDetails.text.toString()
        sundayDetails.text.toString()

        BackBtn.setOnClickListener {
            val intent = intent (this, MainActivity::class.java)
            startActivity(intent)

           detailedViewBtn.setOnClickListener {
               var intent = intent (this, MainActivity::class.java)
               startActivity(intent)
           }

            val clear: Any = EditText.text.clear()
            clearBtn.setOnClickListener {
                clear


            }
        }

    }

    private fun startActivity(intent: Unit) {

    }

    private fun startActivity(intent: Intent?) {

    }

    private fun intent(secondScreenTimeEfficiency: secondScreenTimeEfficiency<Intent>, java: Class<MainActivity>) {

    }
}
