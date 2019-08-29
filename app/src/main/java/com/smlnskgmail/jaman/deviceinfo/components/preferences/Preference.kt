package com.smlnskgmail.jaman.deviceinfo.components.preferences

interface Preference<T> {

    fun save(value: T)
    fun value(): T

}