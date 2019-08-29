package com.smlnskgmail.jaman.deviceinfo.info.implementation.gpu.preferences

import com.smlnskgmail.jaman.deviceinfo.components.preferences.PreferenceSupport

class GPUModelPreferenceSupport : PreferenceSupport<String> {

    override fun key() = "gpu_model"

    override fun defaultValue() = ""

}