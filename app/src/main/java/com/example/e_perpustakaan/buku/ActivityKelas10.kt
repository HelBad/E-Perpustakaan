package com.example.e_perpustakaan.buku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.e_perpustakaan.R

class ActivityKelas10 : AppCompatActivity() {
    lateinit var bukux1: CardView
    lateinit var bukux2: CardView
    lateinit var bukux3: CardView
    lateinit var bukux4: CardView
    lateinit var bukux5: CardView
    lateinit var bukux6: CardView
    lateinit var bukux7: CardView

    lateinit var formatBukux1: TextView
    lateinit var formatBukux2: TextView
    lateinit var formatBukux3: TextView
    lateinit var formatBukux4: TextView
    lateinit var formatBukux5: TextView
    lateinit var formatBukux6: TextView
    lateinit var formatBukux7: TextView

    lateinit var textBukux1: TextView
    lateinit var textBukux2: TextView
    lateinit var textBukux3: TextView
    lateinit var textBukux4: TextView
    lateinit var textBukux5: TextView
    lateinit var textBukux6: TextView
    lateinit var textBukux7: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelas10)

        bukux1 = findViewById(R.id.bukux1)
        bukux2 = findViewById(R.id.bukux2)
        bukux3 = findViewById(R.id.bukux3)
        bukux4 = findViewById(R.id.bukux4)
        bukux5 = findViewById(R.id.bukux5)
        bukux6 = findViewById(R.id.bukux6)
        bukux7 = findViewById(R.id.bukux7)

        formatBukux1 = findViewById(R.id.formatBukux1)
        formatBukux2 = findViewById(R.id.formatBukux2)
        formatBukux3 = findViewById(R.id.formatBukux3)
        formatBukux4 = findViewById(R.id.formatBukux4)
        formatBukux5 = findViewById(R.id.formatBukux5)
        formatBukux6 = findViewById(R.id.formatBukux6)
        formatBukux7 = findViewById(R.id.formatBukux7)

        textBukux1 = findViewById(R.id.textBukux1)
        textBukux2 = findViewById(R.id.textBukux2)
        textBukux3 = findViewById(R.id.textBukux3)
        textBukux4 = findViewById(R.id.textBukux4)
        textBukux5 = findViewById(R.id.textBukux5)
        textBukux6 = findViewById(R.id.textBukux6)
        textBukux7 = findViewById(R.id.textBukux7)

        bukux1.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatBukux1.text.toString())
            intent.putExtra("judul", textBukux1.text.toString())
            startActivity(intent)
        }
        bukux2.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatBukux2.text.toString())
            intent.putExtra("judul", textBukux2.text.toString())
            startActivity(intent)
        }
        bukux3.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatBukux3.text.toString())
            intent.putExtra("judul", textBukux3.text.toString())
            startActivity(intent)
        }
        bukux4.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatBukux4.text.toString())
            intent.putExtra("judul", textBukux4.text.toString())
            startActivity(intent)
        }
        bukux5.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatBukux5.text.toString())
            intent.putExtra("judul", textBukux5.text.toString())
            startActivity(intent)
        }
        bukux6.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatBukux6.text.toString())
            intent.putExtra("judul", textBukux6.text.toString())
            startActivity(intent)
        }
        bukux7.setOnClickListener {
            val intent = Intent(this, ActivityView::class.java)
            intent.putExtra("buku", formatBukux7.text.toString())
            intent.putExtra("judul", textBukux7.text.toString())
            startActivity(intent)
        }
    }
}