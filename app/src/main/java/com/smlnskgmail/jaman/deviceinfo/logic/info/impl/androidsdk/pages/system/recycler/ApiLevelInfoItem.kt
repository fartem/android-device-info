package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.system.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.SystemInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem

class ApiLevelInfoItem(
    private val context: Context,
    private val systemInfo: SystemInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_system_api_level)

    override fun body() = systemInfo.apiLevel()

}
