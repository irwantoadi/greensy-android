package com.irwantoadi.greensy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageButton
import android.widget.Toast

class RoleActivity : AppCompatActivity() {
    lateinit var btn_pengunjung : ImageButton
    lateinit var btn_pengelola : ImageButton
    var doubleBackToExitOnce : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_role)

        btn_pengunjung = findViewById(R.id.btn_pengunjung)
        btn_pengelola = findViewById(R.id.btn_pengelola)

        btn_pengunjung.setOnClickListener {
            var intent = Intent(this@RoleActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
        btn_pengelola.setOnClickListener {
            var intent = Intent(this@RoleActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitOnce){
            super.onBackPressed()
            return
        }

        this.doubleBackToExitOnce = true;

        Toast.makeText(this, "Tekan satu kali lagi untuk keluar", Toast.LENGTH_SHORT).show()

        Handler(Looper.getMainLooper()).postDelayed({
            kotlin.run { doubleBackToExitOnce = false }
        }, 2000)
    }
}