package com.smlnskgmail.jaman.deviceinfo.info.travisci.api22

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.jvm.DeviceJVMInfo
import org.junit.Assert.assertEquals
import org.junit.Test

class Api22JVMInfoTest : BaseInfoTest() {

    @Test
    fun checkJVMPage() {
        val jvmInfo = DeviceJVMInfo(context)

        assertEquals(
            context.getString(R.string.jvm_name_art),
            jvmInfo.jvmName()
        )
    }

}
