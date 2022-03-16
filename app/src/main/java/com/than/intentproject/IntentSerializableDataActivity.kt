package com.than.intentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.than.intentproject.databinding.ActivityIntentSerializableDataBinding

class IntentSerializableDataActivity : AppCompatActivity() {
    lateinit var binding: ActivityIntentSerializableDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentSerializableDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val person = intent.getSerializableExtra("person") as Person
        binding.tvNama.text = person.nama
        binding.tvUmur.text = person.umur.toString()
        binding.tvTinggi.text = person.tinggi.toString()
    }
}