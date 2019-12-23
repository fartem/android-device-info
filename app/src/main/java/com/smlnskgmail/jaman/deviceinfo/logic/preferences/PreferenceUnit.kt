package com.smlnskgmail.jaman.deviceinfo.logic.preferences

interface PreferenceUnit<T> {

    fun key(): String
    fun defaultValue(): T

}
