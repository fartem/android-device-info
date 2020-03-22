package com.smlnskgmail.jaman.deviceinfo.info.travisci.api22

import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.cpu.DeviceCPUInfo
import org.junit.Assert.assertNotNull
import org.junit.Test

class Api22CPUInfoTest : BaseInfoTest() {

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
