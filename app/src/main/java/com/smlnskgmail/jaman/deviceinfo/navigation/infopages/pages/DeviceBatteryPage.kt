package com.smlnskgmail.jaman.deviceinfo.navigation.infopages.pages

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.implementation.battery.DeviceBatteryInfo
import com.smlnskgmail.jaman.deviceinfo.info.implementation.battery.infoitems.BatteryActionInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.implementation.battery.infoitems.BatteryHealthInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.implementation.battery.infoitems.BatteryPluggedInfoItem
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class DeviceBatteryPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val batteryInfo = DeviceBatteryInfo(context!!)

        return listOf(
            BatteryHealthInfoItem(context!!, batteryInfo),
            BatteryActionInfoItem(context!!, batteryInfo),
            BatteryPluggedInfoItem(context!!, batteryInfo)
        )
    }

    override fun pageTitle() = getString(R.string.page_title_battery)

}