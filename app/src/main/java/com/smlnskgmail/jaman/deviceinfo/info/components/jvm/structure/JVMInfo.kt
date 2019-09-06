package com.smlnskgmail.jaman.deviceinfo.info.components.jvm.structure

import com.smlnskgmail.jaman.deviceinfo.info.defaultdata.FakeInfoStringResult

interface JVMInfo {

    fun jvmName(): String

    class FakeJVMInfo : JVMInfo {

        override fun jvmName() = FakeInfoStringResult().value()

    }

}