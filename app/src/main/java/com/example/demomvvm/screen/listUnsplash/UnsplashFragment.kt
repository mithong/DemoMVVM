package com.example.demomvvm.screen.listUnsplash

import android.view.LayoutInflater
import androidx.lifecycle.Observer
import com.example.demomvvm.R
import com.example.demomvvm.data.model.Unsplash
import com.example.demomvvm.databinding.FragmentUnsplashBinding
import com.example.demomvvm.screen.detailUnsplash.DetailFragment
import com.example.demomvvm.screen.listUnsplash.adapter.UnsplashAdapter
import com.example.demomvvm.utils.base.BaseFragment
import com.example.demomvvm.utils.ext.addFragment
import kotlinx.android.synthetic.main.fragment_unsplash.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class UnsplashFragment : BaseFragment<FragmentUnsplashBinding, UnsplashViewModel>() {

    override val viewModel: UnsplashViewModel by viewModel()

    private val unsplashAdapter by lazy {
        UnsplashAdapter {
            showUnsplashDetail(it)
        }
    }

    private fun showUnsplashDetail(unsplash: Unsplash) {
        addFragment(R.id.layoutContainer, DetailFragment.newInstance(unsplash))
    }

    override fun inflateViewBinding(inflater: LayoutInflater) =
        FragmentUnsplashBinding.inflate(inflater)

    override fun setUpView() {
        viewBinding.apply {
            lifecycleOwner = this@UnsplashFragment
            adapter = unsplashAdapter
        }
    }

    override fun setupObserver() = with(viewModel){
        unsplash.observe(viewLifecycleOwner, Observer {
            unsplashAdapter.submitList(it)
        })
    }

    companion object {
        fun newInstance() = UnsplashFragment()
    }
}
