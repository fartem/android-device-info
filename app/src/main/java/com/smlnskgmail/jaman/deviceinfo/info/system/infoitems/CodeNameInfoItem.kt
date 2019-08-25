package com.smlnskgmail.jaman.deviceinfo.info.system.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.info.system.System
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class CodeNameInfoItem(private val context: Context, private val system: System) : InfoItem {

    override fun title() = "Code Name"

    override fun body() = system.codeName()

}