package com.smlnskgmail.jaman.deviceinfo.info.implementation.battery.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.structure.BatteryInfo
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class BatteryPluggedInfoItem(private val context: Context, private val batteryInfo: BatteryInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_battery_plugged)

    override fun body() = batteryInfo.pluggedStatus()

}