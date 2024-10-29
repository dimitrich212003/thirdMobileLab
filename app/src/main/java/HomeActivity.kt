//package com.example.activity1
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import android.widget.TextView
//import androidx.activity.enableEdgeToEdge
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class HomeActivity : BaseActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_home)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.signInTitle)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
//        val exitBtn = findViewById<Button>(R.id.exitButton)
//
//        val intent = intent
//        val name = intent.getStringExtra("user")
//        val homeName = findViewById<TextView>(R.id.homeName)
//        homeName.text = name
//
//        exitBtn.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
//    }
//}