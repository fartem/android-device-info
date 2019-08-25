package com.smlnskgmail.jaman.deviceinfo.info.display.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.display.Display
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class HeightPixelsInfoItem(private val context: Context, private val display: Display) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_display_height_pixels)

    override fun body() = display.heightPixels().toString()

}