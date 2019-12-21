package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.gpu.preferences

import com.smlnskgmail.jaman.deviceinfo.tools.preferences.PreferenceUnit

class GPUModelPreferenceUnit : PreferenceUnit<String> {

    override fun key() = "gpu_model"

    override fun defaultValue() = ""

}
