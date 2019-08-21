package com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences

import com.smlnskgmail.jaman.deviceinfo.preferences.PreferenceConfiguration

class GPUModelPreferenceConfiguration : PreferenceConfiguration<String> {

    override fun key() = "gpu_model"

    override fun defaultValue() = ""

}