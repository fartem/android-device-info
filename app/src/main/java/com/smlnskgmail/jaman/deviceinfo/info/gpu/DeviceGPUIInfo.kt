package com.smlnskgmail.jaman.deviceinfo.info.gpu

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences.GPUModelPreferenceConfiguration
import com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences.GPUVendorPreferenceConfiguration
import com.smlnskgmail.jaman.deviceinfo.preferences.StringPreference

class DeviceGPUIInfo(private val context: Context) : GPUIInfo {

    override fun vendor() = StringPreference(context, GPUVendorPreferenceConfiguration()).value()

    override fun model() = StringPreference(context, GPUModelPreferenceConfiguration()).value()

}