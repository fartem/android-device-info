package com.smlnskgmail.jaman.deviceinfo.info.battery

interface BatteryInfo {

    fun health(): String
    fun pluggedStatus(): String
    fun actionStatus(): String

}