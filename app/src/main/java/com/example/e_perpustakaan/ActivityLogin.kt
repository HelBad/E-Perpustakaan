package com.example.e_perpustakaan

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.e_perpustakaan.model.Akun
import com.google.firebase.database.*

class ActivityLogin : AppCompatActivity() {
    lateinit var alertDialog: AlertDialog.Builder
    lateinit var btnSignin: Button
    lateinit var emailLogin: EditText
    lateinit var passLogin: EditText
    lateinit var textSignup: TextView
    lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        emailLogin = findViewById(R.id.emailLogin)
        passLogin = findViewById(R.id.passLogin)
        btnSignin = findViewById(R.id.btnSignin)
        textSignup = findViewById(R.id.textSignup)
        alertDialog = AlertDialog.Builder(this)
        databaseReference = FirebaseDatabase.getInstance().reference

        textSignup.setOnClickListener {
            val intent = Intent(this, ActivityRegister::class.java)
            startActivity(intent)
        }
        btnSignin.setOnClickListener {
            signinAkun()
        }
    }

    private fun signinAkun() {
        val query = databaseReference.child("Pengguna").orderByChild("email").equalTo(emailLogin.text.toString().trim())
        query.addListenerForSingleValueEvent(object: ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (user in dataSnapshot.children) {
                        val usersBean = user.getValue(Akun::class.java)
                        if (usersBean!!.password == passLogin.text.toString().trim()) {
                            val intent = Intent(applicationContext, ActivityMain::class.java)
                            intent.putExtra("email", emailLogin.text.toString())
                            startActivity(intent)
                        }
                        else { Toast.makeText(this@ActivityLogin, "Password is wrong", Toast.LENGTH_LONG).show() }
                    }
                }
                else { Toast.makeText(this@ActivityLogin, "User not found", Toast.LENGTH_LONG).show() }
            }
            override fun onCancelled(databaseError: DatabaseError) {}
        })
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