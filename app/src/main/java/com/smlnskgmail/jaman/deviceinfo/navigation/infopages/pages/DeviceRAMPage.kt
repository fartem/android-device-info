package com.smlnskgmail.jaman.deviceinfo.navigation.infopages.pages

import com.smlnskgmail.jaman.deviceinfo.info.implementation.ram.DeviceRAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.implementation.ram.infoitems.AvailableRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.implementation.ram.infoitems.TotalRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class DeviceRAMPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val ramInfo = DeviceRAMInfo(context!!)
        ramInfo.loadState()

        return listOf(
            AvailableRAMInfoItem(context!!, ramInfo),
            TotalRAMInfoItem(context!!, ramInfo)
        )
    }

    override fun pageTitle() = "RAM"

}