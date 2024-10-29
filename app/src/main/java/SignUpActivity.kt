package com.example.activity1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//class SignUpActivity : BaseActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_sign_up)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.signUpActivity)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
//        val signUpEmailField = findViewById<EditText>(R.id.signUpEmailField)
//        val signUpPasswordField = findViewById<EditText>(R.id.signUpPasswordField)
//        val signUpNameField = findViewById<EditText>(R.id.signUpNameField)
//        val signUpButton : Button = findViewById(R.id.signUpButton)
//
//        signUpButton.setOnClickListener {
//            val email = signUpEmailField.text.toString().trim()
//            val pass = signUpPasswordField.text.toString().trim()
//            val name = signUpNameField.text.toString().trim()
//
//            var isValid = true
//
//            if (!email.contains("@") || email.isEmpty()) {
//                Toast.makeText(this, "Вы ввели некорректный Email", Toast.LENGTH_SHORT).show()
//                isValid = false
//            }
//
//            if (pass.length < 6 || pass.isEmpty()) {
//                Toast.makeText(this, "Пароль не соответствует требованиям", Toast.LENGTH_SHORT).show()
//                isValid = false
//            }
//
//            if (name.length < 2 || name.contains(Regex("\\d+")) || name.isEmpty()) {
//                Toast.makeText(this, "Имя не соответствует требованиям", Toast.LENGTH_SHORT).show()
//                isValid = false
//            }
//
//            if (isValid) {
//                val user = User(name, email, pass)
//                val intent = Intent(this, HomeActivity::class.java)
//                intent.putExtra("user", name)
//                startActivity(intent)
//            }
//        }
//    }
//}