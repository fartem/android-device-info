package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.battery

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.View
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.BatteryInfo
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.BaseListInfoPage
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.battery.recycler.BatteryActionInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.battery.recycler.BatteryHealthInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.battery.recycler.BatteryPluggedInfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem

class DeviceBatteryPage : BaseListInfoPage() {

    private var batteryInfo: BatteryInfo? = null

    private val batteryReceiver = object : BroadcastReceiver() {
        override fun onReceive(
            context: Context?,
            intent: Intent?
        ) {
            infoItemsListUpdate(
                batteryInfo()
            )
        }
    }

    override fun infoItems(): MutableList<InfoItem> {
        return batteryInfo()
    }

    private fun batteryInfo(): MutableList<InfoItem> {
        if (batteryInfo == null) {
            batteryInfo = DeviceBatteryInfo(context!!)
        }
        return mutableListOf(
            BatteryHealthInfoItem(
                context!!,
                batteryInfo!!
            ),
            BatteryActionInfoItem(
                context!!,
                batteryInfo!!
            ),
            BatteryPluggedInfoItem(
                context!!,
                batteryInfo!!
            )
        )
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        activity!!.registerReceiver(
            batteryReceiver,
            IntentFilter(
                Intent.ACTION_BATTERY_CHANGED
            )
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        activity!!.unregisterReceiver(
            batteryReceiver
        )
    }

    override fun pageTitleResId() = R.string.page_title_battery

}
