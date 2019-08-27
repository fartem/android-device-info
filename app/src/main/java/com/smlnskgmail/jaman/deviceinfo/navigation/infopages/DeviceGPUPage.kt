package com.smlnskgmail.jaman.deviceinfo.navigation.infopages

import com.smlnskgmail.jaman.deviceinfo.info.gpu.DeviceGPUIInfo
import com.smlnskgmail.jaman.deviceinfo.info.gpu.infoitems.GPUModelInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.gpu.infoitems.GPUVendorInfoItem
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem

class DeviceGPUPage : BaseListInfoPage() {

    override fun infoItems(): List<InfoItem> {
        val gpuInfo = DeviceGPUIInfo(context!!)

        return listOf(
            GPUModelInfoItem(context!!, gpuInfo),
            GPUVendorInfoItem(context!!, gpuInfo)
        )
    }

    override fun pageTitle() = "GPU"

}