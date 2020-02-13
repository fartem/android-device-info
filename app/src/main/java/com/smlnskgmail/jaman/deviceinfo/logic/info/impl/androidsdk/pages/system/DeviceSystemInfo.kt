package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.system

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.SystemInfo
import java.text.SimpleDateFormat
import java.util.*

class DeviceSystemInfo(
    private val context: Context
) : SystemInfo {

    override fun model(): String = Build.MODEL

    override fun product(): String = Build.PRODUCT

    override fun brand(): String = Build.BRAND

    override fun type(): String = Build.TYPE

    override fun manufacturer(): String = Build.MANUFACTURER

    override fun board(): String = Build.BOARD

    override fun hardware(): String = Build.HARDWARE

    override fun releaseVersion(): String = Build.VERSION.RELEASE

    override fun apiLevel(): String = Build.VERSION.SDK

    override fun user(): String = Build.USER

    override fun host(): String = Build.HOST

    override fun fingerprint(): String = Build.FINGERPRINT

    override fun bootloader(): String = Build.BOOTLOADER

    override fun arch(): String {
        val arch = System.getProperty("os.arch")
        return if (!arch.isNullOrEmpty()) arch else errorResult()
    }

    override fun kernelVersion(): String {
        val kernelVersion = System.getProperty("os.version")
        return if (!kernelVersion.isNullOrEmpty()) kernelVersion else errorResult()
    }

    @SuppressLint("SimpleDateFormat")
    override fun date(): String {
        val date = Date(Build.TIME)
        val dateFormat = SimpleDateFormat("dd/MM/yy")
        return dateFormat.format(date)
    }

    override fun codeName(): String {
        val fields = Build.VERSION_CODES::class.java.fields
        return fields[Build.VERSION.SDK_INT].name
    }

    private fun errorResult() = context.getString(R.string.common_empty_result)

}
