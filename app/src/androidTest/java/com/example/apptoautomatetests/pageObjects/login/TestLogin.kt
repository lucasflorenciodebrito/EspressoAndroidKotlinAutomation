package com.example.apptoautomatetests.pageObjects.login

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.apptoautomatetests.MainActivity
import com.example.apptoautomatetests.pageObjects.login.robot.RobotLogin
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestLogin {

    private val robot = RobotLogin();

    @get:Rule
    var mActivityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testLogin() {
        robot.validateTitleOnScreen()
        robot.insertName()
        robot.closeKeyboard()
        robot.insertPassword()
        robot.closeKeyboard()
        robot.clickLoginButton()
        robot.validateLoginMessage()
        robot.clickOnPreviousButton()
        robot.validateTitleOnScreen()
    }

}