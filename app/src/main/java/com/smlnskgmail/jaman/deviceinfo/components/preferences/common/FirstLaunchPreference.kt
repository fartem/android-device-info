package com.smlnskgmail.jaman.deviceinfo.components.preferences.common

import com.smlnskgmail.jaman.deviceinfo.components.preferences.PreferenceSupport

class FirstLaunchPreferenceSupport : PreferenceSupport<Boolean> {

    override fun key() = "first_launch"

    override fun defaultValue() = true

}