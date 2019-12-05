package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.system.recycler

import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.sctructure.SystemInfo

class KernelVersionInfoItem(private val context: Context, private val systemInfo: SystemInfo) : InfoItem {

    override fun title() = context.getString(R.string.item_info_title_system_kernel_version)

    override fun body() = systemInfo.kernelVersion()

}