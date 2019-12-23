package com.smlnskgmail.jaman.deviceinfo.logic.preferences.common

import com.smlnskgmail.jaman.deviceinfo.logic.preferences.PreferenceUnit

class FirstLaunchPreferenceUnit :
    PreferenceUnit<Boolean> {

    override fun key() = "first_launch"

    override fun defaultValue() = true

}
