package com.begicim.androidexercises.hiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.begicim.androidexercises.R
import com.begicim.androidexercises.hiltdemo.di.NetworkModule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}