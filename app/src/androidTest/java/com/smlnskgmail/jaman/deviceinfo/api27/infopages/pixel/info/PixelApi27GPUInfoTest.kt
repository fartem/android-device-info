package com.smlnskgmail.jaman.deviceinfo.api27.infopages.pixel.info

import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.gpu.DeviceGPUIInfo
import org.junit.Assert.assertNotNull
import org.junit.Test

class PixelApi27GPUInfoTest : BasePixelApi27InfoTest() {

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