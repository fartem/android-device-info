package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.jvm.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.JVMInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem

class JVMNameInfoItem(
    private val context: Context,
    private val jvmInfo: JVMInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_jvm_name)

    override fun body() = jvmInfo.jvmName()

}
