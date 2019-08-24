package com.smlnskgmail.jaman.deviceinfo.info.system

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import com.smlnskgmail.jaman.deviceinfo.R
import java.text.SimpleDateFormat
import java.util.*

class DeviceSystem(private val context: Context) {

    fun model() = Build.MODEL

    fun product() = Build.PRODUCT

    fun brand() = Build.BRAND

    fun type() = Build.TYPE

    fun manufacturer() = Build.MANUFACTURER

    fun board() = Build.BOARD

    fun hardware() = Build.HARDWARE

    fun releaseVersion() = Build.VERSION.RELEASE

    fun apiLevel() = Build.VERSION.SDK

    fun user() = Build.USER

    fun host() = Build.HOST

    fun fingerprint() = Build.FINGERPRINT

    fun bootloader() = Build.BOOTLOADER

    fun arch(): String {
        val arch = System.getProperty("os.arch")
        return if (!arch.isNullOrEmpty()) {
            arch
        } else {
            errorResult()
        }
    }

    fun kernelVersion(): String {
        val kernelVersion = System.getProperty("os.version")
        return if (!kernelVersion.isNullOrEmpty()) {
            kernelVersion
        } else {
            errorResult()
        }
    }

    @SuppressLint("SimpleDateFormat")
    fun date(): String {
        val date = Date(Build.TIME)
        val dateFormat = SimpleDateFormat("dd/MM/yy")
        return dateFormat.format(date)
    }

    fun codeName(): String {
        val fields = Build.VERSION_CODES::class.java.fields
        return fields[Build.VERSION.SDK_INT + 1].name
    }

    private fun errorResult() = context.getString(R.string.common_empty_result)

}