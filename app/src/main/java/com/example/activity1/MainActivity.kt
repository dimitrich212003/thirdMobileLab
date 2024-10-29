package com.example.activity1

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.activity1.databinding.ActivityMainBinding

class MainActivity : BaseActivity () {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Загрузка OnboardFragment при старте
        if (savedInstanceState == null) {
            replaceFragment(OnboardFragment.newInstance())
        }
    }

    fun replaceFragment(fragment: Fragment, addToBackStack: Boolean = false) {
        val transaction = supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)

        // Добавляем фрагмент в стек, если это необходимо
        if (addToBackStack) {
            transaction.addToBackStack(null)
        }

        transaction.commit()
    }
}