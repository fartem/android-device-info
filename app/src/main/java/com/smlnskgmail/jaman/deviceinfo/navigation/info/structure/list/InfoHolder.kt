package com.smlnskgmail.jaman.deviceinfo.navigation.info.structure.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_info.view.*

class InfoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(infoItem: InfoItem) {
        itemView.info_title.text = infoItem.title()
        itemView.info_value.text = infoItem.body()
    }

}