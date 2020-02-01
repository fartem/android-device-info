package com.smlnskgmail.jaman.deviceinfo.logic.info.api

interface BatteryInfo {

    fun health(): String
    fun pluggedStatus(): String
    fun actionStatus(): String

}
