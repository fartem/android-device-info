package com.smlnskgmail.jaman.deviceinfo.info.cpu

interface CPUInfo {

    fun cores(): Int
    fun minimumFreq(): Int
    fun maximumFreq(): Int

}