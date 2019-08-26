package com.smlnskgmail.jaman.deviceinfo.info.display.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.display.DisplayInfo
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class ScaledDensityDpiInfoItem(private val context: Context, private val displayInfo: DisplayInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_display_scaled_density_dpi)

    override fun body() = displayInfo.scaledDensity().toString()

}