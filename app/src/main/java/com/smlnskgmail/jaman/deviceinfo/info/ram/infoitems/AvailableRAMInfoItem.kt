package com.smlnskgmail.jaman.deviceinfo.info.ram.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.ram.RAMInfo
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class AvailableRAMInfoItem(private val context: Context, private val ramInfo: RAMInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_ram_available)

    override fun body() = ramInfo.availableRAM().toString()

}