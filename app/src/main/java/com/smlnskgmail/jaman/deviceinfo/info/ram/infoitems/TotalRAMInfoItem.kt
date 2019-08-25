package com.smlnskgmail.jaman.deviceinfo.info.ram.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.info.ram.RAM
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class TotalRAMInfoItem(private val context: Context, private val ram: RAM) : InfoItem {

    override fun title() = "Total RAM"

    override fun body() = ram.totalRAM().toString()

}