package com.smlnskgmail.jaman.deviceinfo.info.components.jvm

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.jvm.realization.DeviceJVMInfo
import com.smlnskgmail.jaman.deviceinfo.info.components.jvm.realization.infoitems.JVMNameInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.components.jvm.structure.JVMInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem
import java.util.*

class DeviceJVMPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val jvmInfo: JVMInfo = DeviceJVMInfo(context!!)
        return Collections.singletonList(JVMNameInfoItem(context!!, jvmInfo))
    }

    override fun pageTitleResId() = R.string.page_title_jvm

}