package com.android.teavscoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.android.teavscoffee.databinding.FragmentFinishBinding

class FinishFragment : Fragment() {
    private lateinit var dataBinding: FragmentFinishBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title = "Selesai..."
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_finish, container, false)
        dataBinding.apply {
            hasil.text = arguments?.let {
                FinishFragmentArgs.fromBundle(it)
            }?.result
            return root
        }
    }

}
