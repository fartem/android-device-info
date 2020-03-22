package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.battery.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.BatteryInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem

class BatteryHealthInfoItem(
    private val context: Context,
    private val batteryInfo: BatteryInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_battery_health)

    override fun body() = batteryInfo.health()

}
