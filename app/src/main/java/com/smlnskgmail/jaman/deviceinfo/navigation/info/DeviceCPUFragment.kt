package com.smlnskgmail.jaman.deviceinfo.navigation.info

import com.smlnskgmail.jaman.deviceinfo.info.cpu.DeviceCPUInfo
import com.smlnskgmail.jaman.deviceinfo.info.cpu.infoitems.CPUCoresInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.cpu.infoitems.CPUFreqInfoItem
import com.smlnskgmail.jaman.deviceinfo.navigation.info.structure.BaseListInfoFragment
import com.smlnskgmail.jaman.deviceinfo.navigation.info.structure.list.InfoItem

class DeviceCPUFragment : BaseListInfoFragment() {

    override fun infoItems(): List<InfoItem> {
        val cpuInfo = DeviceCPUInfo()

        return listOf(
            CPUCoresInfoItem(context!!, cpuInfo),
            CPUFreqInfoItem(context!!, cpuInfo)
        )
    }

}