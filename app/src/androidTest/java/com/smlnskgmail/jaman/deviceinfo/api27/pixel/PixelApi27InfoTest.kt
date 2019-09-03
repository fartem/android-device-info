package com.smlnskgmail.jaman.deviceinfo.api27.pixel

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.battery.realization.DeviceBatteryInfo
import com.smlnskgmail.jaman.deviceinfo.info.cpu.realization.DeviceCPUInfo
import com.smlnskgmail.jaman.deviceinfo.info.display.realization.DeviceDisplayInfo
import com.smlnskgmail.jaman.deviceinfo.info.gpu.realization.DeviceGPUIInfo
import com.smlnskgmail.jaman.deviceinfo.info.jvm.realization.DeviceJVMInfo
import com.smlnskgmail.jaman.deviceinfo.info.ram.realization.DeviceRAMInfo
import com.smlnskgmail.jaman.deviceinfo.info.system.realization.DeviceSystemInfo
import com.smlnskgmail.jaman.deviceinfo.navigation.MainActivity
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class PixelApi27InfoTest {

    @JvmField
    @Rule
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

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

        assertEquals(jvmInfo.jvmName(), context.getString(R.string.jvm_name_art))
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
        val batteryInfo =
            DeviceBatteryInfo(context)

        assertEquals(batteryInfo.health(), context.getString(R.string.battery_info_health_good))
        assertEquals(batteryInfo.pluggedStatus(), context.getString(R.string.battery_info_common_unknown))
        assertEquals(batteryInfo.actionStatus(), context.getString(R.string.battery_info_action_discharging))
    }

    @Test
    fun checkDisplayPage() {
        val displayInfo =
            DeviceDisplayInfo(
                activityTestRule.activity
            )

        assertEquals(displayInfo.densityDpi(), 420)
        assertEquals(displayInfo.density(), 2.625f)
        assertEquals(displayInfo.heightPixels(), 1794)
        assertEquals(displayInfo.scaledDensity(), 2.625f)
        assertEquals(displayInfo.widthPixels(), 1080)
        assertEquals(displayInfo.xDpi(), 420.0f)
        assertEquals(displayInfo.yDpi(), 420.0f)

        assertNotNull(displayInfo.display())
    }

}