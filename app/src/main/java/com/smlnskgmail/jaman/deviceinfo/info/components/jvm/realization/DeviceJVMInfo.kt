package com.smlnskgmail.jaman.deviceinfo.info.components.jvm.realization

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.jvm.structure.JVMInfo

class DeviceJVMInfo(private val context: Context) : JVMInfo {

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