package com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoIntResult
import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoStringResult
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.DisplayInfo

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
