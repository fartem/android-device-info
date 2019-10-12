package com.smlnskgmail.jaman.deviceinfo.info.components.gpu.realization

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.info.components.gpu.realization.preferences.GPUModelPreferenceSupport
import com.smlnskgmail.jaman.deviceinfo.info.components.gpu.realization.preferences.GPUVendorPreferenceSupport
import com.smlnskgmail.jaman.deviceinfo.info.components.gpu.structure.GPUIInfo
import com.smlnskgmail.jaman.deviceinfo.support.preferences.types.StringPreference

class DeviceGPUIInfo(private val context: Context) : GPUIInfo {

    override fun vendor() = StringPreference(context, GPUVendorPreferenceSupport()).value()

    override fun model() = StringPreference(context, GPUModelPreferenceSupport()).value()

}