package com.example.task1

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.task1.ui.theme.Task1Theme

class MainActivity : ComponentActivity() {
    val num = (Math.floor(Math.random()*100) + 1).toInt()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun task(view: View){

        var txt1: TextView = findViewById(R.id.text1)
        var txt: EditText = findViewById(R.id.txt1)
        var mine = txt.editableText.toString().toInt()

        if(mine > num){
            txt1.setText("Too HIgh")
        }else if(mine < num){
            txt1.setText("Too Low")
        }else{
            txt1.setText("Horrah! You have Won")
            return
        }

    }
}

