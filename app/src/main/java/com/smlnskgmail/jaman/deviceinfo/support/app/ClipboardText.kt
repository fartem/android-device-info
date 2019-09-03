package com.smlnskgmail.jaman.deviceinfo.support.app

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import com.smlnskgmail.jaman.deviceinfo.R

class ClipboardText(private val context: Context, private val text: String) {

    fun copy() {
        val clipboardManager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText(context.getString(R.string.app_name), text)
        clipboardManager.setPrimaryClip(clipData)
    }

}