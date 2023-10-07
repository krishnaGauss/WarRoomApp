package com.example.firebaseauth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.fragment.app.Fragment
import com.example.firebaseauth.databinding.ActivityNewsBinding

class News : AppCompatActivity() {

    private lateinit var binding : ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Newsius())

        binding.bottomNavigationView.setOnItemSelectedListener{

            when(it.itemId) {
                R.id.newss -> replaceFragment(Newsius())
                R.id.hacks -> replaceFragment(Hackathonsies())
                R.id.profils -> replaceFragment(Profileus())

                else -> {

                }

            }
            true

        }


    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}