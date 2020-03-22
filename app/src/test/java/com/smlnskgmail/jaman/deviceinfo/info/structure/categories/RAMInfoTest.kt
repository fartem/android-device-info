package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.FakeRAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoIntResult
import org.junit.Assert.assertEquals
import org.junit.Test

class RAMInfoTest {

    private val ramInfo = FakeRAMInfo()

    private val fakeResult = FakeInfoIntResult().value().toLong()

    @Test
    fun totalRAM() {
        assertEquals(
            fakeResult,
            ramInfo.totalRAM()
        )
    }

    @Test
    fun availableRAM() {
        assertEquals(
            fakeResult,
            ramInfo.availableRAM()
        )
    }

}
