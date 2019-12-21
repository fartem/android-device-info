package com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pager.Page2
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.recycler.InfoAdapter
import com.smlnskgmail.jaman.deviceinfo.realizations.infopages.pages.recycler.InfoItem
import kotlinx.android.synthetic.main.fragment_list.*

abstract class BaseListInfoPage : Page2() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        info_list.adapter = InfoAdapter(infoItems())
    }

    abstract fun infoItems(): List<InfoItem>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View = inflater.inflate(R.layout.fragment_list, container, false)

}
