package com.example.employee.view.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.employee.BaseRecyclerAdapter
import com.example.employee.databinding.RepositoryListItemBinding
import com.example.employee.model.RepositoryDetailsResponse
import com.example.employee.view.viewHolder.RepositoryViewHolder
import com.example.employee.viewObserver.RepositoryItemViewObserver

class RepositoryAdapter(): BaseRecyclerAdapter<RepositoryDetailsResponse, RepositoryViewHolder>(){


    override fun createView(
        inflater: LayoutInflater,
        container: ViewGroup,
        viewType: Int
    ): RepositoryViewHolder {
        val binding = RepositoryListItemBinding.inflate(inflater, container, false)
        binding.data = RepositoryItemViewObserver()
        return RepositoryViewHolder(binding)
    }

}