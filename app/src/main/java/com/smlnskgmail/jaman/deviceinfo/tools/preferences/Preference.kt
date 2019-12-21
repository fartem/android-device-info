package com.smlnskgmail.jaman.deviceinfo.tools.preferences

interface Preference<T> {

    fun save(value: T)
    fun value(): T

}
