package com.smlnskgmail.jaman.deviceinfo.info.cpu

interface CPU {

    fun cores(): Int
    fun minimumFreq(): Int
    fun maximumFreq(): Int

}