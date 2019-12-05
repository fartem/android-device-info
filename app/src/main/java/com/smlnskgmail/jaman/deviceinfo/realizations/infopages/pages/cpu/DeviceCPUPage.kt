package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.cpu

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.cpu.recycler.CPUCoresInfoItem
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.cpu.recycler.CPUFreqInfoItem
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.sctructure.CPUInfo

class DeviceCPUPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val cpuInfo: CPUInfo =
            DeviceCPUInfo()
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