package com.smlnskgmail.jaman.deviceinfo.logic.info

interface RAMInfo {

    fun loadState()
    fun totalRAM(): Long
    fun availableRAM(): Long

}
