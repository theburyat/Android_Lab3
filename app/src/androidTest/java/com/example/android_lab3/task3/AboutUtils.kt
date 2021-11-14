package com.example.android_lab3.task3

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android_lab3.R

private fun openAboutViaBottomNav() {
    onView(withId(R.id.nav_view)).perform(click())
}

fun openAbout() = openAboutViaBottomNav()