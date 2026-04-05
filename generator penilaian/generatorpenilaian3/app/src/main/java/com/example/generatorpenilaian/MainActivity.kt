package com.example.generatorpenilaian3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.generatorpenilaian.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNama = findViewById<EditText>(R.id.edtNamaDosen)
        val btnMasuk = findViewById<Button>(R.id.btnMasuk)

        btnMasuk.setOnClickListener {
            val nama = edtNama.text.toString()
            if (nama.isNotEmpty()) {
                val intent = Intent(this, PanelActivity::class.java)
                intent.putExtra("NAMA_DOSEN", nama)
                startActivity(intent)
            }
        }
    }
}