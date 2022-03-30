package com.example.geekbrains_googlepay

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(CheckoutActivity::class.java)

    @Test fun checkDetailImageIsDisplayed() {
        onView(withId(R.id.detailImage)).check(matches(isDisplayed()))
    }

    @Test fun checkDetailTitleIsDisplayed() {
        onView(withId(R.id.detailTitle)).check(matches((isDisplayed())))
    }
}