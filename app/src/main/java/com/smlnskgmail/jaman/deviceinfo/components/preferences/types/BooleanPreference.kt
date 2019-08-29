package com.smlnskgmail.jaman.deviceinfo.components.preferences.types

import android.content.Context
import android.preference.PreferenceManager
import com.smlnskgmail.jaman.deviceinfo.components.preferences.Preference
import com.smlnskgmail.jaman.deviceinfo.components.preferences.PreferenceSupport

class BooleanPreference(

    private val context: Context,
    private val preferenceSupport: PreferenceSupport<Boolean>

) : Preference<Boolean> {

    private val key = preferenceSupport.key()

    override fun save(value: Boolean) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(key, value).apply()
    }

    override fun value(): Boolean {
        return PreferenceManager.getDefaultSharedPreferences(context)
            .getBoolean(key, preferenceSupport.defaultValue())
    }

}