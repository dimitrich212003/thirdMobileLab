package com.example.activity1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)

        val signInEmailField = view.findViewById<EditText>(R.id.signInEmailField)
        val signInPasswordField = view.findViewById<EditText>(R.id.signInPasswordField)
        val signInButton = view.findViewById<Button>(R.id.signInButton)

        signInButton.setOnClickListener {
            val email = signInEmailField.text.toString().trim()
            val pass = signInPasswordField.text.toString().trim()

            var isValid = true

            if (!email.contains("@") || email.isEmpty()) {
                Toast.makeText(requireContext(), "Вы ввели некорректный Email", Toast.LENGTH_SHORT).show()
                isValid = false
            }

            if (pass.length < 6 || pass.isEmpty()) {
                Toast.makeText(requireContext(), "Пароль не соответствует требованиям", Toast.LENGTH_SHORT).show()
                isValid = false
            }

            if (isValid) {
                (activity as? MainActivity)?.replaceFragment(HomeFragment.newInstance(), true)
            }
        }

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = SignInFragment()
    }
}