package com.smlnskgmail.jaman.deviceinfo.info.support.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.smlnskgmail.jaman.deviceinfo.R

class InfoAdapter(private val infoItems: List<InfoItem>) : RecyclerView.Adapter<InfoHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = InfoHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_info, parent, false))

    override fun onBindViewHolder(holder: InfoHolder, position: Int) {
        holder.bind(infoItems[position])
    }

    override fun getItemCount() = infoItems.size

}