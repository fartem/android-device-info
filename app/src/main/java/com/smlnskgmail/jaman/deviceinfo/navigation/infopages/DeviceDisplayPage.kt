package com.smlnskgmail.jaman.deviceinfo.navigation.infopages

import com.smlnskgmail.jaman.deviceinfo.info.display.DeviceDisplayInfo
import com.smlnskgmail.jaman.deviceinfo.info.display.infoitems.*
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class DeviceDisplayPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val displayInfo = DeviceDisplayInfo(activity!!)

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

    override fun pageTitle() = "Display"

}