package com.smlnskgmail.jaman.deviceinfo.info.components.system.realization.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem
import com.smlnskgmail.jaman.deviceinfo.info.components.system.structure.SystemInfo

class ReleaseVersionInfoItem(private val context: Context, private val systemInfo: SystemInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_system_release_version)

    override fun body() = systemInfo.releaseVersion()

}