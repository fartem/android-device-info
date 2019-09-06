package com.smlnskgmail.jaman.deviceinfo.info.components.gpu.realization.preferences

import com.smlnskgmail.jaman.deviceinfo.support.preferences.PreferenceSupport

class GPUVendorPreferenceSupport : PreferenceSupport<String> {

    override fun key() = "gpu_vendor"

    override fun defaultValue() = ""

}