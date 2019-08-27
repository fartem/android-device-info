package com.smlnskgmail.jaman.deviceinfo.info.cpu

interface CPUInfo {

    fun cores(): Int
    fun minimumFreq(): Float
    fun maximumFreq(): Float

}