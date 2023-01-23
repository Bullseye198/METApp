package com.metapp.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.metapp.R
import com.metapp.databinding.FragmentMainBinding
import com.metapp.dependencyInjection.ViewModelFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class MetappListFragment : DaggerFragment() {

    private lateinit var viewModel: MetappListViewModel
    private lateinit var binding: FragmentMainBinding

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MetappListViewModel::class.java)
        return binding.root
    }

}