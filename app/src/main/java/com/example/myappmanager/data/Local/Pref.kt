package com.example.myappmanager.data.Local

import android.content.Context
import android.content.SharedPreferences


class Pref(private var context: Context) {

    private var pref: SharedPreferences =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)


    fun isBoardingShow(): Boolean {
        return pref.getBoolean(SHOW_BOARDING, false)
    }

    fun saveBoardingShow(isShow: Boolean) {
        pref.edit().putBoolean(SHOW_BOARDING, isShow).apply()
    }

    companion object{
        private const val PREF_NAME = "pref.task"
        private const val SHOW_BOARDING = "boarding"
    }

}