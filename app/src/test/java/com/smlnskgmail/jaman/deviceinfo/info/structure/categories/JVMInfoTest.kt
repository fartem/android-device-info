package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.jvm.structure.JVMInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.data.FakeInfoStringResult
import org.junit.Assert.assertEquals
import org.junit.Test

class JVMInfoTest {

    @Test
    fun jvmName() {
        assertEquals(JVMInfo.FakeJVMInfo().jvmName(), FakeInfoStringResult().value())
    }

}