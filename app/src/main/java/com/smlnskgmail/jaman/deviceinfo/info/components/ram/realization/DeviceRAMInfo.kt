package com.smlnskgmail.jaman.deviceinfo.info.components.ram.realization

import android.app.ActivityManager
import android.content.Context
import android.content.Context.ACTIVITY_SERVICE
import com.smlnskgmail.jaman.deviceinfo.info.components.ram.realization.tools.BytesInMegabytes
import com.smlnskgmail.jaman.deviceinfo.info.components.ram.structure.RAMInfo

class DeviceRAMInfo(context: Context) : RAMInfo {

    private var memoryInfo: ActivityManager.MemoryInfo = ActivityManager.MemoryInfo()
    private var activityManager: ActivityManager = context.getSystemService(ACTIVITY_SERVICE) as ActivityManager

    override fun loadState() {
        activityManager.getMemoryInfo(memoryInfo)
    }

    override fun totalRAM() = BytesInMegabytes(memoryInfo.totalMem).result()

    override fun availableRAM() = BytesInMegabytes(memoryInfo.availMem).result()

}