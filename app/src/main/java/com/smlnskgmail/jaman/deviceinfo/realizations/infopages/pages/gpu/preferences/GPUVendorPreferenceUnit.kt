package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.gpu.preferences

import com.smlnskgmail.jaman.deviceinfo.tools.preferences.PreferenceUnit

class GPUVendorPreferenceUnit : PreferenceUnit<String> {

    override fun key() = "gpu_vendor"

    override fun defaultValue() = ""

}