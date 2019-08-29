package com.smlnskgmail.jaman.deviceinfo.info.structure

import com.smlnskgmail.jaman.deviceinfo.info.structure.tools.FakeInfoIntResult

interface RAMInfo {

    fun loadState()
    fun totalRAM(): Long
    fun availableRAM(): Long

    class FakeRAMInfo : RAMInfo {

        private val fakeResult = FakeInfoIntResult()

        override fun loadState() {}

        override fun totalRAM() = fakeResult.value().toLong()

        override fun availableRAM() = fakeResult.value().toLong()

    }

}