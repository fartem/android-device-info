package com.smlnskgmail.jaman.deviceinfo.api27.infopages.pixel.info

import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.cpu.DeviceCPUInfo
import org.junit.Assert.assertNotNull
import org.junit.Test

class PixelApi27CPUInfoTest : BasePixelApi27InfoTest() {

    @Test
    fun checkCPUPage() {
        val cpuInfo = DeviceCPUInfo()

        assertNotNull(
            cpuInfo.cores()
        )

        assertNotNull(
            cpuInfo.minimumFreq()
        )

        assertNotNull(
            cpuInfo.maximumFreq()
        )
    }

}