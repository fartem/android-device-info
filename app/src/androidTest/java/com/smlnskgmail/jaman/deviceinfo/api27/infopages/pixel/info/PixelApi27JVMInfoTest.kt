package com.smlnskgmail.jaman.deviceinfo.api27.infopages.pixel.info

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.jvm.DeviceJVMInfo
import org.junit.Assert.assertEquals
import org.junit.Test

class PixelApi27JVMInfoTest : BasePixelApi27InfoTest() {

    @Test
    fun checkJVMPage() {
        val jvmInfo = DeviceJVMInfo(context)

        assertEquals(
            context.getString(R.string.jvm_name_art),
            jvmInfo.jvmName()
        )
    }

}