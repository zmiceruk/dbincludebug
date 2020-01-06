package com.example.dbbugapplication

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.dbbugapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewBinding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        viewBinding.optionBookingName.title.text = "Title from Code"
        viewBinding.optionBookingName.editText.hint = "Hint from Code"

        setContentView(viewBinding.root)
    }
}
