package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.display

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.DisplayInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.display.recycler.*

class DeviceDisplayPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val displayInfo: DisplayInfo =
            DeviceDisplayInfo(
                activity!!
            )
        return listOf(
            DensityDpiInfoItem(
                context!!,
                displayInfo
            ),
            DensityInfoItem(
                context!!,
                displayInfo
            ),
            DisplayInfoItem(
                context!!,
                displayInfo
            ),
            HeightPixelsInfoItem(
                context!!,
                displayInfo
            ),
            ScaledDensityDpiInfoItem(
                context!!,
                displayInfo
            ),
            WidthPixelsInfoItem(
                context!!,
                displayInfo
            ),
            XDpiInfoItem(
                context!!,
                displayInfo
            ),
            YDpiInfoItem(
                context!!,
                displayInfo
            )
        )
    }

    override fun pageTitleResId() = R.string.page_title_display

}
