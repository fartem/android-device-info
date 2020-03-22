package com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoStringResult
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.GPUIInfo

class FakeGPUInfo : GPUIInfo {

    private val fakeResult = FakeInfoStringResult()

    override fun vendor() = fakeResult.value()

    override fun model() = fakeResult.value()

}
