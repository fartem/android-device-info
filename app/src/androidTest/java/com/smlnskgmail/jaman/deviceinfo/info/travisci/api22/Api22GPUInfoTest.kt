package com.smlnskgmail.jaman.deviceinfo.info.travisci.api22

import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu.DeviceGPUIInfo
import org.junit.Assert.assertNotNull
import org.junit.Test

class Api22GPUInfoTest : BaseInfoTest() {

    @Test
    fun checkGPUPage() {
        val gpuInfo = DeviceGPUIInfo(context)

        assertNotNull(
            gpuInfo.model()
        )

        assertNotNull(
            gpuInfo.vendor()
        )
    }

}
