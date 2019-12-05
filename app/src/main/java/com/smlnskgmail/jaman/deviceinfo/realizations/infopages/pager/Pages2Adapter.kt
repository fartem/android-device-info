package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class Pages2Adapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val pages: List<Fragment>
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun createFragment(position: Int) = pages[position]

    override fun getItemCount() = pages.size

}