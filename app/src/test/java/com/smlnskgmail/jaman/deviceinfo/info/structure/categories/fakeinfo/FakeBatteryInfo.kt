package com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoStringResult
import com.smlnskgmail.jaman.deviceinfo.sctructure.BatteryInfo

class FakeBatteryInfo : BatteryInfo {

    private val fakeResult = FakeInfoStringResult()

    override fun health() = fakeResult.value()

    override fun pluggedStatus() = fakeResult.value()

    override fun actionStatus() = fakeResult.value()

}