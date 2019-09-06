package com.smlnskgmail.jaman.deviceinfo.info.components.ram.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.ram.structure.RAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem

class AvailableRAMInfoItem(private val context: Context, private val ramInfo: RAMInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_ram_available)

    override fun body() = "${ramInfo.availableRAM()} ${context.getString(R.string.common_mb)}"

}