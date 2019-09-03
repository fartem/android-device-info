package com.smlnskgmail.jaman.deviceinfo.support.preferences.common

import com.smlnskgmail.jaman.deviceinfo.support.preferences.PreferenceSupport

class FirstLaunchPreferenceSupport : PreferenceSupport<Boolean> {

    override fun key() = "first_launch"

    override fun defaultValue() = true

}