package com.smlnskgmail.jaman.deviceinfo.info.structure.tests

import com.smlnskgmail.jaman.deviceinfo.info.structure.BatteryInfo
import com.smlnskgmail.jaman.deviceinfo.info.structure.tools.FakeInfoStringResult
import junit.framework.Assert.assertEquals
import org.junit.Test

class BatteryInfoTest {

    private val batteryInfo = BatteryInfo.FakeBatteryInfo()

    private val fakeResult = FakeInfoStringResult().value()

    @Test
    fun health() {
        assertEquals(batteryInfo.health(), fakeResult)
    }

    @Test
    fun pluggedStatus() {
        assertEquals(batteryInfo.pluggedStatus(), fakeResult)
    }

    @Test
    fun actionStatus() {
        assertEquals(batteryInfo.actionStatus(), fakeResult)
    }

}