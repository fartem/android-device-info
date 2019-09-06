package com.smlnskgmail.jaman.deviceinfo.info.components.cpu.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.cpu.structure.CPUInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem

class CPUCoresInfoItem(private val context: Context, private val cpuInfo: CPUInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_cpu_cores)

    override fun body() = cpuInfo.cores().toString()

}