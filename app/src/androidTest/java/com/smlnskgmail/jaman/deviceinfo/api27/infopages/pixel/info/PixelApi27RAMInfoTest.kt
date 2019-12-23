package com.smlnskgmail.jaman.deviceinfo.api27.infopages.pixel.info

import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.ram.DeviceRAMInfo
import org.junit.Assert.assertTrue
import org.junit.Test

class PixelApi27RAMInfoTest : BasePixelApi27InfoTest() {

    @Test
    fun checkRAMPage() {
        val ramInfo = DeviceRAMInfo(context)
        ramInfo.loadState()

        assertTrue(
            ramInfo.availableRAM() > 0
        )

        assertTrue(
            ramInfo.totalRAM() > 0
        )
    }

}