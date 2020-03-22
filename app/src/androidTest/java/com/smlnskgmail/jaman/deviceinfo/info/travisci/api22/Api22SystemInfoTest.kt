package com.smlnskgmail.jaman.deviceinfo.info.travisci.api22

import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.system.DeviceSystemInfo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class Api22SystemInfoTest : BaseInfoTest() {

    @Test
    fun checkSystemPage() {
        val systemInfo = DeviceSystemInfo(context)

        assertEquals(
            "22",
            systemInfo.apiLevel()
        )

        assertNotNull(
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
            "Android",
            systemInfo.brand()
        )

        assertEquals(
            "LOLLIPOP",
            systemInfo.codeName()
        )

        assertEquals(
            "5.1.1",
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
