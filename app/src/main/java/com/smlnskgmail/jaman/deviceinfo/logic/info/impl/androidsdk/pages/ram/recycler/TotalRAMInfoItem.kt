package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.ram.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.RAMInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem

class TotalRAMInfoItem(
    private val context: Context,
    private val ramInfo: RAMInfo
) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_ram_total)

    override fun body() = "${ramInfo.totalRAM()} ${context.getString(R.string.common_mb)}"

}
