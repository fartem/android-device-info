package com.smlnskgmail.jaman.deviceinfo.preferences.types

import android.content.Context
import android.preference.PreferenceManager
import com.smlnskgmail.jaman.deviceinfo.preferences.Preference
import com.smlnskgmail.jaman.deviceinfo.preferences.PreferenceSupport

class StringPreference(

    private val context: Context,
    private val preferenceSupport: PreferenceSupport<String>

) : Preference<String> {

    private val key = preferenceSupport.key()

    override fun save(value: String) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(key, value).apply()
    }

    override fun value(): String {
        return PreferenceManager.getDefaultSharedPreferences(context)
            .getString(key, preferenceSupport.defaultValue())!!
    }

}