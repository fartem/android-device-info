package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.ram.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.RAMInfo

class AvailableRAMInfoItem(
    private val context: Context,
    private val ramInfo: RAMInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_ram_available)

    override fun body() = "${ramInfo.availableRAM()} ${context.getString(R.string.common_mb)}"

}
