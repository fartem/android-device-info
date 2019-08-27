package com.smlnskgmail.jaman.deviceinfo.info.system.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.system.SystemInfo
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class TypeInfoItem(private val context: Context, private val systemInfo: SystemInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_system_type)

    override fun body() = systemInfo.type()

}