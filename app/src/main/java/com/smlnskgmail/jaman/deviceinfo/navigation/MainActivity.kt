package com.smlnskgmail.jaman.deviceinfo.navigation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.components.battery.DeviceBatteryPage
import com.smlnskgmail.jaman.deviceinfo.info.components.cpu.DeviceCPUPage
import com.smlnskgmail.jaman.deviceinfo.info.components.display.DeviceDisplayPage
import com.smlnskgmail.jaman.deviceinfo.info.components.gpu.DeviceGPUPage
import com.smlnskgmail.jaman.deviceinfo.info.components.gpu.realization.components.DeviceGPUActivity
import com.smlnskgmail.jaman.deviceinfo.info.components.gpu.realization.components.config.GPURequestCode
import com.smlnskgmail.jaman.deviceinfo.info.components.jvm.DeviceJVMPage
import com.smlnskgmail.jaman.deviceinfo.info.components.ram.DeviceRAMPage
import com.smlnskgmail.jaman.deviceinfo.info.components.system.DeviceSystemPage
import com.smlnskgmail.jaman.deviceinfo.navigation.viewpager.ViewPager2WithTabs
import com.smlnskgmail.jaman.deviceinfo.support.preferences.common.FirstLaunchPreferenceSupport
import com.smlnskgmail.jaman.deviceinfo.support.preferences.types.BooleanPreference
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startApp()
    }

    private fun startApp() {
        if (isFirstLaunch()) {
            firstLaunch()
        } else {
            loadInfoPages()
        }
    }

    private fun isFirstLaunch() = BooleanPreference(this, FirstLaunchPreferenceSupport()).value()

    private fun firstLaunch() {
        saveGPUInfo()
    }

    private fun saveGPUInfo() {
        startActivityForResult(Intent(this, DeviceGPUActivity::class.java),
            GPURequestCode().requestCode())
    }

    private fun loadInfoPages() {
        ViewPager2WithTabs(info_pages, info_tabs, this, pages()).attach()
    }

    fun pages() = listOf(
        DeviceSystemPage(),
        DeviceCPUPage(),
        DeviceGPUPage(),
        DeviceJVMPage(),
        DeviceRAMPage(),
        DeviceBatteryPage(),
        DeviceDisplayPage()
    )

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == GPURequestCode().requestCode()) {
            BooleanPreference(this, FirstLaunchPreferenceSupport()).save(false)
            loadInfoPages()
        }
    }

}
