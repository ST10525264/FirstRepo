package com.example.campsitecommander

import android.os.Build
import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.transition.AutoTransition
import androidx.annotation.RequiresApi

private val MainActivity.txtResult: Any

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.`splashscreen.xml`)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
           }
        val value = String item
        String item = 1
        String item = 2
        String item = 3

        when(btnCalculate.setOnClickListener)
        {
            if(item >= 1)
            {
                txtResult.text = "Tent"
            }
            else if(item >=2)
            {
                txtResult.text = "Marshmellows"
            }
            else(item >= 3)
            {
                txtResult.text = "Flashlight"
            }
        }
        txtResult.text = result.toString()
    }

    val item: Array<String>
        get() {
            val arrayOf = String(
                "Tent"
                "Marshmallows"
                "Flashlight"
            )
            txtResult.text = item[0]
        }
    var total = 0
    for(item in items)
    {
        total += item
    }
}