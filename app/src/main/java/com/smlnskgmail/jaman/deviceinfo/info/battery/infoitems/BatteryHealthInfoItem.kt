package com.smlnskgmail.jaman.deviceinfo.info.battery.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.battery.BatteryInfo
import com.smlnskgmail.jaman.deviceinfo.navigation.info.structure.list.InfoItem

class BatteryHealthInfoItem(private val context: Context, private val batteryInfo: BatteryInfo) :
    InfoItem {

    override fun title() = context.getString(R.string.item_info_title_battery_health)

    override fun body() = batteryInfo.health()

}