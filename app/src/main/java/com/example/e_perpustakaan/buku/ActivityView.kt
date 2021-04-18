package com.example.e_perpustakaan.buku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.e_perpustakaan.R
import com.github.barteksc.pdfviewer.PDFView

class ActivityView : AppCompatActivity() {
    lateinit var pdfView: PDFView
    lateinit var toolbarView: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        pdfView = findViewById(R.id.pdfView)
        toolbarView = findViewById(R.id.toolbarView)

        pdfView.fromAsset(intent.getStringExtra("buku")).load()
        toolbarView.title = intent.getStringExtra("judul")
    }
}