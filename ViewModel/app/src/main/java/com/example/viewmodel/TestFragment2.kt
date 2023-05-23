package com.example.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.example.viewmodel.databinding.Fragmenttext2Binding


class TestFragment2 : Fragment() {

    private lateinit var binding : Fragmenttext2Binding
    private val viewModel : MainViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragmenttext2,container,false)
        binding.fragmentText.text = viewModel.getCount().toString()
        
        return binding.root
    }
    }
