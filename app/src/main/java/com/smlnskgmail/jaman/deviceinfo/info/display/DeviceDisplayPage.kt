package com.smlnskgmail.jaman.deviceinfo.info.display

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.display.realization.DeviceDisplayInfo
import com.smlnskgmail.jaman.deviceinfo.info.display.realization.infoitems.*
import com.smlnskgmail.jaman.deviceinfo.info.display.structure.DisplayInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem

class DeviceDisplayPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val displayInfo: DisplayInfo = DeviceDisplayInfo(activity!!)
        return listOf(
            DensityDpiInfoItem(context!!, displayInfo),
            DensityInfoItem(context!!, displayInfo),
            DisplayInfoItem(context!!, displayInfo),
            HeightPixelsInfoItem(context!!, displayInfo),
            ScaledDensityDpiInfoItem(context!!, displayInfo),
            WidthPixelsInfoItem(context!!, displayInfo),
            XDpiInfoItem(context!!, displayInfo),
            YDpiInfoItem(context!!, displayInfo)
        )
    }

    override fun pageTitleResId() = R.string.page_title_display

}