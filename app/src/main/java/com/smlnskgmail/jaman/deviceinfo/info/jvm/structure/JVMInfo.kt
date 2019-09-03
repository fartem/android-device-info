package com.smlnskgmail.jaman.deviceinfo.info.jvm.structure

import com.smlnskgmail.jaman.deviceinfo.info.support.data.FakeInfoStringResult

interface JVMInfo {

    fun jvmName(): String

    class FakeJVMInfo : JVMInfo {

        override fun jvmName() = FakeInfoStringResult().value()

    }

}