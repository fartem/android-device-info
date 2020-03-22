package com.smlnskgmail.jaman.deviceinfo.info.pixel.api27

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.jvm.DeviceJVMInfo
import org.junit.Assert.assertEquals
import org.junit.Test

class Api27JVMInfoTest : BaseInfoTest() {

    @Test
    fun checkJVMPage() {
        val jvmInfo = DeviceJVMInfo(context)

        assertEquals(
            context.getString(R.string.jvm_name_art),
            jvmInfo.jvmName()
        )
    }

}
