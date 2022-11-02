package com.irwantoadi.greensy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_menu_1: ImageButton = findViewById(R.id.btn_menu_1)
        val btn_menu_2: ImageButton = findViewById(R.id.btn_menu_2)
        val btn_menu_3: ImageButton = findViewById(R.id.btn_menu_3)
        val btn_menu_4: ImageButton = findViewById(R.id.btn_menu_4)
        val btn_menu_5: ImageButton = findViewById(R.id.btn_menu_5)
        val btn_menu_6: ImageButton = findViewById(R.id.btn_menu_6)
        val btn_menu_profile: ImageButton = findViewById(R.id.btn_profile)

        btn_menu_1.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu1Activity::class.java)
            startActivity(intent)
        }
        btn_menu_2.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu2Activity::class.java)
            startActivity(intent)
        }
        btn_menu_3.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu3Activity::class.java)
            startActivity(intent)
        }
        btn_menu_4.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu4Activity::class.java)
            startActivity(intent)
        }
        btn_menu_5.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu5Activity::class.java)
            startActivity(intent)
        }
        btn_menu_6.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu6Activity::class.java)
            startActivity(intent)
        }
        btn_menu_profile.setOnClickListener {
            val intent = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}