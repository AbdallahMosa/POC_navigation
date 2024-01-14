package com.example.presentation.mailbox

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun mailBoxScreen(){
    
    Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Text(text = "Welcome From mailbox")
        }
    }

 
}

@Preview(showBackground = true)
@Composable
fun previewMailBox(){
    mailBoxScreen()
}