package com.smlnskgmail.jaman.deviceinfo.info.travisci.api22

import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.display.DeviceDisplayInfo
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class Api22DisplayInfoTest : BaseInfoTest() {

    @Test
    fun checkDisplayPage() {
        val displayInfo = DeviceDisplayInfo(
            activityTestRule.activity
        )

        assertTrue(
            displayInfo.densityDpi() > 0
        )

        assertTrue(
            displayInfo.density() > 0
        )

        assertTrue(
            displayInfo.heightPixels() > 0
        )

        assertTrue(
            displayInfo.scaledDensity() > 0
        )

        assertTrue(
            displayInfo.widthPixels() > 0
        )

        assertTrue(
            displayInfo.xDpi() > 0
        )

        assertTrue(
            displayInfo.yDpi() > 0
        )

        assertNotNull(
            displayInfo.display()
        )
    }

}
