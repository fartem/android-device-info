package com.smlnskgmail.jaman.deviceinfo.navigation.infopages

import com.smlnskgmail.jaman.deviceinfo.info.battery.DeviceBatteryInfo
import com.smlnskgmail.jaman.deviceinfo.info.battery.infoitems.BatteryActionInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.battery.infoitems.BatteryHealthInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.battery.infoitems.BatteryPluggedInfoItem
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.BaseListInfoFragment
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class DeviceBatteryFragment : BaseListInfoFragment() {

    override fun infoItems(): List<InfoItem> {
        val batteryInfo = DeviceBatteryInfo(context!!)

        return listOf(
            BatteryHealthInfoItem(context!!, batteryInfo),
            BatteryActionInfoItem(context!!, batteryInfo),
            BatteryPluggedInfoItem(context!!, batteryInfo)
        )
    }

}