package com.smlnskgmail.jaman.deviceinfo.preferences

import android.content.Context
import android.preference.PreferenceManager

class StringPreference(

    private val context: Context,
    private val preferenceConfiguration: PreferenceConfiguration<String>

) : Preference<String> {

    private val key = preferenceConfiguration.key()

    override fun save(value: String) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(key, value).apply()
    }

    override fun value(): String {
        return PreferenceManager.getDefaultSharedPreferences(context)
            .getString(key, preferenceConfiguration.defaultValue())!!
    }

}