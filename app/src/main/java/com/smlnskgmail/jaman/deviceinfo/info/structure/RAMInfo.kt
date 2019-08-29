package com.smlnskgmail.jaman.deviceinfo.info.structure

interface RAMInfo {

    fun loadState()
    fun totalRAM(): Long
    fun availableRAM(): Long

}