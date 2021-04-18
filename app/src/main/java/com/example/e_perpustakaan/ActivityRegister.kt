package com.example.e_perpustakaan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.*
import com.example.e_perpustakaan.model.Akun
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ActivityRegister : AppCompatActivity() {
    lateinit var btnRegister: Button
    lateinit var namaRegister: EditText
    lateinit var emailRegister: EditText
    lateinit var passRegister: EditText
    lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        namaRegister = findViewById(R.id.namaRegister)
        emailRegister = findViewById(R.id.emailRegister)
        passRegister = findViewById(R.id.passRegister)
        btnRegister = findViewById(R.id.btnRegister)

        databaseReference = FirebaseDatabase.getInstance().getReference("Pengguna")
        btnRegister.setOnClickListener {
            addData()
        }
    }

    private fun addData() {
        val nama = namaRegister.text.toString().trim()
        val email = emailRegister.text.toString().trim()
        val password = passRegister.text.toString().trim()
        if (!TextUtils.isEmpty(nama) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)) {
            val add = Akun(nama, email, password)
            databaseReference.child(nama).setValue(add)
            Toast.makeText(this@ActivityRegister, "Data Terkirim", Toast.LENGTH_LONG).show()
            finish()
        }
        else { Toast.makeText(this@ActivityRegister, "Data Masih Kosong", Toast.LENGTH_LONG).show() }
    }
}