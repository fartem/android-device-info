package com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.gpu

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.gpu.recycler.GPUModelInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.gpu.recycler.GPUVendorInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.realizations.mainpager.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.GPUIInfo

class DeviceGPUPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val gpuInfo: GPUIInfo = DeviceGPUIInfo(context!!)
        return listOf(
            GPUModelInfoItem(
                context!!,
                gpuInfo
            ),
            GPUVendorInfoItem(
                context!!,
                gpuInfo
            )
        )
    }

    override fun pageTitleResId() = R.string.page_title_gpu

}
