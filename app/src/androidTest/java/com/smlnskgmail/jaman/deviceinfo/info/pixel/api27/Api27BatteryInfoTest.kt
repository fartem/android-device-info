package com.smlnskgmail.jaman.deviceinfo.info.pixel.api27

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.battery.DeviceBatteryInfo
import org.junit.Assert.assertEquals
import org.junit.Test

class Api27BatteryInfoTest : BaseInfoTest() {

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
