package com.begicim.androidexercises.hiltdemo.ui.main.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.begicim.androidexercises.hiltdemo.model.GithubDataModelItem
import kotlinx.android.synthetic.main.list_item_repositories.view.*

class RepositoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    fun bind(item: GithubDataModelItem?) {
        itemView.text_view_repo_name.text = item?.name
        itemView.text_view_repo_description.text = item?.description
    }
}