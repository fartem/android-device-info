package com.smlnskgmail.jaman.deviceinfo.info.components.system.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.system.structure.SystemInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem

class CodeNameInfoItem(private val context: Context, private val systemInfo: SystemInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_system_code_name)

    override fun body() = systemInfo.codeName()

}