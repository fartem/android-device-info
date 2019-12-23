package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.ram

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.ram.recycler.AvailableRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.ram.recycler.TotalRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.RAMInfo

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
