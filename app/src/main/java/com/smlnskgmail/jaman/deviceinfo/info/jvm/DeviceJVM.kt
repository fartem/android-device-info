package com.smlnskgmail.jaman.deviceinfo.info.jvm

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R

class DeviceJVM(private val context: Context) {

    fun jvmName(): String {
        val jvmName = System.getProperty("java.vm.version")
        val resultResId = when {
            jvmName == null -> R.string.common_empty_result
            jvmName.startsWith("2") -> R.string.jvm_name_art
            else -> R.string.jvm_name_dalvik
        }
        return context.getString(resultResId)
    }

}