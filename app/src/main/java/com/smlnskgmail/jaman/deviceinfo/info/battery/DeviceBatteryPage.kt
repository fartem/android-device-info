package com.smlnskgmail.jaman.deviceinfo.info.battery

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.battery.realization.DeviceBatteryInfo
import com.smlnskgmail.jaman.deviceinfo.info.battery.realization.infoitems.BatteryActionInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.battery.realization.infoitems.BatteryHealthInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.battery.realization.infoitems.BatteryPluggedInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.battery.structure.BatteryInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem

class DeviceBatteryPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val batteryInfo: BatteryInfo = DeviceBatteryInfo(context!!)
        return listOf(
            BatteryHealthInfoItem(context!!, batteryInfo),
            BatteryActionInfoItem(context!!, batteryInfo),
            BatteryPluggedInfoItem(context!!, batteryInfo)
        )
    }

    override fun pageTitle() = getString(R.string.page_title_battery)

}