package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var aPerson : Person = Person("ali","123456","ali@gmail.com","Jalan 66")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.personData = aPerson

        binding.btnUpdate.setOnClickListener(){
            aPerson.email = "xxx@gmail.com"
            aPerson.address = "Jalan Kin Lam"

            binding.apply { invalidateAll() }
        }
        /*
        binding.textView6.text = aPerson.name
        binding.textView7.text = aPerson.ic
        binding.textView8.text = aPerson.email
        binding.textView9.text = aPerson.address
        */


    }
}