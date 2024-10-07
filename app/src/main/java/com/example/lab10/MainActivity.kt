package com.example.lab10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.lab10.ui.theme.Lab10Theme
import com.tecsup.lab10.view.SeriesApp
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab10Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column {
                        ScreenInicio()
                        SeriesApp()
                    }
                }
            }
        }
    }
}

@Composable
fun ScreenInicio() {
    // Puedes agregar cualquier contenido aquí
    Text(text = "Pantalla de Inicio")
}
