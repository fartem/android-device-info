package com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences

import com.smlnskgmail.jaman.deviceinfo.preferences.PreferenceConfiguration

class GPUVendorPreferenceConfiguration : PreferenceConfiguration<String> {

    override fun key() = "gpu_vendor"

    override fun defaultValue() = ""

}