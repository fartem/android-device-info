package com.smlnskgmail.jaman.deviceinfo.info.components.gpu.structure

import com.smlnskgmail.jaman.deviceinfo.info.defaultdata.FakeInfoStringResult

interface GPUIInfo {

    fun vendor(): String
    fun model(): String

    class FakeGPUInfo : GPUIInfo {

        private val fakeResult = FakeInfoStringResult()

        override fun vendor() = fakeResult.value()

        override fun model() = fakeResult.value()

    }

}