package com.smlnskgmail.jaman.deviceinfo.sctructure

interface BatteryInfo {

    fun health(): String
    fun pluggedStatus(): String
    fun actionStatus(): String

}