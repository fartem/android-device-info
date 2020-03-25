package com.smlnskgmail.jaman.deviceinfo.info.travisci

import com.smlnskgmail.jaman.deviceinfo.info.travisci.api22.*
import com.smlnskgmail.jaman.deviceinfo.ui.PageRunnerTest
import com.smlnskgmail.jaman.deviceinfo.utils.ClipboardTextTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@Suite.SuiteClasses(
    Api22BatteryInfoTest::class,
    Api22CPUInfoTest::class,
    Api22DisplayInfoTest::class,
    Api22GPUInfoTest::class,
    Api22JVMInfoTest::class,
    Api22RAMInfoTest::class,
    Api22SystemInfoTest::class,
    PageRunnerTest::class,
    ClipboardTextTest::class
)
@RunWith(Suite::class)
class Api22TestSuite
