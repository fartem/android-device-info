package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.components.display.structure.DisplayInfo
import com.smlnskgmail.jaman.deviceinfo.info.defaultdata.FakeInfoIntResult
import com.smlnskgmail.jaman.deviceinfo.info.defaultdata.FakeInfoStringResult
import org.junit.Assert.assertEquals
import org.junit.Test

class DisplayInfoTest {

    private val displayInfo = DisplayInfo.FakeDisplayInfo()

    private val fakeNumberResult = FakeInfoIntResult().value()

    @Test
    fun display() {
        assertEquals(displayInfo.display(), FakeInfoStringResult().value())
    }

    @Test
    fun density() {
        assertEquals(displayInfo.density(), fakeNumberResult.toFloat())
    }

    @Test
    fun densityDpi() {
        assertEquals(displayInfo.densityDpi(), fakeNumberResult)
    }

    @Test
    fun scaledDensity() {
        assertEquals(displayInfo.scaledDensity(), fakeNumberResult.toFloat())
    }

    @Test
    fun widthPixels() {
        assertEquals(displayInfo.widthPixels(), fakeNumberResult)
    }

    @Test
    fun heightPixels() {
        assertEquals(displayInfo.heightPixels(), fakeNumberResult)
    }

    @Test
    fun xDpi() {
        assertEquals(displayInfo.xDpi(), fakeNumberResult.toFloat())
    }

    @Test
    fun yDpi() {
        assertEquals(displayInfo.yDpi(), fakeNumberResult.toFloat())
    }

}