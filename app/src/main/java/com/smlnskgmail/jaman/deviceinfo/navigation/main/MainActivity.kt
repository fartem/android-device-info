package com.smlnskgmail.jaman.deviceinfo.navigation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.*
import com.smlnskgmail.jaman.deviceinfo.navigation.main.pages.ViewPager2WithTabs
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeUI()
    }

    private fun initializeUI() {
        ViewPager2WithTabs(info_pages, info_tabs, this, pages()).attach()
    }

    private fun pages() = listOf(
        DeviceSystemPage(),
        DeviceCPUPage(),
//        DeviceGPUPage(),
        DeviceJVMPage(),
        DeviceRAMPage(),
        DeviceBatteryPage(),
        DeviceDisplayPage()
    )

}
