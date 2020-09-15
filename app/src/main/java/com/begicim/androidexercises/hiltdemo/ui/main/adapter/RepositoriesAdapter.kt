package com.begicim.androidexercises.hiltdemo.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.begicim.androidexercises.R
import com.begicim.androidexercises.hiltdemo.model.DiffUtilGithubDataModelItem
import com.begicim.androidexercises.hiltdemo.model.GithubDataModelItem

class RepositoriesAdapter : ListAdapter<GithubDataModelItem, RepositoriesViewHolder>(DiffUtilGithubDataModelItem()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoriesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_repositories,parent,false)
        return RepositoriesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RepositoriesViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}