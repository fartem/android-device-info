package com.smlnskgmail.jaman.deviceinfo.navigation.infopages.pages

import com.smlnskgmail.jaman.deviceinfo.info.implementation.jvm.DeviceJVMInfo
import com.smlnskgmail.jaman.deviceinfo.info.implementation.jvm.infoitems.JVMNameInfoItem
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class DeviceJVMPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val jvmInfo = DeviceJVMInfo(context!!)

        return listOf(
            JVMNameInfoItem(context!!, jvmInfo)
        )
    }

    override fun pageTitle() = "JVM"

}