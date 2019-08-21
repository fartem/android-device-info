package com.smlnskgmail.jaman.deviceinfo.preferences

interface PreferenceConfiguration<T> {

    fun key(): String
    fun defaultValue(): T

}