package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.battery

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.battery.recycler.BatteryActionInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.battery.recycler.BatteryHealthInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.battery.recycler.BatteryPluggedInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.BatteryInfo

class DeviceBatteryPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val batteryInfo: BatteryInfo = DeviceBatteryInfo(context!!)
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
