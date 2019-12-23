package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.gpu.preferences

import com.smlnskgmail.jaman.deviceinfo.logic.preferences.PreferenceUnit

class GPUModelPreferenceUnit :
    PreferenceUnit<String> {

    override fun key() = "gpu_model"

    override fun defaultValue() = ""

}
