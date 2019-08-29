package com.smlnskgmail.jaman.deviceinfo.info.structure

import com.smlnskgmail.jaman.deviceinfo.info.structure.tools.FakeInfoIntResult

interface CPUInfo {

    fun cores(): Int
    fun minimumFreq(): Int
    fun maximumFreq(): Int

    class FakeCPUInfo : CPUInfo {

        private val fakeResult = FakeInfoIntResult()

        override fun cores() = fakeResult.value()

        override fun minimumFreq() = fakeResult.value()

        override fun maximumFreq() = fakeResult.value()

    }

}