package com.example.e_perpustakaan.buku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.e_perpustakaan.R

class ActivityUmum : AppCompatActivity() {
    lateinit var bukuUmum1: CardView
    lateinit var bukuUmum2: CardView
    lateinit var bukuUmum3: CardView
    lateinit var bukuUmum4: CardView
    lateinit var bukuUmum5: CardView
    lateinit var bukuUmum6: CardView
    lateinit var bukuUmum7: CardView
    lateinit var bukuUmum8: CardView
    lateinit var bukuUmum9: CardView
    lateinit var bukuUmum10: CardView
    lateinit var bukuUmum11: CardView
    lateinit var bukuUmum12: CardView
    lateinit var bukuUmum13: CardView
    lateinit var bukuUmum14: CardView
    lateinit var bukuUmum15: CardView
    lateinit var bukuUmum16: CardView

    lateinit var formatUmum1: TextView
    lateinit var formatUmum2: TextView
    lateinit var formatUmum3: TextView
    lateinit var formatUmum4: TextView
    lateinit var formatUmum5: TextView
    lateinit var formatUmum6: TextView
    lateinit var formatUmum7: TextView
    lateinit var formatUmum8: TextView
    lateinit var formatUmum9: TextView
    lateinit var formatUmum10: TextView
    lateinit var formatUmum11: TextView
    lateinit var formatUmum12: TextView
    lateinit var formatUmum13: TextView
    lateinit var formatUmum14: TextView
    lateinit var formatUmum15: TextView
    lateinit var formatUmum16: TextView

    lateinit var textUmum1: TextView
    lateinit var textUmum2: TextView
    lateinit var textUmum3: TextView
    lateinit var textUmum4: TextView
    lateinit var textUmum5: TextView
    lateinit var textUmum6: TextView
    lateinit var textUmum7: TextView
    lateinit var textUmum8: TextView
    lateinit var textUmum9: TextView
    lateinit var textUmum10: TextView
    lateinit var textUmum11: TextView
    lateinit var textUmum12: TextView
    lateinit var textUmum13: TextView
    lateinit var textUmum14: TextView
    lateinit var textUmum15: TextView
    lateinit var textUmum16: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_umum)

        bukuUmum1 = findViewById(R.id.bukuUmum1)
        bukuUmum2 = findViewById(R.id.bukuUmum2)
        bukuUmum3 = findViewById(R.id.bukuUmum3)
        bukuUmum4 = findViewById(R.id.bukuUmum4)
        bukuUmum5 = findViewById(R.id.bukuUmum5)
        bukuUmum6 = findViewById(R.id.bukuUmum6)
        bukuUmum7 = findViewById(R.id.bukuUmum7)
        bukuUmum8 = findViewById(R.id.bukuUmum8)
        bukuUmum9 = findViewById(R.id.bukuUmum9)
        bukuUmum10 = findViewById(R.id.bukuUmum10)
        bukuUmum11 = findViewById(R.id.bukuUmum11)
        bukuUmum12 = findViewById(R.id.bukuUmum12)
        bukuUmum13 = findViewById(R.id.bukuUmum13)
        bukuUmum14 = findViewById(R.id.bukuUmum14)
        bukuUmum15 = findViewById(R.id.bukuUmum15)
        bukuUmum16 = findViewById(R.id.bukuUmum16)

        formatUmum1 = findViewById(R.id.formatUmum1)
        formatUmum2 = findViewById(R.id.formatUmum2)
        formatUmum3 = findViewById(R.id.formatUmum3)
        formatUmum4 = findViewById(R.id.formatUmum4)
        formatUmum5 = findViewById(R.id.formatUmum5)
        formatUmum6 = findViewById(R.id.formatUmum6)
        formatUmum7 = findViewById(R.id.formatUmum7)
        formatUmum8 = findViewById(R.id.formatUmum8)
        formatUmum9 = findViewById(R.id.formatUmum9)
        formatUmum10 = findViewById(R.id.formatUmum10)
        formatUmum11 = findViewById(R.id.formatUmum11)
        formatUmum12 = findViewById(R.id.formatUmum12)
        formatUmum13 = findViewById(R.id.formatUmum13)
        formatUmum14 = findViewById(R.id.formatUmum14)
        formatUmum15 = findViewById(R.id.formatUmum15)
        formatUmum16 = findViewById(R.id.formatUmum16)

        textUmum1 = findViewById(R.id.textUmum1)
        textUmum2 = findViewById(R.id.textUmum2)
        textUmum3 = findViewById(R.id.textUmum3)
        textUmum4 = findViewById(R.id.textUmum4)
        textUmum5 = findViewById(R.id.textUmum5)
        textUmum6 = findViewById(R.id.textUmum6)
        textUmum7 = findViewById(R.id.textUmum7)
        textUmum8 = findViewById(R.id.textUmum8)
        textUmum9 = findViewById(R.id.textUmum9)
        textUmum10 = findViewById(R.id.textUmum10)
        textUmum11 = findViewById(R.id.textUmum11)
        textUmum12 = findViewById(R.id.textUmum12)
        textUmum13 = findViewById(R.id.textUmum13)
        textUmum14 = findViewById(R.id.textUmum14)
        textUmum15 = findViewById(R.id.textUmum15)
        textUmum16 = findViewById(R.id.textUmum16)

        bukuUmum1.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum1.text.toString())
            intent.putExtra("judul", textUmum1.text.toString())
            startActivity(intent)
        }
        bukuUmum2.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum2.text.toString())
            intent.putExtra("judul", textUmum2.text.toString())
            startActivity(intent)
        }
        bukuUmum3.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum3.text.toString())
            intent.putExtra("judul", textUmum3.text.toString())
            startActivity(intent)
        }
        bukuUmum4.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum4.text.toString())
            intent.putExtra("judul", textUmum4.text.toString())
            startActivity(intent)
        }
        bukuUmum5.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum5.text.toString())
            intent.putExtra("judul", textUmum5.text.toString())
            startActivity(intent)
        }
        bukuUmum6.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum6.text.toString())
            intent.putExtra("judul", textUmum6.text.toString())
            startActivity(intent)
        }
        bukuUmum7.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum7.text.toString())
            intent.putExtra("judul", textUmum7.text.toString())
            startActivity(intent)
        }
        bukuUmum8.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum8.text.toString())
            intent.putExtra("judul", textUmum8.text.toString())
            startActivity(intent)
        }
        bukuUmum9.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum9.text.toString())
            intent.putExtra("judul", textUmum9.text.toString())
            startActivity(intent)
        }
        bukuUmum10.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum10.text.toString())
            intent.putExtra("judul", textUmum10.text.toString())
            startActivity(intent)
        }
        bukuUmum11.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum11.text.toString())
            intent.putExtra("judul", textUmum11.text.toString())
            startActivity(intent)
        }
        bukuUmum12.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum12.text.toString())
            intent.putExtra("judul", textUmum12.text.toString())
            startActivity(intent)
        }
        bukuUmum13.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum13.text.toString())
            intent.putExtra("judul", textUmum13.text.toString())
            startActivity(intent)
        }
        bukuUmum14.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum14.text.toString())
            intent.putExtra("judul", textUmum14.text.toString())
            startActivity(intent)
        }
        bukuUmum15.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum15.text.toString())
            intent.putExtra("judul", textUmum15.text.toString())
            startActivity(intent)
        }
        bukuUmum16.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatUmum16.text.toString())
            intent.putExtra("judul", textUmum16.text.toString())
            startActivity(intent)
        }
    }
}