package com.example.android_lab3.task5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android_lab3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Fragment2: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button1: Button = view.findViewById(R.id.bnToThird)
        button1.setOnClickListener {
            findNavController().navigate(R.id.f2t3frag)
        }

        val button2: Button = view.findViewById(R.id.bnToFirst)
        button2.setOnClickListener {
            findNavController().navigate(R.id.f2t1frag)
        }
    }
}