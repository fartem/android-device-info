package com.smlnskgmail.jaman.deviceinfo.info.system.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.info.system.System
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class HardwareInfoItem(private val context: Context, private val system: System) : InfoItem {

    override fun title() = "Hardware"

    override fun body() = system.hardware()

}