package com.smlnskgmail.jaman.deviceinfo.info.components.battery

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.battery.realization.DeviceBatteryInfo
import com.smlnskgmail.jaman.deviceinfo.info.components.battery.realization.infoitems.BatteryActionInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.components.battery.realization.infoitems.BatteryHealthInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.components.battery.realization.infoitems.BatteryPluggedInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.components.battery.structure.BatteryInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem

class DeviceBatteryPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val batteryInfo: BatteryInfo = DeviceBatteryInfo(context!!)
        return listOf(
            BatteryHealthInfoItem(context!!, batteryInfo),
            BatteryActionInfoItem(context!!, batteryInfo),
            BatteryPluggedInfoItem(context!!, batteryInfo)
        )
    }

    override fun pageTitleResId() = R.string.page_title_battery

}