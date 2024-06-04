package com.example.textuitest

import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTextInput
import com.example.textuitest.ui.InputScreen
import org.junit.Rule
import org.junit.Test

class TextFieldTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testTextFieldInput() {
        // テストするテキスト
        val testText = "Tokyo"

        composeTestRule.activityRule.scenario.onActivity { activity ->
            activity.setContent {
                MaterialTheme {
                    InputScreen()
                }
            }
        }

        // TextFieldにテキストを入力
        composeTestRule.onNodeWithTag("textField")
            .performTextInput(testText)

        // TextFieldの値が更新されたことを確認
        composeTestRule.onNodeWithTag("textField")
            .assert(hasText(testText))
    }
}