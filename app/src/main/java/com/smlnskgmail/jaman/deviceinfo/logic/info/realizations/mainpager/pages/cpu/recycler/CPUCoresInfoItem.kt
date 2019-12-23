package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.cpu.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.CPUInfo

class CPUCoresInfoItem(
    private val context: Context,
    private val cpuInfo: CPUInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_cpu_cores)

    override fun body() = cpuInfo.cores().toString()

}
