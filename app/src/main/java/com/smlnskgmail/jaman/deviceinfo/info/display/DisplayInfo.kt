package com.smlnskgmail.jaman.deviceinfo.info.display

interface DisplayInfo {

    fun display(): String
    fun density(): Float
    fun densityDpi(): Int
    fun scaledDensity(): Float
    fun widthPixels(): Int
    fun heightPixels(): Int
    fun xDpi(): Float
    fun yDpi(): Float

}