package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.battery

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.battery.recycler.BatteryActionInfoItem
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.battery.recycler.BatteryHealthInfoItem
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.battery.recycler.BatteryPluggedInfoItem
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.sctructure.BatteryInfo

class DeviceBatteryPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val batteryInfo: BatteryInfo =
            DeviceBatteryInfo(
                context!!
            )
        return listOf(
            BatteryHealthInfoItem(
                context!!,
                batteryInfo
            ),
            BatteryActionInfoItem(
                context!!,
                batteryInfo
            ),
            BatteryPluggedInfoItem(
                context!!,
                batteryInfo
            )
        )
    }

    override fun pageTitleResId() = R.string.page_title_battery

}