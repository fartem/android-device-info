package com.smlnskgmail.jaman.deviceinfo.tools.preferences

interface PreferenceUnit<T> {

    fun key(): String
    fun defaultValue(): T

}