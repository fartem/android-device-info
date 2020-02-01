package com.smlnskgmail.jaman.deviceinfo.logic.info.api

interface RAMInfo {

    fun loadState()
    fun totalRAM(): Long
    fun availableRAM(): Long

}
