package com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoStringResult
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.SystemInfo

class FakeSystemInfo : SystemInfo {

    private val fakeResult = FakeInfoStringResult()

    override fun model() = fakeResult.value()

    override fun product() = fakeResult.value()

    override fun brand() = fakeResult.value()

    override fun type() = fakeResult.value()

    override fun manufacturer() = fakeResult.value()

    override fun board() = fakeResult.value()

    override fun hardware() = fakeResult.value()

    override fun releaseVersion() = fakeResult.value()

    override fun apiLevel() = fakeResult.value()

    override fun user() = fakeResult.value()

    override fun host() = fakeResult.value()

    override fun fingerprint() = fakeResult.value()

    override fun bootloader() = fakeResult.value()

    override fun arch() = fakeResult.value()

    override fun kernelVersion() = fakeResult.value()

    override fun date() = fakeResult.value()

    override fun codeName() = fakeResult.value()

}
