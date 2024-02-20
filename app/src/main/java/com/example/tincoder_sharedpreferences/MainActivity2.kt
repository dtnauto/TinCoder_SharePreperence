package com.example.tincoder_sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var nameUsers = DataLocalManager.getNameUsers()
        findViewById<TextView>(R.id.tv_name_users).setText(nameUsers.toString())
    }
}