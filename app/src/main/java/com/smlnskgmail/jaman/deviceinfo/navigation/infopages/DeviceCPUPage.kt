package com.smlnskgmail.jaman.deviceinfo.navigation.infopages

import com.smlnskgmail.jaman.deviceinfo.info.cpu.DeviceCPUInfo
import com.smlnskgmail.jaman.deviceinfo.info.cpu.infoitems.CPUCoresInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.cpu.infoitems.CPUFreqInfoItem
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class DeviceCPUPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val cpuInfo = DeviceCPUInfo()

        return listOf(
            CPUCoresInfoItem(context!!, cpuInfo),
            CPUFreqInfoItem(context!!, cpuInfo)
        )
    }

    override fun pageTitle() = "CPU"

}