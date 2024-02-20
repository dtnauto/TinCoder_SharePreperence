package com.example.tincoder_sharedpreferences

import android.content.Context
import android.content.Intent
import android.content.pm.ApplicationInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if(!DataLocalManager.getFirstInstalled()){
//            Toast.makeText(this,"First install app", Toast.LENGTH_LONG).show()
//            DataLocalManager.setFirstInstalled(true)
//        }

        var nameUsers = mutableSetOf("ahihi","ahaha","ahuhu")
        DataLocalManager.setNameUsers(nameUsers)
        findViewById<Button>(R.id.bt_next_activity).setOnClickListener{
            var intentActivity = Intent(this,MainActivity2::class.java)
            startActivity(intentActivity)
        }
    }
}