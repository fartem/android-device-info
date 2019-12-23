package com.smlnskgmail.jaman.deviceinfo.logic.info

interface BatteryInfo {

    fun health(): String
    fun pluggedStatus(): String
    fun actionStatus(): String

}
