package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.cpu.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.cpu.Ghz
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.CPUInfo

class CPUFreqInfoItem(
    private val context: Context,
    private val cpuInfo: CPUInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_cpu_freq)

    override fun body(): String {
        val minimumFreq = Ghz(
            cpuInfo.minimumFreq()
        ).value()
        val maximumFreq = Ghz(
            cpuInfo.maximumFreq()
        ).value()
        return "%.1f - %.1f Ghz".format(minimumFreq, maximumFreq)
    }

}
