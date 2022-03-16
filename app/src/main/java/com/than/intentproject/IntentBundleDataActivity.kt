package com.than.intentproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.than.intentproject.databinding.ActivityIntentBundleDataBinding
import com.than.intentproject.databinding.ActivityMainBinding

class IntentBundleDataActivity : AppCompatActivity() {
    lateinit var binding: ActivityIntentBundleDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityIntentBundleDataBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var bundle = intent.extras
        var name = bundle?.getString("nama")
        var age = bundle?.getInt("umur")
        var height = bundle?.getDouble("tinggi")
        binding.tvNama.text = name
        binding.tvUmur.text = age.toString()
        binding.tvTinggi.text = height.toString()
    }
}