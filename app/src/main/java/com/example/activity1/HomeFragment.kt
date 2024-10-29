package com.example.activity1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val exitBtn = view.findViewById<Button>(R.id.exitButton)
        val homeName = view.findViewById<TextView>(R.id.homeName)

        // Получаем имя из аргументов
        val name = arguments?.getString("user")
        homeName.text = name

        exitBtn.setOnClickListener {
            (activity as? MainActivity)?.replaceFragment(OnboardFragment.newInstance(), false)
        }

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}