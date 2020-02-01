package com.smlnskgmail.jaman.deviceinfo.logic.info.api

interface CPUInfo {

    fun cores(): Int
    fun minimumFreq(): Int
    fun maximumFreq(): Int

}
