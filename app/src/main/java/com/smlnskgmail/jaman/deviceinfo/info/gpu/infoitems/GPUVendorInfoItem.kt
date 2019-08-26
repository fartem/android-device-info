package com.smlnskgmail.jaman.deviceinfo.info.gpu.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.gpu.GPUIInfo
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class GPUVendorInfoItem(private val context: Context, private val GPUIInfo: GPUIInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_gpu_vendor)

    override fun body() = GPUIInfo.vendor()

}