package com.smlnskgmail.jaman.deviceinfo.utils

import android.content.ClipboardManager
import android.content.Context.CLIPBOARD_SERVICE
import androidx.test.annotation.UiThreadTest
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.smlnskgmail.jaman.deviceinfo.MainActivity
import com.smlnskgmail.jaman.deviceinfo.support.clipboard.ClipboardText
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ClipboardTextTest {

    private val context = InstrumentationRegistry.getInstrumentation().targetContext

    @UiThreadTest
    @Test
    fun clipboardTest() {
        val testText = "Some text"

        val clipboardManager = context.getSystemService(
            CLIPBOARD_SERVICE
        ) as ClipboardManager

        ClipboardText(
            context,
            testText
        ).copy()

        assertEquals(
            testText,
            clipboardManager.primaryClip!!.getItemAt(0).text
        )
    }

}
