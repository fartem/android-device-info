package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.gpu.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.sctructure.GPUIInfo

class GPUVendorInfoItem(private val context: Context, private val GPUIInfo: GPUIInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_gpu_vendor)

    override fun body() = GPUIInfo.vendor()

}