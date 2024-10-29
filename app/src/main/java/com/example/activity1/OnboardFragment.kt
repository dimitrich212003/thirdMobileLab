package com.example.activity1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class OnboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_onboard, container, false)

        // Находим кнопки
        val loginButton = view.findViewById<Button>(R.id.onboardSignInButton)
        val signInButton = view.findViewById<Button>(R.id.onboardSignUpButton)

        // Устанавливаем слушатели на кнопки
        loginButton.setOnClickListener {
            // Открываем SignInFragment
            (activity as? MainActivity)?.replaceFragment(SignInFragment.newInstance(), false)
        }

        signInButton.setOnClickListener {
            // Открываем SignUpFragment
            (activity as? MainActivity)?.replaceFragment(SignUpFragment.newInstance(), false)
        }

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = OnboardFragment()
    }
}