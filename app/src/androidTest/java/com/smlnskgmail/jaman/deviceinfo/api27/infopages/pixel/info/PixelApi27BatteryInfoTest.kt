package com.smlnskgmail.jaman.deviceinfo.api27.infopages.pixel.info

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.battery.DeviceBatteryInfo
import org.junit.Assert.assertEquals
import org.junit.Test

class PixelApi27BatteryInfoTest : BasePixelApi27InfoTest() {

    @Test
    fun checkBatteryPage() {
        val batteryInfo = DeviceBatteryInfo(context)

        assertEquals(
            context.getString(R.string.battery_info_health_good),
            batteryInfo.health()
        )

        assertEquals(
            context.getString(R.string.battery_info_common_unknown),
            batteryInfo.pluggedStatus()
        )

        assertEquals(
            context.getString(R.string.battery_info_action_discharging),
            batteryInfo.actionStatus()
        )
    }

}