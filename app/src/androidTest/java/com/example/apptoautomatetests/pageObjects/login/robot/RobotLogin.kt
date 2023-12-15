package com.example.apptoautomatetests.pageObjects.login.robot

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.apptoautomatetests.R
import com.example.apptoautomatetests.pageObjects.login.constants.ConstantsLogin.APP_TITLE
import com.example.apptoautomatetests.pageObjects.login.constants.ConstantsLogin.LOGGED_TEXT
import com.example.apptoautomatetests.pageObjects.login.constants.ConstantsLogin.NAME
import com.example.apptoautomatetests.pageObjects.login.constants.ConstantsLogin.PASSWORD
import com.example.apptoautomatetests.pageObjects.login.constants.ConstantsLogin.PREVIOUS_BUTTON

class RobotLogin {

    companion object {
        private val FIELD_NAME = R.id.field_name
        private val FIELD_PASSWORD = R.id.field_password
        private val BUTTON_LOGIN = R.id.button_login
    }

    fun validateTitleOnScreen() {
        onView(withText(APP_TITLE)).check(matches(isDisplayed()))
    }

    fun insertName() {
        onView(withId(FIELD_NAME)).perform(typeText(NAME))
    }

    fun closeKeyboard() {
        closeSoftKeyboard()
    }

    fun insertPassword() {
        onView(withId(FIELD_PASSWORD)).perform(typeText(PASSWORD))
    }

    fun clickLoginButton() {
        onView(withId(BUTTON_LOGIN)).perform(click())
    }

    fun validateLoginMessage() {
        onView(withText(LOGGED_TEXT)).check(matches(isDisplayed()))
    }

    fun clickOnPreviousButton() {
        onView(withText(PREVIOUS_BUTTON)).perform(click())
    }


}

