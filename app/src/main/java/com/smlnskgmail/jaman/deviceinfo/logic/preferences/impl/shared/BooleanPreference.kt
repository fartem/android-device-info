package com.smlnskgmail.jaman.deviceinfo.logic.preferences.impl.shared

import android.content.Context
import androidx.preference.PreferenceManager
import com.smlnskgmail.jaman.deviceinfo.logic.preferences.api.Preference
import com.smlnskgmail.jaman.deviceinfo.logic.preferences.api.PreferenceValue

class BooleanPreference(
    private val context: Context,
    private val preferenceValue: PreferenceValue<Boolean>
) : Preference<Boolean> {

    private val key = preferenceValue.key()

    override fun save(value: Boolean) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .putBoolean(key, value)
            .apply()
    }

    override fun value(): Boolean {
        return PreferenceManager.getDefaultSharedPreferences(context)
            .getBoolean(key, preferenceValue.defaultValue())
    }

}
