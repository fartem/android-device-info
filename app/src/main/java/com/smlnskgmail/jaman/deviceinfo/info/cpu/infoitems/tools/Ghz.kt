package com.smlnskgmail.jaman.deviceinfo.info.cpu.infoitems.tools

class Ghz(private val mgz: Int) {

    fun value() = mgz / 1000000f

}