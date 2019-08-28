package com.smlnskgmail.jaman.deviceinfo.navigation.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.info.gpu.components.DeviceGPUActivity
import com.smlnskgmail.jaman.deviceinfo.info.gpu.components.config.GPURequestCode
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.*
import com.smlnskgmail.jaman.deviceinfo.navigation.main.viewpager.ViewPager2WithTabs
import com.smlnskgmail.jaman.deviceinfo.preferences.common.FirstLaunchPreferenceSupport
import com.smlnskgmail.jaman.deviceinfo.preferences.types.BooleanPreference
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

    private fun pages() = listOf(
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
