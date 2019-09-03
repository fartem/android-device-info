package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.ram.structure.RAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.data.FakeInfoIntResult
import org.junit.Assert.assertEquals
import org.junit.Test

class RAMInfoTest {

    private val ramInfo = RAMInfo.FakeRAMInfo()

    private val fakeResult = FakeInfoIntResult().value().toLong()

    @Test
    fun totalRAM() {
        assertEquals(ramInfo.totalRAM(), fakeResult)
    }

    @Test
    fun availableRAM() {
        assertEquals(ramInfo.availableRAM(), fakeResult)
    }

}