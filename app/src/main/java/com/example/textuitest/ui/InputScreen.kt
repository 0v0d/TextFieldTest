package com.example.textuitest.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InputScreen(
    modifier: Modifier = Modifier,
) {
    val inputText = remember { mutableStateOf("") }

    Column(
        modifier =
        modifier
            .fillMaxSize()
            .padding(8.dp)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SearchTextField(
            query = inputText.value,
            onQueryChange = { newValue ->
                inputText.value = newValue
            },
            onSearch = {},
            modifier =
            modifier
                .fillMaxWidth()
        )
    }
}