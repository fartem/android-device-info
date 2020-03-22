package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.display

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.DisplayInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.display.recycler.*
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem

class DeviceDisplayPage : BaseListInfoPage() {

    override fun infoItems(): MutableList<InfoItem> {
        val displayInfo: DisplayInfo = DeviceDisplayInfo(
            activity!!
        )
        return mutableListOf(
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
