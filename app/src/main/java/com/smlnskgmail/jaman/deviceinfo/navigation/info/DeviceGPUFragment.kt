package com.smlnskgmail.jaman.deviceinfo.navigation.info

import com.smlnskgmail.jaman.deviceinfo.info.gpu.DeviceGPUIInfo
import com.smlnskgmail.jaman.deviceinfo.info.gpu.infoitems.GPUModelInfoItem
import com.smlnskgmail.jaman.deviceinfo.info.gpu.infoitems.GPUVendorInfoItem
import com.smlnskgmail.jaman.deviceinfo.navigation.info.structure.BaseListInfoFragment
import com.smlnskgmail.jaman.deviceinfo.navigation.info.structure.list.InfoItem

class DeviceGPUFragment : BaseListInfoFragment() {

    override fun infoItems(): List<InfoItem> {
        val gpuInfo = DeviceGPUIInfo(context!!)

        return listOf(
            GPUModelInfoItem(context!!, gpuInfo),
            GPUVendorInfoItem(context!!, gpuInfo)
        )
    }

}