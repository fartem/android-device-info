package com.smlnskgmail.jaman.deviceinfo.info.battery.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.battery.structure.BatteryInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem

class BatteryActionInfoItem(private val context: Context, private val batteryInfo: BatteryInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_battery_action)

    override fun body() = batteryInfo.actionStatus()

}