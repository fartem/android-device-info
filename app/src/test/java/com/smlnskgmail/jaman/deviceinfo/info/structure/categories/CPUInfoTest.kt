package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.FakeCPUInfo
import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoIntResult
import org.junit.Assert.assertEquals
import org.junit.Test

class CPUInfoTest {

    private val cpuInfo =  FakeCPUInfo()

    private val fakeResult = FakeInfoIntResult().value()

    @Test
    fun cores() {
        assertEquals(
            fakeResult,
            cpuInfo.cores()
        )
    }

    @Test
    fun minimumFreq() {
        assertEquals(
            fakeResult,
            cpuInfo.minimumFreq()
        )
    }

    @Test
    fun maximumFreq() {
        assertEquals(
            fakeResult,
            cpuInfo.maximumFreq()
        )
    }

}
