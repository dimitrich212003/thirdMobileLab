//package com.example.activity1
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
//import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class SignInActivity : BaseActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_sign_in)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.signInActivity)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
//        val signInEmailField = findViewById<EditText>(R.id.signInEmailField)
//        val signInPasswordField = findViewById<EditText>(R.id.signInPasswordField)
//        val signInButton = findViewById<Button>(R.id.signInButton)
//
//        signInButton.setOnClickListener {
//            val email = signInEmailField.text.toString().trim()
//            val pass = signInPasswordField.text.toString().trim()
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
//            if (isValid) {
//                val intent = Intent(this, HomeActivity::class.java)
//                startActivity(intent)
//            }
//        }
//    }
//}