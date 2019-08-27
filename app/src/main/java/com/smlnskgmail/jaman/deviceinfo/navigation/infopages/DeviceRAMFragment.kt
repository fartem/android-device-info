package com.smlnskgmail.jaman.deviceinfo.navigation.infopages

import com.smlnskgmail.jaman.deviceinfo.info.ram.DeviceRAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.ram.infoitems.AvailableRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.ram.infoitems.TotalRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.BaseListInfoFragment
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class DeviceRAMFragment : BaseListInfoFragment() {

    override fun infoItems(): List<InfoItem> {
        val ramInfo = DeviceRAMInfo(context!!)
        ramInfo.loadState()

        return listOf(
            AvailableRAMInfoItem(context!!, ramInfo),
            TotalRAMInfoItem(context!!, ramInfo)
        )
    }

}