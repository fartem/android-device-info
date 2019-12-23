package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.cpu

class Ghz(private val mgz: Int) {

    companion object {

        private const val divider = 1_000_000f

    }

    fun value() = mgz / divider

}
