package com.example.e_perpustakaan.profil

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.e_perpustakaan.R
import com.example.e_perpustakaan.buku.ActivityView

class FragmentProfil : Fragment() {
    lateinit var menuStruktur: RelativeLayout
    lateinit var judulStruktur: TextView
    lateinit var textStruktur: TextView
    lateinit var menuVisimisi: RelativeLayout
    lateinit var judulVisimisi: TextView
    lateinit var textVisimisi: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profil, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        menuStruktur = activity!!.findViewById(R.id.menuStruktur)
        judulStruktur = activity!!.findViewById(R.id.judulStruktur)
        textStruktur = activity!!.findViewById(R.id.textStruktur)
        menuVisimisi = activity!!.findViewById(R.id.menuVisimisi)
        judulVisimisi = activity!!.findViewById(R.id.judulVisimisi)
        textVisimisi = activity!!.findViewById(R.id.textVisimisi)

        menuStruktur.setOnClickListener {
            val intent = Intent(activity, ActivityProfil::class.java)
            intent.putExtra("isi", textStruktur.text.toString())
            intent.putExtra("judul", judulStruktur.text.toString())
            startActivity(intent)
        }
        menuVisimisi.setOnClickListener {
            val intent = Intent(activity, ActivityProfil::class.java)
            intent.putExtra("isi", textVisimisi.text.toString())
            intent.putExtra("judul", judulVisimisi.text.toString())
            startActivity(intent)
        }
    }
}