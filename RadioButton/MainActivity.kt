
package com.example.radiocolorapp

import android.graphics.Color
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<LinearLayout>(R.id.mainLayout)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { _, checkedId ->

            val radioButton = findViewById<RadioButton>(checkedId)

            when (radioButton.id) {

                R.id.redRadio -> layout.setBackgroundColor(Color.RED)

                R.id.greenRadio -> layout.setBackgroundColor(Color.GREEN)

                R.id.blueRadio -> layout.setBackgroundColor(Color.BLUE)
            }
        }
    }
}

