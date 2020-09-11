package com.begicim.androidexercises.hiltdemo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.begicim.androidexercises.R
import com.begicim.androidexercises.hiltdemo.model.ResultData
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val repositoriesList = mainViewModel.getRepositoriesList()

        repositoriesList.observe(viewLifecycleOwner, Observer { resultData ->
            when (resultData) {
                is ResultData.Loading -> {

                }
                is ResultData.Success -> {
                    val githubDataModel = resultData.data
                }
                is ResultData.Failed -> {

                }
                is ResultData.Exception -> {

                }
            }
        })

    }
}