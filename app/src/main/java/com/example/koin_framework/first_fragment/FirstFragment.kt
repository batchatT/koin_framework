package com.example.koin_framework.first_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.koin_framework.R
import com.example.koin_framework.databinding.FragmentFirstBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class FirstFragment : Fragment() {

    private val binding: FragmentFirstBinding by lazy {
        FragmentFirstBinding.inflate(layoutInflater)
    }

    private val viewModel by viewModel<FirstFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        binding.goToSecondFragmentButton.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        return binding.root
    }
}
