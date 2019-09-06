package com.smlnskgmail.jaman.deviceinfo.info.components.battery.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.battery.structure.BatteryInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem

class BatteryHealthInfoItem(private val context: Context, private val batteryInfo: BatteryInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_battery_health)

    override fun body() = batteryInfo.health()

}