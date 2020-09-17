package com.begicim.androidexercises.hiltdemo.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.begicim.androidexercises.R
import com.begicim.androidexercises.hiltdemo.di.NetworkModule
import com.begicim.androidexercises.hiltdemo.model.ResultData
import dagger.hilt.android.AndroidEntryPoint

//Reference from this website : https://www.youtube.com/playlist?list=PLAVsCyDh6fYfbPlB_ouJTcJIKNSDxij2-
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainFragment = MainFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, mainFragment)
            .commit()
    }
}