package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoStringResult
import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeJVMInfo
import org.junit.Assert.assertEquals
import org.junit.Test

class JVMInfoTest {

    @Test
    fun jvmName() {
        assertEquals(
            FakeInfoStringResult().value(),
            FakeJVMInfo().jvmName()
        )
    }

}
