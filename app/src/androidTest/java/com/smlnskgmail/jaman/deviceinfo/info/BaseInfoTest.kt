package com.smlnskgmail.jaman.deviceinfo.info

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.smlnskgmail.jaman.deviceinfo.MainActivity
import org.junit.Rule

abstract class BaseInfoTest {

    @JvmField
    @Rule
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    val context: Context = InstrumentationRegistry.getInstrumentation().targetContext

}
