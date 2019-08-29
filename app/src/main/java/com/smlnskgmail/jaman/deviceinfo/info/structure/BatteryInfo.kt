package com.smlnskgmail.jaman.deviceinfo.info.structure

interface BatteryInfo {

    fun health(): String
    fun pluggedStatus(): String
    fun actionStatus(): String

}