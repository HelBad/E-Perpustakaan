package com.example.e_perpustakaan.buku

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

class FragmentBuku : Fragment() {
    lateinit var menuKelasx: RelativeLayout
    lateinit var menuKelasxi: RelativeLayout
    lateinit var menuKelasxii: RelativeLayout
    lateinit var menuUmum: RelativeLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_buku, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        menuKelasx = activity!!.findViewById(R.id.menuKelasx)
        menuKelasxi = activity!!.findViewById(R.id.menuKelasxi)
        menuKelasxii = activity!!.findViewById(R.id.menuKelasxii)
        menuUmum = activity!!.findViewById(R.id.menuUmum)

        menuKelasx.setOnClickListener {
            val intent = Intent(activity, ActivityKelas10::class.java)
            startActivity(intent)
        }
        menuKelasxi.setOnClickListener {
            val intent = Intent(activity, ActivityKelas11::class.java)
            startActivity(intent)
        }
        menuKelasxii.setOnClickListener {
            val intent = Intent(activity, ActivityKelas12::class.java)
            startActivity(intent)
        }
        menuUmum.setOnClickListener {
            val intent = Intent(activity, ActivityUmum::class.java)
            startActivity(intent)
        }
    }
}