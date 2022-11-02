package com.irwantoadi.greensy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Menu4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu4)
        val btn_menu_profile: ImageButton = findViewById(R.id.btn_profile)
        val btn_home: ImageButton = findViewById(R.id.btn_home)

        btn_home.setOnClickListener {
            finish()
        }
        btn_menu_profile.setOnClickListener {
            val intent = Intent(this@Menu4Activity, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}