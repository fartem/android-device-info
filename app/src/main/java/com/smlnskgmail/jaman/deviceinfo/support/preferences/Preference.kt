package com.smlnskgmail.jaman.deviceinfo.support.preferences

interface Preference<T> {

    fun save(value: T)
    fun value(): T

}