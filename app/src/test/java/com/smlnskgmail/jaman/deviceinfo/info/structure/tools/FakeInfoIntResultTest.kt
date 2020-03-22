package com.smlnskgmail.jaman.deviceinfo.info.structure.tools

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoIntResult
import org.junit.Assert.assertEquals
import org.junit.Test

class FakeInfoIntResultTest {

    @Test
    fun value() {
        assertEquals(
            -1,
            FakeInfoIntResult().value()
        )
    }

}
