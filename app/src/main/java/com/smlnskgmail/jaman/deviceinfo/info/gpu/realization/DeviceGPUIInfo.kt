package com.smlnskgmail.jaman.deviceinfo.info.gpu.realization

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.support.preferences.types.StringPreference
import com.smlnskgmail.jaman.deviceinfo.info.gpu.realization.preferences.GPUModelPreferenceSupport
import com.smlnskgmail.jaman.deviceinfo.info.gpu.realization.preferences.GPUVendorPreferenceSupport
import com.smlnskgmail.jaman.deviceinfo.info.gpu.structure.GPUIInfo

class DeviceGPUIInfo(private val context: Context) : GPUIInfo {

    override fun vendor() = StringPreference(context, GPUVendorPreferenceSupport()).value()

    override fun model() = StringPreference(context, GPUModelPreferenceSupport()).value()

}