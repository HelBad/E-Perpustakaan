package com.example.e_perpustakaan.buku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.e_perpustakaan.R

class ActivityKelas12 : AppCompatActivity() {
    lateinit var bukuxii1: CardView
    lateinit var formatBukuxii1: TextView
    lateinit var textBukuxii1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelas12)

        bukuxii1 = findViewById(R.id.bukuxii1)
        formatBukuxii1 = findViewById(R.id.formatBukuxii1)
        textBukuxii1 = findViewById(R.id.textBukuxii1)

        bukuxii1.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatBukuxii1.text.toString())
            intent.putExtra("judul", textBukuxii1.text.toString())
            startActivity(intent)
        }
    }
}