package com.smlnskgmail.jaman.deviceinfo.api27.infopages.pixel.info

import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.display.DeviceDisplayInfo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class PixelApi27DisplayInfoTest : BasePixelApi27InfoTest() {

    @Test
    fun checkDisplayPage() {
        val displayInfo = DeviceDisplayInfo(activityTestRule.activity)

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