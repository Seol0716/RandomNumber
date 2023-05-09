package com.example.viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbinding.databinding.SecLayoutBinding

class Second_Fragment : Fragment() {
    private var _binding : SecLayoutBinding ?= null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = SecLayoutBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.text.text = "이거는 플래그먼트 텍스트 입니다."
        return view
    }
}
