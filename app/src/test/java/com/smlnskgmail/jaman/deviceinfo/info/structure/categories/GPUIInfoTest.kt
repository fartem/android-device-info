package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.components.gpu.structure.GPUIInfo
import com.smlnskgmail.jaman.deviceinfo.info.defaultdata.FakeInfoStringResult
import org.junit.Assert.assertEquals
import org.junit.Test

class GPUIInfoTest {

    private val gpuInfo = GPUIInfo.FakeGPUInfo()

    private val fakeResult = FakeInfoStringResult().value()

    @Test
    fun vendor() {
        assertEquals(gpuInfo.vendor(), fakeResult)
    }

    @Test
    fun model() {
        assertEquals(gpuInfo.model(), fakeResult)
    }

}