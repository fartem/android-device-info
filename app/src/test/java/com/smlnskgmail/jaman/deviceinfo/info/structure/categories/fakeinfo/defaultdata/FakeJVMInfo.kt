package com.smlnskgmail.jaman.deviceinfo.info.structure.categories.fakeinfo.defaultdata

import com.smlnskgmail.jaman.deviceinfo.logic.info.api.JVMInfo

class FakeJVMInfo : JVMInfo {

    override fun jvmName() = FakeInfoStringResult().value()

}
