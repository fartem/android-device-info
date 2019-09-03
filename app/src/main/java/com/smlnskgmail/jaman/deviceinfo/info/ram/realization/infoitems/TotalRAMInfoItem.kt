package com.smlnskgmail.jaman.deviceinfo.info.ram.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.ram.structure.RAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem

class TotalRAMInfoItem(private val context: Context, private val ramInfo: RAMInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_ram_total)

    override fun body() = "${ramInfo.totalRAM()} ${context.getString(R.string.common_mb)}"

}