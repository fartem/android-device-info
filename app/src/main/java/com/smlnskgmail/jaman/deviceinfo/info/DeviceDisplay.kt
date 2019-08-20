package com.smlnskgmail.jaman.deviceinfo.info

import android.app.Activity
import android.os.Build
import android.util.DisplayMetrics

class DeviceDisplay(activity: Activity) {

    private var displayMetrics: DisplayMetrics = DisplayMetrics()

    init {
        activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
    }

    fun display() = Build.DISPLAY

    fun density() = displayMetrics.density

    fun densityDpi() = displayMetrics.densityDpi

    fun scaledDensity() = displayMetrics.scaledDensity

    fun widthPixels() = displayMetrics.widthPixels

    fun heightPixels() = displayMetrics.heightPixels

    fun xDpi() = displayMetrics.xdpi

    fun yDpi() = displayMetrics.ydpi

}