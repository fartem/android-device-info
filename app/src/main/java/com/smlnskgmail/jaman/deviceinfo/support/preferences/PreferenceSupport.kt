package com.smlnskgmail.jaman.deviceinfo.support.preferences

interface PreferenceSupport<T> {

    fun key(): String
    fun defaultValue(): T

}