package com.smlnskgmail.jaman.deviceinfo.info.display

import android.app.Activity
import android.os.Build
import android.util.DisplayMetrics

class DeviceDisplay(activity: Activity) : Display{

    private var displayMetrics: DisplayMetrics = DisplayMetrics()

    init {
        activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
    }

    override fun display() = Build.DISPLAY

    override fun density() = displayMetrics.density

    override fun densityDpi() = displayMetrics.densityDpi

    override fun scaledDensity() = displayMetrics.scaledDensity

    override fun widthPixels() = displayMetrics.widthPixels

    override fun heightPixels() = displayMetrics.heightPixels

    override fun xDpi() = displayMetrics.xdpi

    override fun yDpi() = displayMetrics.ydpi

}