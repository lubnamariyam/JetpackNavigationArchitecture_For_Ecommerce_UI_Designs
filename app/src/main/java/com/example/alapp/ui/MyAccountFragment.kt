package com.example.alapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.alapp.R
import kotlinx.android.synthetic.main.fragment_my_account.*

class MyAccountFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initbutton()
    }

    fun initbutton(){
        cldefaultaddress.setOnClickListener {
            findNavController().navigate(R.id.action_myAccountFragment_to_myAddressFragment)
        }
        cl_myorders.setOnClickListener {
            findNavController().navigate(R.id.action_myAccountFragment_to_myOrdersFragment)
        }
    }
}