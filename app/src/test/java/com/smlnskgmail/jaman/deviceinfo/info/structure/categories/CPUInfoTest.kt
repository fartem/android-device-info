package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.components.cpu.structure.CPUInfo
import com.smlnskgmail.jaman.deviceinfo.info.defaultdata.FakeInfoIntResult
import org.junit.Assert.assertEquals
import org.junit.Test

class CPUInfoTest {

    private val cpuInfo =  CPUInfo.FakeCPUInfo()

    private val fakeResult = FakeInfoIntResult().value()

    @Test
    fun cores() {
        assertEquals(cpuInfo.cores(), fakeResult)
    }

    @Test
    fun minimumFreq() {
        assertEquals(cpuInfo.minimumFreq(), fakeResult)
    }

    @Test
    fun maximumFreq() {
        assertEquals(cpuInfo.maximumFreq(), fakeResult)
    }

}