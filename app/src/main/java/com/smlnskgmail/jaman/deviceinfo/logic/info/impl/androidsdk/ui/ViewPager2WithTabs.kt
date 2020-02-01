package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.ui

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewPager2WithTabs(
    private val viewPager2: ViewPager2,
    private val tabLayout: TabLayout,
    private val activity: AppCompatActivity,
    private val pages: List<Page2>
) {

    fun attach() {
        viewPager2.adapter = Pages2Adapter(
            activity.supportFragmentManager,
            activity.lifecycle,
            pages
        )
        val tabMediator = TabLayoutMediator(
            tabLayout,
            viewPager2,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                tab.text = viewPager2.context.getString(pages[position].pageTitleResId())
            }
        )
        tabMediator.attach()
    }

}
