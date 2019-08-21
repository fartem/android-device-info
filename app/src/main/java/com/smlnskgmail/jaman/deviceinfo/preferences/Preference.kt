package com.smlnskgmail.jaman.deviceinfo.preferences

interface Preference<T> {

    fun save(value: T)
    fun value(): T

}