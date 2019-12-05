package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.cpu

class Ghz(private val mgz: Int) {

    fun value() = mgz / 1000000f

}