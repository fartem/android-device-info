package com.smlnskgmail.jaman.deviceinfo.info.pixel.api27

import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu.DeviceGPUIInfo
import org.junit.Assert.assertNotNull
import org.junit.Test

class Api27GPUInfoTest : BaseInfoTest() {

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
