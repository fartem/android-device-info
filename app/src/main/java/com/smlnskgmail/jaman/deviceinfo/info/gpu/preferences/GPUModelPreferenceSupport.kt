package com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences

import com.smlnskgmail.jaman.deviceinfo.preferences.PreferenceSupport

class GPUModelPreferenceSupport : PreferenceSupport<String> {

    override fun key() = "gpu_model"

    override fun defaultValue() = ""

}