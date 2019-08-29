package com.smlnskgmail.jaman.deviceinfo.info.structure

import com.smlnskgmail.jaman.deviceinfo.info.structure.tools.FakeInfoIntResult
import com.smlnskgmail.jaman.deviceinfo.info.structure.tools.FakeInfoStringResult

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

        private val numberFakeResult = FakeInfoIntResult()

        override fun display() = FakeInfoStringResult().value()

        override fun density() = numberFakeResult.value().toFloat()

        override fun densityDpi() = numberFakeResult.value()

        override fun scaledDensity() = numberFakeResult.value().toFloat()

        override fun widthPixels() = numberFakeResult.value()

        override fun heightPixels() = numberFakeResult.value()

        override fun xDpi() = numberFakeResult.value().toFloat()

        override fun yDpi() = numberFakeResult.value().toFloat()

    }

}