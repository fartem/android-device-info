package com.smlnskgmail.jaman.deviceinfo.info.gpu

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences.GPUModelPreferenceSupport
import com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences.GPUVendorPreferenceSupport
import com.smlnskgmail.jaman.deviceinfo.preferences.types.StringPreference

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