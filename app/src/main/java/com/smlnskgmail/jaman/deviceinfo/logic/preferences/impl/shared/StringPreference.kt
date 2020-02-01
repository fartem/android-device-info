package com.smlnskgmail.jaman.deviceinfo.logic.preferences.impl.shared

import android.content.Context
import androidx.preference.PreferenceManager
import com.smlnskgmail.jaman.deviceinfo.logic.preferences.api.Preference
import com.smlnskgmail.jaman.deviceinfo.logic.preferences.api.PreferenceValue

class StringPreference(
    private val context: Context,
    private val preferenceValue: PreferenceValue<String>
) : Preference<String> {

    private val key = preferenceValue.key()

    override fun save(value: String) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .putString(key, value)
            .apply()
    }

    override fun value(): String {
        return PreferenceManager.getDefaultSharedPreferences(context)
            .getString(key, preferenceValue.defaultValue())!!
    }

}
