package com.example.profileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = Button(this)
        btn.text = "Open Profile"

        btn.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        setContentView(btn)
    }
}