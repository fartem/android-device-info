package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.GPUIInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu.preferences.GPUModelPreferenceValue
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu.preferences.GPUVendorPreferenceValue
import com.smlnskgmail.jaman.deviceinfo.logic.preferences.impl.shared.StringPreference

class DeviceGPUIInfo(
    private val context: Context
) : GPUIInfo {

    override fun vendor() = StringPreference(
        context,
        GPUVendorPreferenceValue()
    ).value()

    override fun model() = StringPreference(
        context,
        GPUModelPreferenceValue()
    ).value()

}
