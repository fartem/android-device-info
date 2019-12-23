package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.jvm

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.jvm.recycler.JVMNameInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.JVMInfo
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
