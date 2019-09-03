package com.smlnskgmail.jaman.deviceinfo.info.gpu.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.gpu.structure.GPUIInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem

class GPUModelInfoItem(private val context: Context, private val GPUIInfo: GPUIInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_gpu_model)

    override fun body() = GPUIInfo.model()

}