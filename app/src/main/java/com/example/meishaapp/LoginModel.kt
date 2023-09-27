package com.example.meishaapp

import android.content.Intent
import android.widget.Toast

class LoginModel {
    var username = ""
    var password = ""

    fun loginCek():Boolean{
        if (username.equals("mesa") &&
            password.equals("root")) {
            return true
        } else {
            return false
        }
    }
}