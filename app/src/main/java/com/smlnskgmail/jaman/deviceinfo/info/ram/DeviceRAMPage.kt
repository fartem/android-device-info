package com.smlnskgmail.jaman.deviceinfo.info.ram

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.ram.realization.DeviceRAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.ram.realization.infoitems.AvailableRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.ram.realization.infoitems.TotalRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.ram.structure.RAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem

class DeviceRAMPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val ramInfo: RAMInfo = DeviceRAMInfo(context!!)
        ramInfo.loadState()
        return listOf(
            AvailableRAMInfoItem(context!!, ramInfo),
            TotalRAMInfoItem(context!!, ramInfo)
        )
    }

    override fun pageTitle() = getString(R.string.page_title_ram)

}