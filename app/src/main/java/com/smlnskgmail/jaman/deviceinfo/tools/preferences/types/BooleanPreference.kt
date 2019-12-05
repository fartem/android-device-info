package com.smlnskgmail.jaman.deviceinfo.tools.preferences.types

import android.content.Context
import androidx.preference.PreferenceManager
import com.smlnskgmail.jaman.deviceinfo.tools.preferences.Preference
import com.smlnskgmail.jaman.deviceinfo.tools.preferences.PreferenceUnit

class BooleanPreference(
    private val context: Context,
    private val preferenceUnit: PreferenceUnit<Boolean>
) : Preference<Boolean> {

    private val key = preferenceUnit.key()

    override fun save(value: Boolean) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .putBoolean(key, value)
            .apply()
    }

    override fun value(): Boolean {
        return PreferenceManager.getDefaultSharedPreferences(context)
            .getBoolean(key, preferenceUnit.defaultValue())
    }

}