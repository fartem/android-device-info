package com.smlnskgmail.jaman.deviceinfo.logic.preferences.api

interface PreferenceValue<T> {

    fun key(): String
    fun defaultValue(): T

}
