package com.smlnskgmail.jaman.deviceinfo.info.implementation.gpu

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.components.preferences.types.StringPreference
import com.smlnskgmail.jaman.deviceinfo.info.implementation.gpu.preferences.GPUModelPreferenceSupport
import com.smlnskgmail.jaman.deviceinfo.info.implementation.gpu.preferences.GPUVendorPreferenceSupport
import com.smlnskgmail.jaman.deviceinfo.info.structure.GPUIInfo

class DeviceGPUIInfo(private val context: Context) : GPUIInfo {

    override fun vendor() = StringPreference(
        context,
        GPUVendorPreferenceSupport()
    ).value()

    override fun model() = StringPreference(
        context,
        GPUModelPreferenceSupport()
    ).value()

}