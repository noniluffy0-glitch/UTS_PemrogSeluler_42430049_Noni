package com.example.generatorpenilaian3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.generatorpenilaian.R

class PanelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panel)

        val tvSapaan = findViewById<TextView>(R.id.tvSapaan)
        val edtJumlah = findViewById<EditText>(R.id.edtJumlah)
        val edtNilai = findViewById<EditText>(R.id.edtNilai)
        val btnProses = findViewById<Button>(R.id.btnProses)
        val tvStatus = findViewById<TextView>(R.id.tvStatusKelas)
        val tvAbsen = findViewById<TextView>(R.id.tvAbsen)

        val nama = intent.getStringExtra("NAMA_DOSEN")
        tvSapaan.text = "Selamat bertugas, Dosen $nama"

        btnProses.setOnClickListener {
            val jmlStr = edtJumlah.text.toString()
            val nilaiStr = edtNilai.text.toString()

            if (jmlStr.isNotEmpty() && nilaiStr.isNotEmpty()) {
                val jml = jmlStr.toInt()
                val nilai = nilaiStr.toDouble()

                // Logika If-Else (Syarat UTS)
                val status = if (nilai >= 80) "Sangat Baik"
                else if (nilai >= 60) "Cukup"
                else "Kurang"
                tvStatus.text = "Status Kelas: $status"

                // Logika For Loop (Syarat UTS)
                var hasilAbsen = ""
                for (i in 1..jml) {
                    hasilAbsen += "Mahasiswa $i: __________ \n"
                }
                tvAbsen.text = hasilAbsen
            }
        } // Penutup listener
    } // Penutup onCreate
} // Penutup class