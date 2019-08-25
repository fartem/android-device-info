package com.smlnskgmail.jaman.deviceinfo.info.cpu.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.cpu.CPU
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class CoresInfoItem(private val context: Context, private val cpu: CPU) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_cpu_cores)

    override fun body() = cpu.cores().toString()

}