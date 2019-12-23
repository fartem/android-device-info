package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.gpu

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.gpu.preferences.GPUModelPreferenceUnit
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.gpu.preferences.GPUVendorPreferenceUnit
import com.smlnskgmail.jaman.deviceinfo.logic.info.GPUIInfo
import com.smlnskgmail.jaman.deviceinfo.logic.preferences.types.StringPreference

class DeviceGPUIInfo(private val context: Context) :
    GPUIInfo {

    override fun vendor() = StringPreference(
        context,
        GPUVendorPreferenceUnit()
    ).value()

    override fun model() = StringPreference(
        context,
        GPUModelPreferenceUnit()
    ).value()

}
