package com.example.myappmanager.ui.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.example.myappmanager.R
import com.example.myappmanager.data.TaskModel
import com.example.myappmanager.databinding.FragmentTaskBinding
import com.example.myappmanager.ui.home.HomeFragment


class TaskFragment : Fragment() {

    private lateinit var binding: FragmentTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTaskBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnStart.setOnClickListener {
            val task = TaskModel(
                title = binding.etTitle.text.toString(),
                description = binding.etDescription.text.toString()

            )
            setFragmentResult(
                HomeFragment.Task, bundleOf("key_task" to task)
            )
            findNavController().navigateUp()
        }
    }
}