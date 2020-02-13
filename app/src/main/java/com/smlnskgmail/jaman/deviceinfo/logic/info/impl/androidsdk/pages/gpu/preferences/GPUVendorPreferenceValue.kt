package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu.preferences

import com.smlnskgmail.jaman.deviceinfo.logic.preferences.api.PreferenceValue

class GPUVendorPreferenceValue : PreferenceValue<String> {

    override fun key() = "gpu_vendor"

    override fun defaultValue() = ""

}
