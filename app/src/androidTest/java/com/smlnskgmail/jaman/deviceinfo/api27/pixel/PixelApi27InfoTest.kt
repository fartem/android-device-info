package com.smlnskgmail.jaman.deviceinfo.api27.pixel

import androidx.test.platform.app.InstrumentationRegistry
import com.smlnskgmail.jaman.deviceinfo.info.implementation.cpu.DeviceCPUInfo
import com.smlnskgmail.jaman.deviceinfo.info.implementation.gpu.DeviceGPUIInfo
import com.smlnskgmail.jaman.deviceinfo.info.implementation.jvm.DeviceJVMInfo
import com.smlnskgmail.jaman.deviceinfo.info.implementation.ram.DeviceRAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.implementation.system.DeviceSystemInfo
import org.junit.Assert.*
import org.junit.Test

class PixelApi27InfoTest {

    private val context = InstrumentationRegistry.getInstrumentation().targetContext

    @Test
    fun checkSystemPage() {
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
    fun checkCPUPage() {
        val cpuInfo = DeviceCPUInfo()

        assertNotNull(cpuInfo.cores())
        assertNotNull(cpuInfo.minimumFreq())
        assertNotNull(cpuInfo.maximumFreq())
    }

    @Test
    fun checkGPUPage() {
        val gpuInfo = DeviceGPUIInfo(context)

        assertNotNull(gpuInfo.model())
        assertNotNull(gpuInfo.vendor())
    }

    @Test
    fun checkJVMPage() {
        val jvmInfo = DeviceJVMInfo(context)

        assertEquals(jvmInfo.jvmName(), "ART")
    }

    @Test
    fun checkRAMPage() {
        val ramInfo = DeviceRAMInfo(context)
        ramInfo.loadState()

        assertTrue(ramInfo.availableRAM() > 0)
        assertTrue(ramInfo.totalRAM() > 0)
    }

    @Test
    fun checkBatteryPage() {

    }

    @Test
    fun checkDisplayPage() {

    }

}