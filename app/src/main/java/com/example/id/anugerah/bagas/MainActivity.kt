package com.example.id.anugerah.bagas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkButton: Button = findViewById(R.id.check)
        checkButton.setOnClickListener{tampilkan()}
    }

    private fun tampilkan(){
        val pinjaman: TextInputEditText = findViewById(R.id.pinjaman)
        val biayaLayanan = pinjaman.text.toString().toDoubleOrNull()!! * 0.05
        val hasil: TextView = findViewById(R.id.hasilBiayaLayanan)
        hasil.text = "Rp. "+biayaLayanan
    }
}