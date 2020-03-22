package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoAdapter
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.recycler.InfoItem
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.ui.Page2
import kotlinx.android.synthetic.main.fragment_list.*

abstract class BaseListInfoPage : Page2() {

    private val infoItems = mutableListOf<InfoItem>()

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        infoItems.clear()
        infoItems.addAll(infoItems())
        info_list.adapter = InfoAdapter(infoItems)
    }

    abstract fun infoItems(): MutableList<InfoItem>

    fun infoItemsListUpdate(
        infoItems: MutableList<InfoItem>
    ) {
        this.infoItems.clear()
        this.infoItems.addAll(infoItems)
        info_list.adapter?.notifyDataSetChanged()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View = inflater.inflate(R.layout.fragment_list, container, false)

}
