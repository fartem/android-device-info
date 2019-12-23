package com.smlnskgmail.jaman.deviceinfo.logic.preferences

interface Preference<T> {

    fun save(value: T)
    fun value(): T

}
