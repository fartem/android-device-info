package com.smlnskgmail.jaman.deviceinfo.tools.preferences.types

import android.content.Context
import androidx.preference.PreferenceManager
import com.smlnskgmail.jaman.deviceinfo.tools.preferences.Preference
import com.smlnskgmail.jaman.deviceinfo.tools.preferences.PreferenceUnit

class StringPreference(
    private val context: Context,
    private val preferenceUnit: PreferenceUnit<String>
) : Preference<String> {

    private val key = preferenceUnit.key()

    override fun save(value: String) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .putString(key, value)
            .apply()
    }

    override fun value(): String {
        return PreferenceManager.getDefaultSharedPreferences(context)
            .getString(key, preferenceUnit.defaultValue())!!
    }

}