package com.smlnskgmail.jaman.deviceinfo.info.ram

interface RAMInfo {

    fun loadState()
    fun totalRAM(): Long
    fun availableRAM(): Long

}