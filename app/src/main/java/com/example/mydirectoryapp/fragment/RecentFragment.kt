package com.example.mydirectoryapp.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mydirectoryapp.R

class RecentFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        Log.d("testlog", "recent oncreateview")
        return inflater.inflate(R.layout.fragment_recent, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("testlog", "Recent destroyed")

    }
}