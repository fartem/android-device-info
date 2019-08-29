package com.smlnskgmail.jaman.deviceinfo.info.structure

import com.smlnskgmail.jaman.deviceinfo.info.structure.tests.*
import org.junit.runners.Suite

@Suite.SuiteClasses(
    BatteryInfoTest::class,
    CPUInfoTest::class,
    DisplayInfoTest::class,
    GPUIInfoTest::class,
    JVMInfoTest::class,
    RAMInfoTest::class,
    SystemInfoTest::class
)
class StructureTestSuite