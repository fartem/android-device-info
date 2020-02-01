package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.cpu

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.cpu.recycler.CPUCoresInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.cpu.recycler.CPUFreqInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.CPUInfo

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
