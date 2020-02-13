package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu.recycler.GPUModelInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu.recycler.GPUVendorInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.GPUIInfo

class DeviceGPUPage : BaseListInfoPage() {

    override fun infoItems(): MutableList<InfoItem> {
        val gpuInfo: GPUIInfo = DeviceGPUIInfo(context!!)
        return mutableListOf(
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
