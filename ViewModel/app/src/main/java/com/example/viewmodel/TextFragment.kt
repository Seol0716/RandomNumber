package com.example.viewmodel

import android.app.FragmentBreadCrumbs
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.FragmentTextBinding


class TextFragment : Fragment() {

    private lateinit var binding : FragmentTextBinding
    var countValue = 0

     private lateinit var viewModel: MainViewModel


    override fun onAttach(context: Context) {
        super.onAttach(context)
       // Log.d("TextFragment","onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Log.d("TextFragment","onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("TextFragment","onCreateView")

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_text,container,false)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.plus.setOnClickListener {
            viewModel.plus()
            binding.count.text = viewModel.getCount().toString()
           countValue++
           binding.count.text = countValue.toString()
        }

        binding.minus.setOnClickListener {

            viewModel.minus()
            binding.count.text = viewModel.getCount().toString()
            countValue--
          binding.count.text = countValue.toString()
        }

        return binding.root

    }

    override fun onResume() {
        super.onResume()
        Log.d("TextFragment","onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TextFragment","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TextFragment","onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TextFragment","onDestroyView")
    }
}

