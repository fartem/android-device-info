package com.smlnskgmail.jaman.deviceinfo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pager.ViewPager2WithTabs
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.battery.DeviceBatteryPage
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.cpu.DeviceCPUPage
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.display.DeviceDisplayPage
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.gpu.DeviceGPUPage
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.gpu.renderer.DeviceGPUActivity
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.gpu.renderer.GPURequestCode
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.jvm.DeviceJVMPage
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.ram.DeviceRAMPage
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.system.DeviceSystemPage
import com.smlnskgmail.jaman.deviceinfo.tools.preferences.common.FirstLaunchPreferenceUnit
import com.smlnskgmail.jaman.deviceinfo.tools.preferences.types.BooleanPreference
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

    private fun isFirstLaunch() = BooleanPreference(this, FirstLaunchPreferenceUnit()).value()

    private fun firstLaunch() {
        saveGPUInfo()
    }

    private fun saveGPUInfo() {
        startActivityForResult(Intent(this, DeviceGPUActivity::class.java),
            GPURequestCode().requestCode())
    }

    private fun loadInfoPages() {
        ViewPager2WithTabs(
            info_pages,
            info_tabs,
            this,
            pages()
        ).attach()
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
            BooleanPreference(this, FirstLaunchPreferenceUnit()).save(false)
            loadInfoPages()
        }
    }

}
