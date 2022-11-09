package com.example.myappmanager.ui.onBoard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myappmanager.data.Local.Pref
import com.example.myappmanager.databinding.FragmentOnBoardingBinding


class onBoardingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardingBinding
    lateinit var adapter: onBoardingAdapter
    private lateinit var pref : Pref


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pref = Pref(requireContext())
        val adapter = onBoardingAdapter()
            pref.saveBoardingShow(true)
            findNavController().navigateUp()
        init()
    }
    private fun init() {
        binding.skipped.setOnClickListener {
            findNavController().navigateUp()
        }
       binding.viewPager.adapter = adapter

        adapter = onBoardingAdapter()
        binding.viewPager.setAdapter(adapter)
        binding.dotsIndicator.attachTo(binding.viewPager)
    }
}