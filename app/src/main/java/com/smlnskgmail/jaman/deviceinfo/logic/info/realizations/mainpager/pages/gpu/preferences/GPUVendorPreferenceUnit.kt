package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.gpu.preferences

import com.smlnskgmail.jaman.deviceinfo.logic.preferences.PreferenceUnit

class GPUVendorPreferenceUnit :
    PreferenceUnit<String> {

    override fun key() = "gpu_vendor"

    override fun defaultValue() = ""

}
