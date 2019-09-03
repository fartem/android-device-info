package com.smlnskgmail.jaman.deviceinfo.support.preferences.types

import android.content.Context
import androidx.preference.PreferenceManager
import com.smlnskgmail.jaman.deviceinfo.support.preferences.Preference
import com.smlnskgmail.jaman.deviceinfo.support.preferences.PreferenceSupport

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