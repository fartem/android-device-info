package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.battery

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.api.BatteryInfo

class DeviceBatteryInfo(
    private val context: Context
) : BatteryInfo {

    override fun health(): String {
        val status = batteryData()!!.getIntExtra(BatteryManager.EXTRA_HEALTH, 0)
        return healthStatusFromIntent(status)
    }

    private fun healthStatusFromIntent(status: Int): String {
        return when (status) {
            BatteryManager.BATTERY_HEALTH_COLD -> {
                context.getString(R.string.battery_info_health_cold)
            }
            BatteryManager.BATTERY_HEALTH_DEAD -> {
                context.getString(R.string.battery_info_health_dead)
            }
            BatteryManager.BATTERY_HEALTH_GOOD -> {
                context.getString(R.string.battery_info_health_good)
            }
            BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE -> {
                context.getString(R.string.battery_info_health_over_voltage)
            }
            BatteryManager.BATTERY_HEALTH_OVERHEAT -> {
                context.getString(R.string.battery_info_health_overheat)
            }
            BatteryManager.BATTERY_HEALTH_UNSPECIFIED_FAILURE -> {
                context.getString(R.string.battery_info_health_unspecified_failure)
            }
            else -> {
                context.getString(R.string.battery_info_common_unknown)
            }
        }
    }

    override fun pluggedStatus(): String {
        val status = batteryData()!!.getIntExtra(BatteryManager.EXTRA_PLUGGED, 0)
        return pluggedStatusFromIntent(status)
    }

    private fun pluggedStatusFromIntent(status: Int): String {
        return when (status) {
            BatteryManager.BATTERY_PLUGGED_WIRELESS -> {
                context.getString(R.string.battery_info_plugged_wireless)
            }
            BatteryManager.BATTERY_PLUGGED_USB -> {
                context.getString(R.string.battery_info_plugged_usb)
            }
            BatteryManager.BATTERY_PLUGGED_AC -> {
                context.getString(R.string.battery_info_plugged_ac)
            }
            else -> {
                context.getString(R.string.battery_info_common_unknown)
            }
        }
    }

    override fun actionStatus(): String {
        val status = batteryData()!!.getIntExtra(BatteryManager.EXTRA_STATUS, -1)
        return actionStatusFromIntent(status)
    }

    private fun actionStatusFromIntent(status: Int): String {
        return when (status) {
            BatteryManager.BATTERY_STATUS_CHARGING -> {
                context.getString(R.string.battery_info_action_charging)
            }
            BatteryManager.BATTERY_STATUS_FULL -> {
                context.getString(R.string.battery_info_action_full)
            }
            BatteryManager.BATTERY_STATUS_DISCHARGING,
            BatteryManager.BATTERY_STATUS_NOT_CHARGING -> {
                context.getString(R.string.battery_info_action_discharging)
            }
            else -> {
                context.getString(R.string.battery_info_common_unknown)
            }
        }
    }

    private fun batteryData() = context.registerReceiver(null, batteryIntent())

    private fun batteryIntent(): IntentFilter {
        val batteryIntentFilter = IntentFilter()
        batteryIntentFilter.addAction(Intent.ACTION_POWER_CONNECTED)
        batteryIntentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        batteryIntentFilter.addAction(Intent.ACTION_BATTERY_CHANGED)
        return batteryIntentFilter
    }

}
