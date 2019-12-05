package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.gpu

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.gpu.preferences.GPUModelPreferenceUnit
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.gpu.preferences.GPUVendorPreferenceUnit
import com.smlnskgmail.jaman.deviceinfo.sctructure.GPUIInfo
import com.smlnskgmail.jaman.deviceinfo.tools.preferences.types.StringPreference

class DeviceGPUIInfo(private val context: Context) :
    GPUIInfo {

    override fun vendor() = StringPreference(context, GPUVendorPreferenceUnit()).value()

    override fun model() = StringPreference(context, GPUModelPreferenceUnit()).value()

}