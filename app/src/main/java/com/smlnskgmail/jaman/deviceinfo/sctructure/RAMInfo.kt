package com.smlnskgmail.jaman.deviceinfo.sctructure

interface RAMInfo {

    fun loadState()
    fun totalRAM(): Long
    fun availableRAM(): Long

}