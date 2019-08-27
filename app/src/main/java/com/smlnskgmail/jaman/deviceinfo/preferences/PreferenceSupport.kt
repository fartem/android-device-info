package com.smlnskgmail.jaman.deviceinfo.preferences

interface PreferenceSupport<T> {

    fun key(): String
    fun defaultValue(): T

}