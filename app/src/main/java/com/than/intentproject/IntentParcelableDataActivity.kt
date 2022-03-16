package com.than.intentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.than.intentproject.databinding.ActivityIntentParcelableDataBinding

class IntentParcelableDataActivity : AppCompatActivity() {
    lateinit var binding: ActivityIntentParcelableDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentParcelableDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mahasiswa = intent.getParcelableExtra<Mahasiswa>("mahasiswa") as Mahasiswa
        binding.tvNama.text = mahasiswa.nama
        binding.tvUmur.text = mahasiswa.umur.toString()
        binding.tvTinggi.text = mahasiswa.tinggi.toString()
    }
}