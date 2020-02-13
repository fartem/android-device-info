package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.jvm

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.JVMInfo

class DeviceJVMInfo(
    private val context: Context
) : JVMInfo {

    override fun jvmName(): String {
        val jvmName = System.getProperty("java.vm.version")
        val resultResId = when {
            jvmName == null -> R.string.common_empty_result
            jvmName.startsWith("2") -> R.string.jvm_name_art
            else -> R.string.jvm_name_dalvik
        }
        return context.getString(resultResId)
    }

}
