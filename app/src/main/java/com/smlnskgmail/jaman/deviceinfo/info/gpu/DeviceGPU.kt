package com.smlnskgmail.jaman.deviceinfo.info.gpu

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences.GPUModelPreferenceKey
import com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences.GPUVendorPreferenceKey
import com.smlnskgmail.jaman.deviceinfo.preferences.StringPreference

class DeviceGPU(private val context: Context) {

    fun vendor() = StringPreference(context, GPUVendorPreferenceKey()).value()

    fun model() = StringPreference(context, GPUModelPreferenceKey()).value()

}