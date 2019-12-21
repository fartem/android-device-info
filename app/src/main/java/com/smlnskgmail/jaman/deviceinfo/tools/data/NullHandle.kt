package com.smlnskgmail.jaman.deviceinfo.tools.data

class NullHandle<T>(
    private val data: T?,
    private val defaultResult: T
) {

    fun result(): T = data ?: defaultResult

}
