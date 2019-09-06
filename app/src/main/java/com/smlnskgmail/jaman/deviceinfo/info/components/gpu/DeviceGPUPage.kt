package com.smlnskgmail.jaman.deviceinfo.info.components.gpu

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.gpu.realization.DeviceGPUIInfo
import com.smlnskgmail.jaman.deviceinfo.info.components.gpu.realization.infoitems.GPUModelInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.components.gpu.realization.infoitems.GPUVendorInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.components.gpu.structure.GPUIInfo
import com.smlnskgmail.jaman.deviceinfo.info.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.ui.list.InfoItem

class DeviceGPUPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val gpuInfo: GPUIInfo = DeviceGPUIInfo(context!!)
        return listOf(
            GPUModelInfoItem(context!!, gpuInfo),
            GPUVendorInfoItem(context!!, gpuInfo)
        )
    }

    override fun pageTitleResId() = R.string.page_title_gpu

}