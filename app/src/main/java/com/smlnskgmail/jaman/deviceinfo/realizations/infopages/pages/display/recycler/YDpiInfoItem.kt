package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.display.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.sctructure.DisplayInfo

class YDpiInfoItem(private val context: Context, private val displayInfo: DisplayInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_display_ydpi)

    override fun body() = displayInfo.yDpi().toString()

}