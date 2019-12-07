package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.battery.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.sctructure.BatteryInfo

class BatteryActionInfoItem(
    private val context: Context,
    private val batteryInfo: BatteryInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_battery_action)

    override fun body() = batteryInfo.actionStatus()

}