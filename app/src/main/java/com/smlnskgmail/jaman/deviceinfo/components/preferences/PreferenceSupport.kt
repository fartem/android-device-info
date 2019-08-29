package com.smlnskgmail.jaman.deviceinfo.components.preferences

interface PreferenceSupport<T> {

    fun key(): String
    fun defaultValue(): T

}