package com.example.e_perpustakaan

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.e_perpustakaan.buku.FragmentBuku
import com.example.e_perpustakaan.profil.FragmentProfil
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class ActivityMain : AppCompatActivity() {
    lateinit var alertDialog: AlertDialog.Builder

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId) {
            R.id.profil -> {
                replaceFragment(FragmentProfil())
                return@OnNavigationItemSelectedListener true
            }
            R.id.buku -> {
                replaceFragment(FragmentBuku())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alertDialog = AlertDialog.Builder(this)
        bottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(FragmentProfil())
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.fragmentContainer, fragment)
        fragmentTransition.commit()
    }

    override fun onBackPressed() {
        alertDialog.setTitle("Close Application")
        alertDialog.setMessage("Do you want to close the application ?")
                .setCancelable(false)
                .setPositiveButton("YES", object: DialogInterface.OnClickListener {
                    override fun onClick(dialog: DialogInterface, id:Int) {
                        finishAffinity()
                    }
                })
                .setNegativeButton("NO", object: DialogInterface.OnClickListener {
                    override fun onClick(dialog: DialogInterface, id:Int) {
                        dialog.cancel()
                    }
                }).create().show()
    }
}