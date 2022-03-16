package com.than.intentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.than.intentproject.databinding.ActivityIntentWithDataBinding

class IntentWithDataActivity : AppCompatActivity() {
    lateinit var binding: ActivityIntentWithDataBinding
    companion object{
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_UMUR = "extra_umur"
        const val EXTRA_TINGGI = "extra_tinggi"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentWithDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvNama.text = intent.getStringExtra(EXTRA_NAMA)
        binding.tvUmur.text = intent.getIntExtra(EXTRA_UMUR, 0).toString()
        binding.tvTinggi.text = intent.getDoubleExtra(EXTRA_TINGGI, 0.0).toString()
    }
}