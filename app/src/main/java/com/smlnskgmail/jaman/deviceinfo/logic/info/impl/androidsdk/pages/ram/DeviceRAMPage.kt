package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.ram

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.RAMInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.ram.recycler.AvailableRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.ram.recycler.TotalRAMInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem

class DeviceRAMPage : BaseListInfoPage() {

    override fun infoItems(): MutableList<InfoItem> {
        val ramInfo: RAMInfo = DeviceRAMInfo(context!!)
        ramInfo.loadState()
        return mutableListOf(
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
