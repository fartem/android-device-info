package com.smlnskgmail.jaman.deviceinfo.info.components.cpu

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.cpu.realization.DeviceCPUInfo
import com.smlnskgmail.jaman.deviceinfo.info.components.cpu.realization.infoitems.CPUCoresInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.components.cpu.realization.infoitems.CPUFreqInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.components.cpu.structure.CPUInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem

class DeviceCPUPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val cpuInfo: CPUInfo = DeviceCPUInfo()
        return listOf(
            CPUCoresInfoItem(context!!, cpuInfo),
            CPUFreqInfoItem(context!!, cpuInfo)
        )
    }

    override fun pageTitleResId() = R.string.page_title_cpu

}