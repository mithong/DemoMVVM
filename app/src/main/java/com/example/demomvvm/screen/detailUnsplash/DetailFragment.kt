package com.example.demomvvm.screen.detailUnsplash

import android.view.LayoutInflater
import androidx.core.os.bundleOf
import com.example.demomvvm.data.model.Unsplash
import com.example.demomvvm.databinding.FragmentDetailUnsplashBinding
import com.example.demomvvm.utils.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailFragment : BaseFragment<FragmentDetailUnsplashBinding,DetailViewModel>(){

    override val viewModel: DetailViewModel by viewModel()

    override fun inflateViewBinding(inflater: LayoutInflater) = FragmentDetailUnsplashBinding.inflate(inflater)

    override fun setUpView() {
        viewBinding.apply {
            lifecycleOwner = this@DetailFragment
            detailViewModel = viewModel
        }
    }

    override fun setupObserver() {
        arguments?.run {
            val data: Unsplash? = getParcelable(ARGUMENT_UNSPLASH)
            viewModel.setUnsplash(data)
        }
    }

    companion object {
        const val ARGUMENT_UNSPLASH = "ARGUMENT_UNSPLASH"

        fun newInstance(unsplash: Unsplash?) = DetailFragment().apply {
            arguments = bundleOf(ARGUMENT_UNSPLASH to unsplash)
        }
    }
}
