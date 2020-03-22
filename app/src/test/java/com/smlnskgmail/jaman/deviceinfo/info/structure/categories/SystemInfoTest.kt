package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.FakeSystemInfo
import com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata.FakeInfoStringResult
import org.junit.Assert.assertEquals
import org.junit.Test

class SystemInfoTest {

    private val systemInfo = FakeSystemInfo()

    private val fakeResult = FakeInfoStringResult().value()

    @Test
    fun model() {
        assertEquals(
            fakeResult,
            systemInfo.model()
        )
    }

    @Test
    fun product() {
        assertEquals(
            fakeResult,
            systemInfo.product()
        )
    }

    @Test
    fun brand() {
        assertEquals(
            fakeResult,
            systemInfo.brand()
        )
    }

    @Test
    fun type() {
        assertEquals(
            fakeResult,
            systemInfo.type()
        )
    }

    @Test
    fun manufacturer() {
        assertEquals(
            fakeResult,
            systemInfo.manufacturer()
        )
    }

    @Test
    fun board() {
        assertEquals(
            fakeResult,
            systemInfo.board()
        )
    }

    @Test
    fun hardware() {
        assertEquals(
            fakeResult,
            systemInfo.hardware()
        )
    }

    @Test
    fun releaseVersion() {
        assertEquals(
            fakeResult,
            systemInfo.releaseVersion()
        )
    }

    @Test
    fun apiLevel() {
        assertEquals(
            fakeResult,
            systemInfo.apiLevel()
        )
    }

    @Test
    fun user() {
        assertEquals(
            fakeResult,
            systemInfo.user()
        )
    }

    @Test
    fun host() {
        assertEquals(
            fakeResult,
            systemInfo.host()
        )
    }

    @Test
    fun fingerprint() {
        assertEquals(
            fakeResult,
            systemInfo.fingerprint()
        )
    }

    @Test
    fun bootloader() {
        assertEquals(
            fakeResult,
            systemInfo.bootloader()
        )
    }

    @Test
    fun arch() {
        assertEquals(
            fakeResult,
            systemInfo.arch()
        )
    }

    @Test
    fun kernelVersion() {
        assertEquals(
            fakeResult,
            systemInfo.kernelVersion()
        )
    }

    @Test
    fun date() {
        assertEquals(
            fakeResult,
            systemInfo.date()
        )
    }

    @Test
    fun codeName() {
        assertEquals(
            fakeResult,
            systemInfo.codeName()
        )
    }

}
