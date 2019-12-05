package com.smlnskgmail.jaman.deviceinfo.api27

import com.smlnskgmail.jaman.deviceinfo.api27.infopages.pixel.info.*
import com.smlnskgmail.jaman.deviceinfo.api27.infopages.pixel.ui.PixelApi27UITest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@Suite.SuiteClasses(
    PixelApi27BatteryInfoTest::class,
    PixelApi27CPUInfoTest::class,
    PixelApi27DisplayInfoTest::class,
    PixelApi27GPUInfoTest::class,
    PixelApi27JVMInfoTest::class,
    PixelApi27RAMInfoTest::class,
    PixelApi27SystemInfoTest::class,
    PixelApi27UITest::class
)
@RunWith(Suite::class)
class Api27TestSuite