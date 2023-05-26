package com.devedroy.moderntodolist.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TodoItem() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column() {
            Text(text = "Title")
            Text(text = "Description")
        }
        Checkbox(checked = true, onCheckedChange = {})
    }
}

@Preview(showBackground = true)
@Composable
fun TodoItemPreview() {
    TodoItem()
}