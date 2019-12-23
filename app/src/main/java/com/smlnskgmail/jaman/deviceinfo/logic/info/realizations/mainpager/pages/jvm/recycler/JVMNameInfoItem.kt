package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.jvm.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.JVMInfo

class JVMNameInfoItem(
    private val context: Context,
    private val jvmInfo: JVMInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_jvm_name)

    override fun body() = jvmInfo.jvmName()

}
