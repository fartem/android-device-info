package com.smlnskgmail.jaman.deviceinfo.info.components.cpu.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.cpu.realization.infoitems.tools.Ghz
import com.smlnskgmail.jaman.deviceinfo.info.components.cpu.structure.CPUInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem

class CPUFreqInfoItem(private val context: Context, private val cpuInfo: CPUInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_cpu_freq)

    override fun body(): String {
        val minimumFreq = Ghz(cpuInfo.minimumFreq()).value()
        val maximumFreq = Ghz(cpuInfo.maximumFreq()).value()
        return String.format("%.1f - %.1f Ghz", minimumFreq, maximumFreq)
    }

}