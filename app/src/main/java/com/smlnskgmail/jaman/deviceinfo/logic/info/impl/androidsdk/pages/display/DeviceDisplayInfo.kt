package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.display

import android.app.Activity
import android.os.Build
import android.util.DisplayMetrics
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.DisplayInfo

class DeviceDisplayInfo(activity: Activity) :
    DisplayInfo {

    private var displayMetrics: DisplayMetrics = DisplayMetrics()

    init {
        activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
    }

    override fun display() = Build.DISPLAY!!

    override fun density() = displayMetrics.density

    override fun densityDpi() = displayMetrics.densityDpi

    override fun scaledDensity() = displayMetrics.scaledDensity

    override fun widthPixels() = displayMetrics.widthPixels

    override fun heightPixels() = displayMetrics.heightPixels

    override fun xDpi() = displayMetrics.xdpi

    override fun yDpi() = displayMetrics.ydpi

}
