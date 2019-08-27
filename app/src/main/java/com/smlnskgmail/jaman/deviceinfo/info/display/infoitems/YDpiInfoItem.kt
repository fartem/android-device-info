package com.smlnskgmail.jaman.deviceinfo.info.display.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.display.DisplayInfo
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class YDpiInfoItem(private val context: Context, private val displayInfo: DisplayInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_display_ydpi)

    override fun body() = displayInfo.yDpi().toString()

}