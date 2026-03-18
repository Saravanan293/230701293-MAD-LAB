
package com.example.fragmentsapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDetails = findViewById<Button>(R.id.btnDetails)
        val btnMarks = findViewById<Button>(R.id.btnMarks)

        btnDetails.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, BasicDetailsFragment())
                .commit()
        }

        btnMarks.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MarksFragment())
                .commit()
        }
    }
}

