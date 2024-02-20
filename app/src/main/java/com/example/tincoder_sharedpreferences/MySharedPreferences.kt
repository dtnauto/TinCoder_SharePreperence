package com.example.tincoder_sharedpreferences

import android.content.Context
import android.content.SharedPreferences

class MySharedPreferences { // dùng để lưu dữ liệu cho dù app đã bị tắt chứa dữ liệu ( các hàm put và get dữ liệu)
    companion object {
        val MY_SHARED_PREFERENCES = "MY_SHARED_PREFERENCES" // tên file để lưu trữ dữ liệu
    }

    private var mContext: Context

    constructor(mContext: Context) {
        this.mContext = mContext
    }

    fun putBooleanValue(key:String, value: Boolean) { //put dữ liệu vào
        var sharedPreferences: SharedPreferences = mContext.getSharedPreferences( // tạo ra đối tượng để lưu trữ dữ liệu
            MY_SHARED_PREFERENCES, // tên file bất kì. dữ liệu được lưu trong tên_file.xml ở đường dẫn DATA/data/app_name/share_prefs/tên_file.xml
            Context.MODE_PRIVATE // chế độ đọc ghi dữ liệu
        )
        var editor: SharedPreferences.Editor = sharedPreferences.edit() // để chỉnh sửa dữ liệu thì cần tạo đối tượng để chỉnh sửa dữ liệu từ đối tượng lưu dữ liệu
        editor.putBoolean(key,value) // lưu dữ liệu ở các dạng cho phép
        editor.apply() // dùng để xác nhận lưu trữ dữ liệu nhưng không quan
//        editor.commit() // dùng để xác nhận lưu trữ dữ liệu và trả về kết quả xác nhận dữ liệu đã được lưu hay chưa
//        editor.clear() // xóa hết toàn bộ dữ liệu
//        editor.remove(key) //xóa dữ liệu ứng với key
    }
    fun getBooleanValue(key:String): Boolean {  // lấy dữ liệu ra
        var sharedPreferences: SharedPreferences = mContext.getSharedPreferences( // tương tự như trên
            MY_SHARED_PREFERENCES,
            Context.MODE_PRIVATE
        )
        return sharedPreferences.getBoolean(key,false) // lấy ra dữ liệu đã được lưu từ key đã được đánh dấu
    }

    fun putStringValue(key:String, value: String) { //put dữ liệu vào
        var sharedPreferences: SharedPreferences = mContext.getSharedPreferences(
            MY_SHARED_PREFERENCES,
            Context.MODE_PRIVATE
        )
        var editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(key,value)
        editor.apply()
    }
    fun getStringValue(key:String): String? {  // lấy dữ liệu ra
        var sharedPreferences: SharedPreferences = mContext.getSharedPreferences(
            MY_SHARED_PREFERENCES,
            Context.MODE_PRIVATE
        )
        return sharedPreferences.getString(key,"")
    }

    fun putStringSetValue(key:String, value: Set<String>) { //put dữ liệu vào
        var sharedPreferences: SharedPreferences = mContext.getSharedPreferences(
            MY_SHARED_PREFERENCES,
            Context.MODE_PRIVATE
        )
        var editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putStringSet(key,value)
        editor.apply()
    }
    fun getStringSetValue(key:String): MutableSet<String>? {  // lấy dữ liệu ra
        var sharedPreferences: SharedPreferences = mContext.getSharedPreferences(
            MY_SHARED_PREFERENCES,
            Context.MODE_PRIVATE
        )
        val valueDefault = mutableSetOf<String>()
        return sharedPreferences.getStringSet(key,valueDefault)
    }
}