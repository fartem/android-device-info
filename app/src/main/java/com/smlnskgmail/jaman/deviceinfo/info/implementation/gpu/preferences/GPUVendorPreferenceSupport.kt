package com.smlnskgmail.jaman.deviceinfo.info.implementation.gpu.preferences

import com.smlnskgmail.jaman.deviceinfo.components.preferences.PreferenceSupport

class GPUVendorPreferenceSupport : PreferenceSupport<String> {

    override fun key() = "gpu_vendor"

    override fun defaultValue() = ""

}