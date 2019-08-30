package com.smlnskgmail.jaman.deviceinfo.navigation.infopages.structure.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.smlnskgmail.jaman.deviceinfo.components.app.ClipboardText
import kotlinx.android.synthetic.main.item_info.view.*

class InfoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(infoItem: InfoItem) {
        val data = infoItem.body()

        itemView.info_title.text = infoItem.title()
        itemView.info_value.text = data

        itemView.setOnLongClickListener {
            ClipboardText(itemView.context, data)
            true
        }
    }

}