package com.example.tincoder_sharedpreferences

import android.app.Application

class MyApplication: Application() { //khởi tạo datalocal và khai báo trong manifest
    override fun onCreate() {
        super.onCreate()
        DataLocalManager.init(applicationContext) // khởi tạo datalocal lần đầu
    }
}