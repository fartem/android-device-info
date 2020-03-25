package com.smlnskgmail.jaman.deviceinfo.info.pixel

import com.smlnskgmail.jaman.deviceinfo.info.pixel.api27.*
import com.smlnskgmail.jaman.deviceinfo.ui.PageRunnerTest
import com.smlnskgmail.jaman.deviceinfo.utils.ClipboardTextTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@Suite.SuiteClasses(
    Api27BatteryInfoTest::class,
    Api27CPUInfoTest::class,
    Api27DisplayInfoTest::class,
    Api27GPUInfoTest::class,
    Api27JVMInfoTest::class,
    Api27RAMInfoTest::class,
    Api27SystemInfoTest::class,
    PageRunnerTest::class,
    ClipboardTextTest::class
)
@RunWith(Suite::class)
class Api27TestSuite
