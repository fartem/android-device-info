package com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences

import com.smlnskgmail.jaman.deviceinfo.preferences.PreferenceSupport

class GPUVendorPreferenceSupport : PreferenceSupport<String> {

    override fun key() = "gpu_vendor"

    override fun defaultValue() = ""

}