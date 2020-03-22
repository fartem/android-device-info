package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.system

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.SystemInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.system.recycler.*

class DeviceSystemPage : BaseListInfoPage() {

    override fun infoItems(): MutableList<InfoItem> {
        val systemInfo: SystemInfo = DeviceSystemInfo(context!!)
        return mutableListOf(
            ApiLevelInfoItem(
                context!!,
                systemInfo
            ),
            ArchInfoItem(
                context!!,
                systemInfo
            ),
            BoardInfoItem(
                context!!,
                systemInfo
            ),
            BootloaderInfoItem(
                context!!,
                systemInfo
            ),
            BrandInfoItem(
                context!!,
                systemInfo
            ),
            CodeNameInfoItem(
                context!!,
                systemInfo
            ),
            DateInfoItem(
                context!!,
                systemInfo
            ),
            FingerprintInfoItem(
                context!!,
                systemInfo
            ),
            HardwareInfoItem(
                context!!,
                systemInfo
            ),
            HostInfoItem(
                context!!,
                systemInfo
            ),
            KernelVersionInfoItem(
                context!!,
                systemInfo
            ),
            ManufacturerInfoItem(
                context!!,
                systemInfo
            ),
            ModelInfoItem(
                context!!,
                systemInfo
            ),
            ProductInfoItem(
                context!!,
                systemInfo
            ),
            ReleaseVersionInfoItem(
                context!!,
                systemInfo
            ),
            TypeInfoItem(
                context!!,
                systemInfo
            ),
            UserInfoItem(
                context!!,
                systemInfo
            )
        )
    }

    override fun pageTitleResId() = R.string.page_title_system

}
