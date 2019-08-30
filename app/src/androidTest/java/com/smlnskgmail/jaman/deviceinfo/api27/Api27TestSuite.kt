package com.smlnskgmail.jaman.deviceinfo.api27

import com.smlnskgmail.jaman.deviceinfo.api27.pixel.PixelApi27InfoTest
import com.smlnskgmail.jaman.deviceinfo.api27.pixel.PixelApi27UITest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@Suite.SuiteClasses(
    PixelApi27InfoTest::class,
    PixelApi27UITest::class
)
@RunWith(Suite::class)
class Api27TestSuite