package com.smlnskgmail.jaman.deviceinfo.info.structure.tools

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoStringResult
import org.junit.Assert.assertEquals
import org.junit.Test

class FakeInfoStringResultTest {

    @Test
    fun value() {
        assertEquals(
            "",
            FakeInfoStringResult().value()
        )
    }

}
