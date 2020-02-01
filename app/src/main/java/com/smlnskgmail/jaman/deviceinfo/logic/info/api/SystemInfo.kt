package com.smlnskgmail.jaman.deviceinfo.logic.info.api

@SuppressWarnings("TooManyFunctions")
interface SystemInfo {

    fun model(): String
    fun product(): String
    fun brand(): String
    fun type(): String
    fun manufacturer(): String
    fun board(): String
    fun hardware(): String
    fun releaseVersion(): String
    fun apiLevel(): String
    fun user(): String
    fun host(): String
    fun fingerprint(): String
    fun bootloader(): String
    fun arch(): String
    fun kernelVersion(): String
    fun date(): String
    fun codeName(): String

}
