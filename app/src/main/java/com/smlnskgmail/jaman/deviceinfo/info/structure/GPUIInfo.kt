package com.smlnskgmail.jaman.deviceinfo.info.structure

import com.smlnskgmail.jaman.deviceinfo.info.structure.tools.FakeInfoStringResult

interface GPUIInfo {

    fun vendor(): String
    fun model(): String

    class FakeGPUInfo : GPUIInfo {

        private val fakeResult = FakeInfoStringResult()

        override fun vendor() = fakeResult.value()

        override fun model() = fakeResult.value()

    }

}