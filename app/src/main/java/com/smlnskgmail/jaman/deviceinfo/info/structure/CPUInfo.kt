package com.smlnskgmail.jaman.deviceinfo.info.structure

interface CPUInfo {

    fun cores(): Int
    fun minimumFreq(): Int
    fun maximumFreq(): Int

}