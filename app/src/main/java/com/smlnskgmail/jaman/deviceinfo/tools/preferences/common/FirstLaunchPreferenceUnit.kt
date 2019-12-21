package com.smlnskgmail.jaman.deviceinfo.tools.preferences.common

import com.smlnskgmail.jaman.deviceinfo.tools.preferences.PreferenceUnit

class FirstLaunchPreferenceUnit : PreferenceUnit<Boolean> {

    override fun key() = "first_launch"

    override fun defaultValue() = true

}
