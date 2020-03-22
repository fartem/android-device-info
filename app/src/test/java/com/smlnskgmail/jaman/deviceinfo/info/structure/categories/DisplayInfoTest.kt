package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.FakeDisplayInfo
import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoIntResult
import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoStringResult
import org.junit.Assert.assertEquals
import org.junit.Test

class DisplayInfoTest {

    private val displayInfo = FakeDisplayInfo()

    private val fakeNumberResult = FakeInfoIntResult().value()

    @Test
    fun display() {
        assertEquals(
            FakeInfoStringResult().value(),
            displayInfo.display()
        )
    }

    @Test
    fun density() {
        assertEquals(
            fakeNumberResult.toFloat(),
            displayInfo.density()
        )
    }

    @Test
    fun densityDpi() {
        assertEquals(
            fakeNumberResult,
            displayInfo.densityDpi()
        )
    }

    @Test
    fun scaledDensity() {
        assertEquals(
            fakeNumberResult.toFloat(),
            displayInfo.scaledDensity()
        )
    }

    @Test
    fun widthPixels() {
        assertEquals(
            fakeNumberResult,
            displayInfo.widthPixels()
        )
    }

    @Test
    fun heightPixels() {
        assertEquals(
            fakeNumberResult,
            displayInfo.heightPixels()
        )
    }

    @Test
    fun xDpi() {
        assertEquals(
            fakeNumberResult.toFloat(),
            displayInfo.xDpi()
        )
    }

    @Test
    fun yDpi() {
        assertEquals(
            fakeNumberResult.toFloat(),
            displayInfo.yDpi()
        )
    }

}
