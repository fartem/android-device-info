package com.smlnskgmail.jaman.deviceinfo.info.cpu.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.info.cpu.CPU
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class FreqCPUInfoItem(private val context: Context, private val cpu: CPU) : InfoItem {

    override fun title() = "Freq"

    override fun body() = String.format("%s - %s", cpu.maximumFreq(), cpu.maximumFreq())

}