package com.smlnskgmail.jaman.deviceinfo.info.ram

import android.app.ActivityManager
import android.content.Context
import android.content.Context.ACTIVITY_SERVICE

class DeviceRAM(context: Context) {

    private var memoryInfo: ActivityManager.MemoryInfo = ActivityManager.MemoryInfo()
    private var activityManager: ActivityManager = context.getSystemService(ACTIVITY_SERVICE) as ActivityManager

    fun loadState() {
        activityManager.getMemoryInfo(memoryInfo)
    }

    fun totalRAM() = BytesInMegabytes(memoryInfo.totalMem)

    fun availableRAM() = BytesInMegabytes(memoryInfo.availMem)

}