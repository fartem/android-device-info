package com.smlnskgmail.jaman.deviceinfo.navigation.infopages.pages

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.implementation.system.DeviceSystemInfo
import com.smlnskgmail.jaman.deviceinfo.info.implementation.system.infoitems.*
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class DeviceSystemPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val systemInfo = DeviceSystemInfo(context!!)

        return listOf(
            ApiLevelInfoItem(context!!, systemInfo),
            ArchInfoItem(context!!, systemInfo),
            BoardInfoItem(context!!, systemInfo),
            BootloaderInfoItem(context!!, systemInfo),
            BrandInfoItem(context!!, systemInfo),
            CodeNameInfoItem(context!!, systemInfo),
            DateInfoItem(context!!, systemInfo),
            FingerprintInfoItem(context!!, systemInfo),
            HardwareInfoItem(context!!, systemInfo),
            HostInfoItem(context!!, systemInfo),
            KernelVersionInfoItem(context!!, systemInfo),
            ManufacturerInfoItem(context!!, systemInfo),
            ModelInfoItem(context!!, systemInfo),
            ProductInfoItem(context!!, systemInfo),
            ReleaseVersionInfoItem(context!!, systemInfo),
            TypeInfoItem(context!!, systemInfo),
            UserInfoItem(context!!, systemInfo)
        )
    }

    override fun pageTitle() = getString(R.string.page_title_system)

}