package com.smlnskgmail.jaman.deviceinfo.info.display.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.display.DisplayInfo
import com.smlnskgmail.jaman.deviceinfo.navigation.info.structure.list.InfoItem

class DensityDpiInfoItem(private val context: Context, private val displayInfo: DisplayInfo) :
    InfoItem {

    override fun title() = context.getString(R.string.item_info_title_display_density_dpi)

    override fun body() = displayInfo.densityDpi().toString()

}