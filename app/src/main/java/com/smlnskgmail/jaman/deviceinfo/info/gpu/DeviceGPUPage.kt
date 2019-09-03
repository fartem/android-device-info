package com.smlnskgmail.jaman.deviceinfo.info.gpu

import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.gpu.realization.DeviceGPUIInfo
import com.smlnskgmail.jaman.deviceinfo.info.gpu.realization.infoitems.GPUModelInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.gpu.realization.infoitems.GPUVendorInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.gpu.structure.GPUIInfo
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.info.support.ui.list.InfoItem

class DeviceGPUPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val gpuInfo: GPUIInfo = DeviceGPUIInfo(context!!)
        return listOf(
            GPUModelInfoItem(context!!, gpuInfo),
            GPUVendorInfoItem(context!!, gpuInfo)
        )
    }

    override fun pageTitle() = getString(R.string.page_title_gpu)

}