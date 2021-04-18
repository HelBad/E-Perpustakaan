package com.example.e_perpustakaan.profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.e_perpustakaan.R
import com.github.barteksc.pdfviewer.PDFView

class ActivityProfil : AppCompatActivity() {
    lateinit var pdfProfil: PDFView
    lateinit var toolbarProfilPerpus: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        pdfProfil = findViewById(R.id.pdfProfil)
        toolbarProfilPerpus = findViewById(R.id.toolbarProfilPerpus)

        pdfProfil.fromAsset(intent.getStringExtra("isi")).load()
        toolbarProfilPerpus.title = intent.getStringExtra("judul")
    }
}