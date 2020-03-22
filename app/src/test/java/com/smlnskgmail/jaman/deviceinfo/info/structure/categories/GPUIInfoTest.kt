package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.FakeGPUInfo
import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoStringResult
import org.junit.Assert.assertEquals
import org.junit.Test

class GPUIInfoTest {

    private val gpuInfo = FakeGPUInfo()

    private val fakeResult = FakeInfoStringResult().value()

    @Test
    fun vendor() {
        assertEquals(
            fakeResult,
            gpuInfo.vendor()
        )
    }

    @Test
    fun model() {
        assertEquals(
            fakeResult,
            gpuInfo.model()
        )
    }

}
