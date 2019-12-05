package com.smlnskgmail.jaman.deviceinfo.api27.infopages.pixel.info

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.smlnskgmail.jaman.deviceinfo.MainActivity
import org.junit.Rule

abstract class BasePixelApi27InfoTest {

    @JvmField
    @Rule
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    val context: Context = InstrumentationRegistry.getInstrumentation().targetContext

}