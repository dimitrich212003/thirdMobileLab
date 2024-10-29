package com.example.activity1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)

        val signUpEmailField = view.findViewById<EditText>(R.id.signUpEmailField)
        val signUpPasswordField = view.findViewById<EditText>(R.id.signUpPasswordField)
        val signUpNameField = view.findViewById<EditText>(R.id.signUpNameField)
        val signUpButton = view.findViewById<Button>(R.id.signUpButton)

        signUpButton.setOnClickListener {
            val email = signUpEmailField.text.toString().trim()
            val pass = signUpPasswordField.text.toString().trim()
            val name = signUpNameField.text.toString().trim()

            var isValid = true

            if (!email.contains("@") || email.isEmpty()) {
                Toast.makeText(requireContext(), "Вы ввели некорректный Email", Toast.LENGTH_SHORT).show()
                isValid = false
            }

            if (pass.length < 6 || pass.isEmpty()) {
                Toast.makeText(requireContext(), "Пароль не соответствует требованиям", Toast.LENGTH_SHORT).show()
                isValid = false
            }

            if (name.length < 2 || name.contains(Regex("\\d+")) || name.isEmpty()) {
                Toast.makeText(requireContext(), "Имя не соответствует требованиям", Toast.LENGTH_SHORT).show()
                isValid = false
            }

            if (isValid) {
                val homeFragment = HomeFragment.newInstance()
                val bundle = Bundle()
                bundle.putString("user", name)
                homeFragment.arguments = bundle
                (activity as? MainActivity)?.replaceFragment(homeFragment, true)
            }
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = SignUpFragment()
    }
}
