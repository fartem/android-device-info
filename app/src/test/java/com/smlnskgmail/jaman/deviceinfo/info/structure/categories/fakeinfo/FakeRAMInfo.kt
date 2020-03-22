package com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoIntResult
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.RAMInfo

class FakeRAMInfo : RAMInfo {

    private val fakeResult = FakeInfoIntResult()

    override fun loadState() {}

    override fun totalRAM() = fakeResult.value().toLong()

    override fun availableRAM() = fakeResult.value().toLong()

}
