package com.example.apptoautomatetests

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var mActivityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testLogin() {
        onView(withText("App to Automate Tests")).check(matches(isDisplayed()))
        onView(withId(R.id.field_name)).perform(typeText("lucasbrito"))
        closeSoftKeyboard()
        onView(withId(R.id.field_password)).perform(typeText("123456"))
        closeSoftKeyboard()
        onView(withId(R.id.button_login)).perform(click())
        onView(withText("Logged in successfully")).check(matches(isDisplayed()))
        onView(withText("Previous")).perform(click())
        onView(withText("App to Automate Tests")).check(matches(isDisplayed()))
    }
}