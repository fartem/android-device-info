package com.smlnskgmail.jaman.deviceinfo.logic.info

interface CPUInfo {

    fun cores(): Int
    fun minimumFreq(): Int
    fun maximumFreq(): Int

}
