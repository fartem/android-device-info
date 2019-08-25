package com.smlnskgmail.jaman.deviceinfo.info.jvm.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.jvm.JVM
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class JVMNameInfoItem(private val context: Context, private val jvm: JVM) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_jvm_name)

    override fun body() = jvm.jvmName()

}