package com.smlnskgmail.jaman.deviceinfo.info.jvm

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.jvm.realization.DeviceJVMInfo
import com.smlnskgmail.jaman.deviceinfo.info.jvm.realization.infoitems.JVMNameInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.jvm.structure.JVMInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem
import java.util.*

class DeviceJVMPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val jvmInfo: JVMInfo = DeviceJVMInfo(context!!)
        return Collections.singletonList(JVMNameInfoItem(context!!, jvmInfo))
    }

    override fun pageTitleResId() = R.string.page_title_jvm

}