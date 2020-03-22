package com.smlnskgmail.jaman.deviceinfo.info.pixel.api27

import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.system.DeviceSystemInfo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class Api27SystemInfoTest : BaseInfoTest() {

    @Test
    fun checkSystemPage() {
        val systemInfo = DeviceSystemInfo(context)

        assertEquals(
            "27",
            systemInfo.apiLevel()
        )

        assertEquals(
            "i686",
            systemInfo.arch()
        )

        assertEquals(
            "unknown",
            systemInfo.board()
        )

        assertEquals(
            "unknown",
            systemInfo.bootloader()
        )

        assertEquals(
            "google",
            systemInfo.brand()
        )

        assertEquals(
            "O",
            systemInfo.codeName()
        )

        assertEquals(
            "8.1.0",
            systemInfo.releaseVersion()
        )

        assertNotNull(
            systemInfo.type()
        )

        assertNotNull(
            systemInfo.date()
        )

        assertNotNull(
            systemInfo.fingerprint()
        )

        assertNotNull(
            systemInfo.hardware()
        )

        assertNotNull(
            systemInfo.host()
        )

        assertNotNull(
            systemInfo.kernelVersion()
        )

        assertNotNull(
            systemInfo.model()
        )

        assertNotNull(
            systemInfo.product()
        )

        assertNotNull(
            systemInfo.user()
        )
    }

}
