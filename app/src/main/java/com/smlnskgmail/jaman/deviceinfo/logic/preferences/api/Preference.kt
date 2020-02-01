package com.smlnskgmail.jaman.deviceinfo.logic.preferences.api

interface Preference<T> {

    fun save(value: T)
    fun value(): T

}
