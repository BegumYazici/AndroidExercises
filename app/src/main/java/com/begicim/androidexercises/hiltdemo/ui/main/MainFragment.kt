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
import com.begicim.androidexercises.hiltdemo.ui.main.adapter.RepositoriesAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.main_fragment.*

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

        val repositoriesAdapter = RepositoriesAdapter()
        recyclerview_repositories.adapter = repositoriesAdapter

        val repositoriesList = mainViewModel.getRepositoriesList()

        repositoriesList.observe(viewLifecycleOwner, Observer { resultData ->
            when (resultData) {
                is ResultData.Loading -> {

                }
                is ResultData.Success -> {
                    val githubDataModel = resultData.data
                    repositoriesAdapter.submitList(githubDataModel)
                }
                is ResultData.Failed -> {

                }
                is ResultData.Exception -> {

                }
            }
        })
    }
}