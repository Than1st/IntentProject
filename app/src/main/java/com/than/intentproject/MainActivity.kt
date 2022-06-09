package com.than.intentproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.than.intentproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Intent Tanpa Data
        binding.btnIntentNoData.setOnClickListener {
            val changeActivity = Intent(this, IntentNoDataActivity::class.java)
            startActivity(changeActivity)
        }

        //Intent dengan Data
        binding.btnIntentWithData.setOnClickListener {
            val sendData = Intent(this, IntentWithDataActivity::class.java)
            sendData.putExtra(IntentWithDataActivity.EXTRA_NAMA, "SulthanLR")
            sendData.putExtra(IntentWithDataActivity.EXTRA_UMUR, 18)
            sendData.putExtra(IntentWithDataActivity.EXTRA_TINGGI, 1.5)
            startActivity(sendData)
        }
        
        //Test
        //Intent dengan Bundle
        binding.btnBundle.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("nama", "SulthanLR")
            bundle.putInt("umur", 19)
            bundle.putDouble("tinggi", 1.6)
            val sendBundle = Intent(this, IntentBundleDataActivity::class.java)
            sendBundle.putExtras(bundle)
            startActivity(sendBundle)
        }

        //Intent dengan Serializable
        binding.btnSerializable.setOnClickListener {
            val sendSerializable = Intent(this, IntentSerializableDataActivity::class.java)
            val person = Person("SulthanLR", 20, 1.7)
            sendSerializable.putExtra("person", person)
            startActivity(sendSerializable)
        }

        //Intent dengan Parcelable
        binding.btnParcelable.setOnClickListener {
            val sendParcelable = Intent(this, IntentParcelableDataActivity::class.java)
            val mahasiswa = Mahasiswa("SulthanLR", 21, 1.8)
            sendParcelable.putExtra("mahasiswa", mahasiswa)
            startActivity(sendParcelable)
        }
    }
}
