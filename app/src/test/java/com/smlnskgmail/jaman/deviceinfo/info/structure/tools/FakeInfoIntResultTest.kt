package com.smlnskgmail.jaman.deviceinfo.info.structure.tools

import com.smlnskgmail.jaman.deviceinfo.info.support.data.FakeInfoIntResult
import org.junit.Assert.assertEquals
import org.junit.Test

class FakeInfoIntResultTest {

    @Test
    fun value() {
        assertEquals(FakeInfoIntResult().value(), -1)
    }

}