package com.smlnskgmail.jaman.deviceinfo.info.components.system

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.system.realization.DeviceSystemInfo
import com.smlnskgmail.jaman.deviceinfo.info.components.system.realization.infoitems.*
import com.smlnskgmail.jaman.deviceinfo.info.components.system.structure.SystemInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem

class DeviceSystemPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val systemInfo: SystemInfo = DeviceSystemInfo(context!!)

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

    override fun pageTitleResId() = R.string.page_title_system

}