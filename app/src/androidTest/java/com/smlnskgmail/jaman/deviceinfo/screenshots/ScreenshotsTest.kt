package com.smlnskgmail.jaman.deviceinfo.screenshots

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.smlnskgmail.jaman.deviceinfo.MainActivity
import com.smlnskgmail.jaman.deviceinfo.R
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import tools.fastlane.screengrab.Screengrab
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy

@RunWith(AndroidJUnit4::class)
class ScreenshotsTest {

    @JvmField
    @Rule
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setup() {
        Screengrab.setDefaultScreenshotStrategy(
            UiAutomatorScreenshotStrategy()
        )
    }

    @Test
    fun makeScreenshots() {
        Screengrab.screenshot(
            "page_system"
        )
        swipe()

        Screengrab.screenshot(
            "page_cpu"
        )
        swipe()

        Screengrab.screenshot(
            "page_gpu"
        )
        swipe()
        swipe()

        Screengrab.screenshot(
            "page_ram"
        )
        swipe()

        Screengrab.screenshot(
            "page_battery"
        )
    }

    private fun swipe() {
        onView(withId(R.id.info_pages)).perform(swipeLeft())
        Thread.sleep(3_000)
    }

}
