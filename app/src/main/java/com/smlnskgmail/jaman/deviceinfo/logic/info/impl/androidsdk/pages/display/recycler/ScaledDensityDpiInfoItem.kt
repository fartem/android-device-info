package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.display.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.DisplayInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem

class ScaledDensityDpiInfoItem(
    private val context: Context,
    private val displayInfo: DisplayInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_display_scaled_density_dpi)

    override fun body() = displayInfo.scaledDensity().toString()

}
