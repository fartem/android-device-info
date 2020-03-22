package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.FakeBatteryInfo
import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoStringResult
import org.junit.Assert.assertEquals
import org.junit.Test

class BatteryInfoTest {

    private val batteryInfo = FakeBatteryInfo()

    private val fakeResult = FakeInfoStringResult().value()

    @Test
    fun health() {
        assertEquals(
            fakeResult,
            batteryInfo.health()
        )
    }

    @Test
    fun pluggedStatus() {
        assertEquals(
            fakeResult,
            batteryInfo.pluggedStatus()
        )
    }

    @Test
    fun actionStatus() {
        assertEquals(
            fakeResult,
            batteryInfo.actionStatus()
        )
    }

}
