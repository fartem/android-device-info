package com.smlnskgmail.jaman.deviceinfo.info.travisci.api22

import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.ram.DeviceRAMInfo
import org.junit.Assert.assertTrue
import org.junit.Test

class Api22RAMInfoTest : BaseInfoTest() {

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
