package com.smlnskgmail.jaman.deviceinfo.support

class NullHandle<T>(private val data: T?, private val defaultResult: T) {

    fun result(): T = data ?: defaultResult

}