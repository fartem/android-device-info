package com.smlnskgmail.jaman.deviceinfo.navigation.main.pages

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class ViewPager2WithTabs(

    private val viewPager2: ViewPager2,
    private val tabLayout: TabLayout,
    private val activity: AppCompatActivity,
    private val pages: List<Page2>

) {

    fun attach() {
        viewPager2.adapter = InfoPagesAdapter(activity.supportFragmentManager, activity.lifecycle, pages)

        val tabMediator = TabLayoutMediator(tabLayout, viewPager2, TabLayoutMediator
            .OnConfigureTabCallback { tab, position ->
                tab.text = pages[position].pageTitle()
            })
        tabMediator.attach()
    }

}