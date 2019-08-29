package com.smlnskgmail.jaman.deviceinfo.info.structure

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.*
import com.smlnskgmail.jaman.deviceinfo.info.structure.tools.FakeInfoIntResultTest
import com.smlnskgmail.jaman.deviceinfo.info.structure.tools.FakeInfoStringResultTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@Suite.SuiteClasses(
    FakeInfoStringResultTest::class,
    FakeInfoIntResultTest::class,
    BatteryInfoTest::class,
    CPUInfoTest::class,
    DisplayInfoTest::class,
    GPUIInfoTest::class,
    JVMInfoTest::class,
    RAMInfoTest::class,
    SystemInfoTest::class
)
@RunWith(Suite::class)
class StructureTestSuite