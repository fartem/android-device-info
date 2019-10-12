package com.smlnskgmail.jaman.deviceinfo.info.structure.categories

import com.smlnskgmail.jaman.deviceinfo.info.components.system.structure.SystemInfo
import com.smlnskgmail.jaman.deviceinfo.info.defaultdata.FakeInfoStringResult
import org.junit.Assert.assertEquals
import org.junit.Test

class SystemInfoTest {

    private val systemInfo = SystemInfo.FakeSystemInfo()

    private val fakeResult = FakeInfoStringResult().value()

    @Test
    fun model() {
        assertEquals(systemInfo.model(), fakeResult)
    }

    @Test
    fun product() {
        assertEquals(systemInfo.product(), fakeResult)
    }

    @Test
    fun brand() {
        assertEquals(systemInfo.brand(), fakeResult)
    }

    @Test
    fun type() {
        assertEquals(systemInfo.type(), fakeResult)
    }

    @Test
    fun manufacturer() {
        assertEquals(systemInfo.manufacturer(), fakeResult)
    }

    @Test
    fun board() {
        assertEquals(systemInfo.board(), fakeResult)
    }

    @Test
    fun hardware() {
        assertEquals(systemInfo.hardware(), fakeResult)
    }

    @Test
    fun releaseVersion() {
        assertEquals(systemInfo.releaseVersion(), fakeResult)
    }

    @Test
    fun apiLevel() {
        assertEquals(systemInfo.apiLevel(), fakeResult)
    }

    @Test
    fun user() {
        assertEquals(systemInfo.user(), fakeResult)
    }

    @Test
    fun host() {
        assertEquals(systemInfo.host(), fakeResult)
    }

    @Test
    fun fingerprint() {
        assertEquals(systemInfo.fingerprint(), fakeResult)
    }

    @Test
    fun bootloader() {
        assertEquals(systemInfo.bootloader(), fakeResult)
    }

    @Test
    fun arch() {
        assertEquals(systemInfo.arch(), fakeResult)
    }

    @Test
    fun kernelVersion() {
        assertEquals(systemInfo.kernelVersion(), fakeResult)
    }

    @Test
    fun date() {
        assertEquals(systemInfo.date(), fakeResult)
    }

    @Test
    fun codeName() {
        assertEquals(systemInfo.codeName(), fakeResult)
    }

}