package com.customtoasthelper

import android.content.Context
import android.widget.Toast

object CustomHelper {
    fun  showToast(context: Context,message:String){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }
}