package com.smlnskgmail.jaman.deviceinfo.info.components.gpu.realization.preferences

import com.smlnskgmail.jaman.deviceinfo.support.preferences.PreferenceSupport

class GPUModelPreferenceSupport : PreferenceSupport<String> {

    override fun key() = "gpu_model"

    override fun defaultValue() = ""

}