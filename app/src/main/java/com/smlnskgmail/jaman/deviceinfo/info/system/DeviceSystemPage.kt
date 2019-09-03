package com.smlnskgmail.jaman.deviceinfo.info.system

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem
import com.smlnskgmail.jaman.deviceinfo.info.system.realization.DeviceSystemInfo
import com.smlnskgmail.jaman.deviceinfo.info.system.realization.infoitems.*
import com.smlnskgmail.jaman.deviceinfo.info.system.structure.SystemInfo

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

    override fun pageTitle() = getString(R.string.page_title_system)

}