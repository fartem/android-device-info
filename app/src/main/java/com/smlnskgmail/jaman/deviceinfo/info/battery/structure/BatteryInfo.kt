package com.smlnskgmail.jaman.deviceinfo.info.battery.structure

import com.smlnskgmail.jaman.deviceinfo.info.support.data.FakeInfoStringResult

interface BatteryInfo {

    fun health(): String
    fun pluggedStatus(): String
    fun actionStatus(): String

    class FakeBatteryInfo : BatteryInfo {

        private val fakeResult = FakeInfoStringResult()

        override fun health() = fakeResult.value()

        override fun pluggedStatus() = fakeResult.value()

        override fun actionStatus() = fakeResult.value()

    }

}