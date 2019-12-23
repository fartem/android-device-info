package com.smlnskgmail.jaman.deviceinfo.logic.preferences.types

import android.content.Context
import androidx.preference.PreferenceManager
import com.smlnskgmail.jaman.deviceinfo.logic.preferences.Preference
import com.smlnskgmail.jaman.deviceinfo.logic.preferences.PreferenceUnit

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
