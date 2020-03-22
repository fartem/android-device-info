package com.smlnskgmail.jaman.deviceinfo.info.pixel.api27

import com.smlnskgmail.jaman.deviceinfo.info.BaseInfoTest
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.display.DeviceDisplayInfo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class Api27DisplayInfoTest : BaseInfoTest() {

    @Test
    fun checkDisplayPage() {
        val displayInfo = DeviceDisplayInfo(
            activityTestRule.activity
        )

        assertEquals(
            420,
            displayInfo.densityDpi()
        )

        assertEquals(
            2.625f,
            displayInfo.density()
        )

        assertEquals(
            1794,
            displayInfo.heightPixels()
        )

        assertEquals(
            2.625f,
            displayInfo.scaledDensity()
        )

        assertEquals(
            1080,
            displayInfo.widthPixels()
        )

        assertEquals(
            420.0f,
            displayInfo.xDpi()
        )

        assertEquals(
            420.0f,
            displayInfo.yDpi()
        )

        assertNotNull(
            displayInfo.display()
        )
    }

}
