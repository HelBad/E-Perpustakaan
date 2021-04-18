package com.example.e_perpustakaan.model

class Akun {
    lateinit var nama: String
    lateinit var email: String
    lateinit var password: String

    constructor() {}
    constructor(nama:String, email:String, password:String) {
        this.nama = nama
        this.email = email
        this.password = password
    }
}