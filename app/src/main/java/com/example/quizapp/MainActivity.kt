package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnCLickListener {

            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this, "Masukkan nama", Toast.LENGTH_SHORT).show()

            }
        }
    }
}