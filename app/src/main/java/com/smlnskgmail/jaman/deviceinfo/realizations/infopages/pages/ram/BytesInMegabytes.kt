package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.ram

class BytesInMegabytes(private val bytes: Long) {

    companion object {

        private const val ONE_MEGABYTE_IN_BYTE = 1_048_576

    }

    fun result() = bytes / ONE_MEGABYTE_IN_BYTE

}
