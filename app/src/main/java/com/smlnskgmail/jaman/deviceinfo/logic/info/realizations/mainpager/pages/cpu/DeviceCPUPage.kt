package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.cpu

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.cpu.recycler.CPUCoresInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.cpu.recycler.CPUFreqInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.CPUInfo

class DeviceCPUPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val cpuInfo: CPUInfo = DeviceCPUInfo()
        return listOf(
            CPUCoresInfoItem(
                context!!,
                cpuInfo
            ),
            CPUFreqInfoItem(
                context!!,
                cpuInfo
            )
        )
    }

    override fun pageTitleResId() = R.string.page_title_cpu

}
