package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.jvm

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.jvm.recycler.JVMNameInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.JVMInfo
import java.util.*

class DeviceJVMPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val jvmInfo: JVMInfo = DeviceJVMInfo(context!!)
        return Collections.singletonList(
            JVMNameInfoItem(
                context!!,
                jvmInfo
            )
        )
    }

    override fun pageTitleResId() = R.string.page_title_jvm

}
