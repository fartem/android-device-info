package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.GPUIInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem

class GPUVendorInfoItem(
    private val context: Context,
    private val gpuInfo: GPUIInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_gpu_vendor)

    override fun body() = gpuInfo.vendor()

}
