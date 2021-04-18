package com.example.e_perpustakaan.buku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.e_perpustakaan.R

class ActivityKelas11 : AppCompatActivity() {
    lateinit var bukuxi1: CardView
    lateinit var bukuxi2: CardView
    lateinit var bukuxi3: CardView

    lateinit var formatBukuxi1: TextView
    lateinit var formatBukuxi2: TextView
    lateinit var formatBukuxi3: TextView

    lateinit var textBukuxi1: TextView
    lateinit var textBukuxi2: TextView
    lateinit var textBukuxi3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelas11)

        bukuxi1 = findViewById(R.id.bukuxi1)
        bukuxi2 = findViewById(R.id.bukuxi2)
        bukuxi3 = findViewById(R.id.bukuxi3)

        formatBukuxi1 = findViewById(R.id.formatBukuxi1)
        formatBukuxi2 = findViewById(R.id.formatBukuxi2)
        formatBukuxi3 = findViewById(R.id.formatBukuxi3)

        textBukuxi1 = findViewById(R.id.textBukuxi1)
        textBukuxi2 = findViewById(R.id.textBukuxi2)
        textBukuxi3 = findViewById(R.id.textBukuxi3)

        bukuxi1.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatBukuxi1.text.toString())
            intent.putExtra("judul", textBukuxi1.text.toString())
            startActivity(intent)
        }
        bukuxi2.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatBukuxi2.text.toString())
            intent.putExtra("judul", textBukuxi2.text.toString())
            startActivity(intent)
        }
        bukuxi3.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatBukuxi3.text.toString())
            intent.putExtra("judul", textBukuxi3.text.toString())
            startActivity(intent)
        }
    }
}