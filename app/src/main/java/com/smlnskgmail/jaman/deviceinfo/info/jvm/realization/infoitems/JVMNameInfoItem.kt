package com.smlnskgmail.jaman.deviceinfo.info.jvm.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.jvm.structure.JVMInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem

class JVMNameInfoItem(private val context: Context, private val jvmInfo: JVMInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_jvm_name)

    override fun body() = jvmInfo.jvmName()

}