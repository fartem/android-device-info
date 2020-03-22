package com.smlnskgmail.jaman.deviceinfo.info.pixel.api27

import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.cpu.DeviceCPUInfo
import org.junit.Assert.assertNotNull
import org.junit.Test

class Api27CPUInfoTest : BaseInfoTest() {

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
