package com.example.koin_framework.second_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.koin_framework.databinding.FragmentSecondBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondFragment : Fragment() {

    private val binding: FragmentSecondBinding by lazy {
        FragmentSecondBinding.inflate(layoutInflater)
    }

    private val viewModel by viewModel<SecondFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }
}
