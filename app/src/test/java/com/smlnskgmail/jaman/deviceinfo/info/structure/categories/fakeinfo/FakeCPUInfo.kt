package com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoIntResult
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.CPUInfo

class FakeCPUInfo : CPUInfo {

    private val fakeResult = FakeInfoIntResult()

    override fun cores() = fakeResult.value()

    override fun minimumFreq() = fakeResult.value()

    override fun maximumFreq() = fakeResult.value()

}
