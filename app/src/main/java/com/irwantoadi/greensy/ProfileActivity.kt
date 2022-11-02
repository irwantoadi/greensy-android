package com.irwantoadi.greensy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val btn_home: ImageButton = findViewById(R.id.btn_home)

        btn_home.setOnClickListener {
            finish()
        }
    }
}