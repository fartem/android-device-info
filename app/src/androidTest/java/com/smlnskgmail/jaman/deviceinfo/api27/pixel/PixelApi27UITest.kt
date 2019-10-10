package com.smlnskgmail.jaman.deviceinfo.api27.pixel

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.smlnskgmail.jaman.deviceinfo.R
import com.smlnskgmail.jaman.deviceinfo.navigation.MainActivity
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class PixelApi27UITest {

    @JvmField
    @Rule
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun runTest() {
        val pagesCount = activityTestRule.activity.pages().size
        assertEquals(pagesCount, 7)

        (0..pagesCount).forEach { _ -> swipeToLeft() }
    }

    private fun swipeToLeft() {
        onView(withId(R.id.info_pages)).perform(swipeLeft())
    }

}