package com.smlnskgmail.jaman.deviceinfo.info.system

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import com.smlnskgmail.jaman.deviceinfo.R
import java.text.SimpleDateFormat
import java.util.*

class DeviceSystem(private val context: Context) : System {

    override fun model() = Build.MODEL

    override fun product() = Build.PRODUCT

    override fun brand() = Build.BRAND

    override fun type() = Build.TYPE

    override fun manufacturer() = Build.MANUFACTURER

    override fun board() = Build.BOARD

    override fun hardware() = Build.HARDWARE

    override fun releaseVersion() = Build.VERSION.RELEASE

    override fun apiLevel() = Build.VERSION.SDK

    override fun user() = Build.USER

    override fun host() = Build.HOST

    override fun fingerprint() = Build.FINGERPRINT

    override fun bootloader() = Build.BOOTLOADER

    override fun arch(): String {
        val arch = java.lang.System.getProperty("os.arch")
        return if (!arch.isNullOrEmpty()) {
            arch
        } else {
            errorResult()
        }
    }

    override fun kernelVersion(): String {
        val kernelVersion = java.lang.System.getProperty("os.version")
        return if (!kernelVersion.isNullOrEmpty()) {
            kernelVersion
        } else {
            errorResult()
        }
    }

    @SuppressLint("SimpleDateFormat")
    override fun date(): String {
        val date = Date(Build.TIME)
        val dateFormat = SimpleDateFormat("dd/MM/yy")
        return dateFormat.format(date)
    }

    override fun codeName(): String {
        val fields = Build.VERSION_CODES::class.java.fields
        return fields[Build.VERSION.SDK_INT + 1].name
    }

    private fun errorResult() = context.getString(R.string.common_empty_result)

}