package com.example.cs501_midterm_q2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.cs501_midterm_q2.ui.theme.Cs501midtermq2Theme
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Cs501midtermq2Theme {

                    CounterScreen()
            }
        }
    }
}

class CounterViewModel : ViewModel() {
    var count by mutableStateOf(0)
        private set
    fun increment() {
        count++
    }
    fun reset() {
        count = 0
    }
}


//@Composable
//fun CounterScreen(counterViewModel: CounterViewModel = viewModel()) {
//    var count by remember { mutableStateOf(0) }
//    Column {
//        Text("Count: ${counterViewModel.count}")
//        Button(onClick = { counterViewModel.increment() }) {
//            Text("Increment")
//        }
//    }
//}

@Composable
fun CounterScreen(counterViewModel: CounterViewModel = viewModel()) {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Count: ${counterViewModel.count}")

        Button(onClick = { counterViewModel.increment() }) {
            Text("Increment")
        }
    }
}