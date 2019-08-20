package com.smlnskgmail.jaman.deviceinfo.preferences

import android.content.Context
import android.preference.PreferenceManager

class StringPreference(private val context: Context, private val preferenceKey: PreferenceKey) {

    private val key = preferenceKey.key()

    fun save(value: String) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit().putString(key, value).apply()
    }

    fun value(): String? {
        return PreferenceManager.getDefaultSharedPreferences(context)
            .getString(key, null)
    }

}