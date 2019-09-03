package com.smlnskgmail.jaman.deviceinfo.info.display.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.display.structure.DisplayInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem

class DensityDpiInfoItem(private val context: Context, private val displayInfo: DisplayInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_display_density_dpi)

    override fun body() = displayInfo.densityDpi().toString()

}