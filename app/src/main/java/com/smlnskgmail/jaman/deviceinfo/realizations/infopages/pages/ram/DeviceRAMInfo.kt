package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.ram

import android.app.ActivityManager
import android.content.Context
import android.content.Context.ACTIVITY_SERVICE
import com.smlnskgmail.jaman.deviceinfo.sctructure.RAMInfo

class DeviceRAMInfo(context: Context) :
    RAMInfo {

    private var memoryInfo: ActivityManager.MemoryInfo = ActivityManager.MemoryInfo()
    private var activityManager: ActivityManager = context.getSystemService(ACTIVITY_SERVICE) as ActivityManager

    override fun loadState() {
        activityManager.getMemoryInfo(memoryInfo)
    }

    override fun totalRAM() = BytesInMegabytes(
        memoryInfo.totalMem
    ).result()

    override fun availableRAM() = BytesInMegabytes(
        memoryInfo.availMem
    ).result()

}