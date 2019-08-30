package com.smlnskgmail.jaman.deviceinfo.api27.pixel

import androidx.test.platform.app.InstrumentationRegistry
import com.smlnskgmail.jaman.deviceinfo.info.implementation.system.DeviceSystemInfo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class PixelApi27InfoTest {

    private val context = InstrumentationRegistry.getInstrumentation().context

    @Test
    private fun checkSystemPage() {
        val systemInfo = DeviceSystemInfo(context)

        assertEquals(systemInfo.apiLevel(), "27")
        assertEquals(systemInfo.arch(), "i686")
        assertEquals(systemInfo.board(), "unknown")
        assertEquals(systemInfo.bootloader(), "unknown")
        assertEquals(systemInfo.brand(), "google")
        assertEquals(systemInfo.codeName(), "O_MR1")
        assertEquals(systemInfo.releaseVersion(), "8.1.0")
        assertEquals(systemInfo.type(), "user")

        assertNotNull(systemInfo.date())
        assertNotNull(systemInfo.fingerprint())
        assertNotNull(systemInfo.hardware())
        assertNotNull(systemInfo.host())
        assertNotNull(systemInfo.kernelVersion())
        assertNotNull(systemInfo.model())
        assertNotNull(systemInfo.product())
        assertNotNull(systemInfo.user())
    }

    @Test
    private fun checkCPUPage() {

    }

    @Test
    private fun checkGPUPage() {

    }

    @Test
    private fun checkJVMPage() {

    }

    @Test
    private fun checkRAMPage() {

    }

    @Test
    private fun checkBatteryPage() {

    }

    @Test
    private fun checkDisplayPage() {

    }

}