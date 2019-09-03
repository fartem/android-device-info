package com.smlnskgmail.jaman.deviceinfo.info.system.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem
import com.smlnskgmail.jaman.deviceinfo.info.system.structure.SystemInfo

class BootloaderInfoItem(private val context: Context, private val systemInfo: SystemInfo) :
    InfoItem {

    override fun title() = context.getString(R.string.item_info_title_system_bootloader)

    override fun body() = systemInfo.bootloader()

}