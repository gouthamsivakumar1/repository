package com.example.employee.view.viewHolder

import com.example.employee.BaseViewHolderItem
import com.example.employee.databinding.RepositoryListItemBinding
import com.example.employee.model.RepositoryDetailsResponse


class RepositoryViewHolder(private val mBinding: RepositoryListItemBinding) :
    BaseViewHolderItem<RepositoryDetailsResponse>(mBinding.root) {
    override fun onCreated() {
    }

    override fun onBind(data: RepositoryDetailsResponse) {
        mBinding.data?.setData(data)
    }
}

