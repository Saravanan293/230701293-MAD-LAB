package com.example.movieapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBasic = findViewById<Button>(R.id.btnBasic)
        val btnAdditional = findViewById<Button>(R.id.btnAdditional)

        btnBasic.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MovieBasicFragment())
                .commit()
        }

        btnAdditional.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MovieAdditionalFragment())
                .commit()
        }
    }
}
