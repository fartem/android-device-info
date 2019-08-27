package com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoAdapter
import com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list.InfoItem
import kotlinx.android.synthetic.main.fragment_list.*

abstract class BaseListInfoFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        info_list.adapter =
            InfoAdapter(infoItems())
    }

    abstract fun infoItems(): List<InfoItem>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)
            = inflater.inflate(R.layout.fragment_list, container, false)

}