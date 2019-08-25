package com.smlnskgmail.jaman.deviceinfo.info.system.infoitems

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.system.System
import com.smlnskgmail.jaman.deviceinfo.list.InfoItem

class ReleaseVersionInfoItem(private val context: Context, private val system: System) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_system_release_version)

    override fun body() = system.releaseVersion()

}