package com.smlnskgmail.jaman.deviceinfo.info.components.display.structure

import com.smlnskgmail.jaman.deviceinfo.info.defaultdata.FakeInfoIntResult
import com.smlnskgmail.jaman.deviceinfo.info.defaultdata.FakeInfoStringResult

interface DisplayInfo {

    fun display(): String
    fun density(): Float
    fun densityDpi(): Int
    fun scaledDensity(): Float
    fun widthPixels(): Int
    fun heightPixels(): Int
    fun xDpi(): Float
    fun yDpi(): Float

    class FakeDisplayInfo : DisplayInfo {

        private val fakeNumberResult = FakeInfoIntResult()

        override fun display() = FakeInfoStringResult().value()

        override fun density() = fakeNumberResult.value().toFloat()

        override fun densityDpi() = fakeNumberResult.value()

        override fun scaledDensity() = fakeNumberResult.value().toFloat()

        override fun widthPixels() = fakeNumberResult.value()

        override fun heightPixels() = fakeNumberResult.value()

        override fun xDpi() = fakeNumberResult.value().toFloat()

        override fun yDpi() = fakeNumberResult.value().toFloat()

    }

}