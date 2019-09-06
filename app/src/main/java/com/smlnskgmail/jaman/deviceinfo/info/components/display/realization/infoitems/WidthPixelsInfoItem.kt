package com.smlnskgmail.jaman.deviceinfo.info.components.display.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.display.structure.DisplayInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem

class WidthPixelsInfoItem(private val context: Context, private val displayInfo: DisplayInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_display_width_pixels)

    override fun body() = displayInfo.widthPixels().toString()

}