package com.smlnskgmail.jaman.deviceinfo.info.system.structure

import com.smlnskgmail.jaman.deviceinfo.info.support.data.FakeInfoStringResult

interface SystemInfo {

    fun model(): String
    fun product(): String
    fun brand(): String
    fun type(): String
    fun manufacturer(): String
    fun board(): String
    fun hardware(): String
    fun releaseVersion(): String
    fun apiLevel(): String
    fun user(): String
    fun host(): String
    fun fingerprint(): String
    fun bootloader(): String
    fun arch(): String
    fun kernelVersion(): String
    fun date(): String
    fun codeName(): String

    class FakeSystemInfo : SystemInfo {

        private val fakeResult =
            FakeInfoStringResult()

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

}