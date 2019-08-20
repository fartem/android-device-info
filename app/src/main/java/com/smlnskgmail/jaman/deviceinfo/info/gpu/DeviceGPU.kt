package com.smlnskgmail.jaman.deviceinfo.info.gpu

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.preferences.StringPreference

class DeviceGPU(private val context: Context) {

    fun vendor() = StringPreference(context, "gpu_vendor").value()

    fun model() = StringPreference(context, "gpu_model").value()

}