package com.smlnskgmail.jaman.deviceinfo.info.structure

import com.smlnskgmail.jaman.deviceinfo.info.structure.tools.FakeInfoStringResult

interface JVMInfo {

    fun jvmName(): String

    class FakeJVMInfo : JVMInfo {

        override fun jvmName() = FakeInfoStringResult().value()

    }

}