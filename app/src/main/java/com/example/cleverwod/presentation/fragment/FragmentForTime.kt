package com.example.cleverwod.presentation.fragment

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cleverwod.R
import com.example.cleverwod.presentation.viewmodel.FragmentForTimeViewModel

class FragmentForTime : Fragment() {

    companion object {
        fun newInstance() = FragmentForTime()
    }

    private val viewModel: FragmentForTimeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_fragment_for_time, container, false)
    }
}