package com.smlnskgmail.jaman.deviceinfo.navigation.infopages

import com.smlnskgmail.jaman.deviceinfo.info.jvm.DeviceJVMInfo
import com.smlnskgmail.jaman.deviceinfo.info.jvm.infoitems.JVMNameInfoItem
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.BaseListInfoFragment
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class DeviceJVMFragment : BaseListInfoFragment() {

    override fun infoItems(): List<InfoItem> {
        val jvmInfo = DeviceJVMInfo(context!!)

        return listOf(
            JVMNameInfoItem(context!!, jvmInfo)
        )
    }

}