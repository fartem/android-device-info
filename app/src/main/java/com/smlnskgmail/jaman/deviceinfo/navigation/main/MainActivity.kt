package com.smlnskgmail.jaman.deviceinfo.navigation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.navigation.info.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        info_pages.adapter = InfoPagesAdapter(supportFragmentManager, lifecycle, pages())
    }

    private fun pages() = listOf(
        DeviceSystemFragment(),
//        DeviceCPUFragment(),
//        DeviceGPUFragment(),
        DeviceJVMFragment(),
        DeviceRAMFragment(),
        DeviceBatteryFragment(),
        DeviceDisplayFragment()
    )

}
