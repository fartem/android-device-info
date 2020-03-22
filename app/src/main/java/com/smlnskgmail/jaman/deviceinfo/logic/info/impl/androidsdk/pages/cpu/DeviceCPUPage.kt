package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.cpu

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.CPUInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.cpu.recycler.CPUCoresInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.cpu.recycler.CPUFreqInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem

class DeviceCPUPage : BaseListInfoPage() {

    override fun infoItems(): MutableList<InfoItem> {
        val cpuInfo: CPUInfo = DeviceCPUInfo()
        return mutableListOf(
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
