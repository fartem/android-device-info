package com.smlnskgmail.jaman.deviceinfo.info.ram

interface RAM {

    fun loadState()
    fun totalRAM(): Long
    fun availableRAM(): Long

}