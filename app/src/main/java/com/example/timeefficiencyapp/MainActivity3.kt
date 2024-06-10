package com.example.timeefficiencyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    private fun intent(mainActivity3: MainActivity3, java: Class<secondScreenTimeEfficiency<*>>): Intent? {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val mondayDetails = findViewById<EditText>(R.id.mondayDetails)
        val tuesdayDetails = findViewById<EditText>(R.id.tuesdayDetails)
        val wednesdayDetails = findViewById<EditText>(R.id.wednesdayDetails)
        val editTextText4 = findViewById<EditText>(R.id.editTextText4)
        val fridayDetails = findViewById<EditText>(R.id.fridayDetails)
        val saterdayDetails = findViewById<EditText>(R.id.saterdayDetails)
        val sundayDetails = findViewById<EditText>(R.id.sundayDetails)
        val exitAppBtn = findViewById<Button>(R.id.exitAppBtn)
        val BackBtn = findViewById<Button>(R.id.BackBtn)
        val avgTemp = findViewById<Button>(R.id.avgTemp)
        val tempDisplay = findViewById<TextView>(R.id.tempDisplay)

        mondayDetails.text.toString()
        tuesdayDetails.text.toString()
        wednesdayDetails.text.toString()
        editTextText4.text.toString()
        fridayDetails.text.toString()
        saterdayDetails.text.toString()
        sundayDetails.text.toString()

        val intent = intent(this, secondScreenTimeEfficiency::class.java)
        var details = null
        intent. display("weather", details)
        startActivity(intent)

        avgTemp.setOnClickListener {
            val input = avgTemp.text.toString()
            val temperatures = input.split(",").mapNotNull{ it.trim().toDoubleOrNull(()) }
            if (temperatures.isNotEmpty()) {
                val tempDisplay = temperatures.average()
                tempDisplay.text = "Average Temperature: $avgTemp"
            }else}
                    tempDisplay.text = "Please enter valid temperature"
            }

        }

        BackBtn.setOnClickListener
fun intent(any: Any, java: Class<secondScreenTimeEfficiency<*>>): Any {

}

{
            val intent = intent(this, secondScreenTimeEfficiency::class.java)
            startActivity(intent)

    val exitAppBtn
    exitAppBtn.setOnClickListener {
                finishAffinity()


    private fun intent(
        mainActivity3: MainActivity3,
        java: Class<secondScreenTimeEfficiency<*>>
    ): Intent? {

    }

}

private fun Intent?.display(s: String, details: Nothing?) {

}
