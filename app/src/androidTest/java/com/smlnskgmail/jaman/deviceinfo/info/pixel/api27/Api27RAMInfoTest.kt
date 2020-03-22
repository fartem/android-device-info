package com.smlnskgmail.jaman.deviceinfo.info.pixel.api27

import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.ram.DeviceRAMInfo
import org.junit.Assert.assertTrue
import org.junit.Test

class Api27RAMInfoTest : BaseInfoTest() {

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
