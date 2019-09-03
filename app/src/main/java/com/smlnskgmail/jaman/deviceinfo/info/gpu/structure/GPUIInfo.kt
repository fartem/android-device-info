package com.smlnskgmail.jaman.deviceinfo.info.gpu.structure

import com.smlnskgmail.jaman.deviceinfo.info.support.data.FakeInfoStringResult

interface GPUIInfo {

    fun vendor(): String
    fun model(): String

    class FakeGPUInfo : GPUIInfo {

        private val fakeResult = FakeInfoStringResult()

        override fun vendor() = fakeResult.value()

        override fun model() = fakeResult.value()

    }

}