package com.smlnskgmail.jaman.deviceinfo.info.ram.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.ram.RAMInfo
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class TotalRAMInfoItem(private val context: Context, private val ramInfo: RAMInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_ram_total)

    override fun body() = ramInfo.totalRAM().toString()

}