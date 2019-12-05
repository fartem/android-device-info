package com.smlnskgmail.jaman.deviceinfo.info.structure.tools

import com.smlnskgmail.jaman.deviceinfo.tools.data.NullHandle
import org.junit.Assert.assertEquals
import org.junit.Test

class NullHandleTest {

    @Test
    fun checkValueHandle() {
        val data = "Test string"

        val value = NullHandle(
            data,
            ""
        ).result()

        assertEquals(
            data,
            value
        )
    }

    @Test
    fun checkNullHandle() {
        val defaultValue = "Default value"

        val value = NullHandle(
            null,
            defaultValue
        ).result()

        assertEquals(
            defaultValue,
            value
        )
    }

}