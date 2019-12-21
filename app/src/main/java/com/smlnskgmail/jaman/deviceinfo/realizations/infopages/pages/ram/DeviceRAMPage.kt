package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.ram

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.ram.recycler.AvailableRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.ram.recycler.TotalRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.sctructure.RAMInfo

class DeviceRAMPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val ramInfo: RAMInfo = DeviceRAMInfo(context!!)
        ramInfo.loadState()
        return listOf(
            AvailableRAMInfoItem(
                context!!,
                ramInfo
            ),
            TotalRAMInfoItem(
                context!!,
                ramInfo
            )
        )
    }

    override fun pageTitleResId() = R.string.page_title_ram

}
