package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.system.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.SystemInfo

class HardwareInfoItem(
    private val context: Context,
    private val systemInfo: SystemInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_system_hardware)

    override fun body() = systemInfo.hardware()

}
