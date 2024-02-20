package com.example.tincoder_sharedpreferences

import android.content.Context

class DataLocalManager { // định nghĩa xem lưu nhưng gì vào file sharepreference

    lateinit var mySharedPreferences: MySharedPreferences

    companion object{

        private const val PREF_FIRST_INSTALL: String  = "PREF_FIRST_INSTALL"
        private const val PREF_NAME_USERS: String  = "PREF_FIRST_INSTALL"

        private lateinit var instance: DataLocalManager // singleton mysharedpreferences
        fun init(context: Context){
            instance = DataLocalManager()
            instance.mySharedPreferences = MySharedPreferences(context)
        }
        fun getInstance(): DataLocalManager { // sington obj
            if (instance == null){
                instance = DataLocalManager()
            }
            return instance
        }

        fun setFirstInstalled(isFirst: Boolean){
            DataLocalManager.getInstance().mySharedPreferences.putBooleanValue(PREF_FIRST_INSTALL, isFirst)
        }
        fun getFirstInstalled(): Boolean{
            return DataLocalManager.getInstance().mySharedPreferences.getBooleanValue(PREF_FIRST_INSTALL)
        }

        fun setNameUsers(nameUsers: MutableSet<String>){
            DataLocalManager.getInstance().mySharedPreferences.putStringSetValue(PREF_NAME_USERS, nameUsers)
        }
        fun getNameUsers(): MutableSet<String>? {
            return DataLocalManager.getInstance().mySharedPreferences.getStringSetValue(PREF_NAME_USERS)
        }
    }
}