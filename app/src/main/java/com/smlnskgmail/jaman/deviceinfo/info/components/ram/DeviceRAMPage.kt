package com.smlnskgmail.jaman.deviceinfo.info.components.ram

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.ram.realization.DeviceRAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.components.ram.realization.infoitems.AvailableRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.components.ram.realization.infoitems.TotalRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.components.ram.structure.RAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem

class DeviceRAMPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val ramInfo: RAMInfo = DeviceRAMInfo(context!!)
        ramInfo.loadState()
        return listOf(
            AvailableRAMInfoItem(context!!, ramInfo),
            TotalRAMInfoItem(context!!, ramInfo)
        )
    }

    override fun pageTitleResId() = R.string.page_title_ram

}