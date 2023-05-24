package com.example.livedata

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.livedata.databinding.FragmentBlank1Binding


class BlankFragment1 : Fragment() {
    private val Tag  = "BlankFragment1"
    private lateinit var binding : FragmentBlank1Binding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlank1Binding.inflate(inflater,container,false)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.countBtn1.setOnClickListener {
            viewModel.plusLiveDataValue()
        }

        viewModel.testLiveData.observe(viewLifecycleOwner, Observer {
            binding.text1.text = it.toString()
        })
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(Tag,"onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(Tag,"onDestroyView")
    }
    }
